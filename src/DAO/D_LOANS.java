package DAO;
import java.util.List;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import Model.Model_Loan;
public class D_LOANS {
    
    String url = "jdbc:mysql://localhost:3306/loan";
    String username = "root";
    String password = "Alecb200@.";
    
public void record_loan(Model_Loan obj, String customerName) {
    try {
        Connection con = DriverManager.getConnection(url, username, password);
        
        // Query to retrieve the customer ID based on the customer name
        String sql_customer_id = "SELECT customer_id FROM customers WHERE name = ?";
        PreparedStatement pst = con.prepareStatement(sql_customer_id);
        pst.setString(1, customerName);
        ResultSet rs = pst.executeQuery();
        
        int customer_id = 0;
        if (rs.next()) {
            customer_id = rs.getInt("customer_id");
        } else {
            // Customer name not found
            JOptionPane.showMessageDialog(null, "Customer not found");
            return;
        }
        
        // Prepare the insert statement for the loan record
        String sql_insert = "INSERT INTO loans(customer_id, loan, interest_rate, duration, status, payback_amount, payback_month) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement st = con.prepareStatement(sql_insert);

        st.setInt(1, customer_id);
        st.setDouble(2, obj.getLoan());
        st.setDouble(3, obj.getInterest_rate());
        st.setInt(4, obj.getDuration());
        st.setString(5, obj.getStatus());
        st.setDouble(6, obj.getPayback());
        st.setDouble(7, obj.getPayback_month());

        int check = st.executeUpdate();

        if (check > 0) {
            JOptionPane.showMessageDialog(null, "Loan recorded successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to record the loan!");
        }

        st.close();
        con.close();
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Database error");
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Server error");
    }
}

       
        public List<Model_Loan> display_loan(){

            List <Model_Loan> loans = new ArrayList<>();
            try {

                Connection con = DriverManager.getConnection(url , username , password);
                String select_all = "SELECT loans.loan_id, customers.name, loans.loan, loans.interest_rate, loans.duration, loans.status, loans.payback_amount, loans.payback_month from loans inner join customers on loans.customer_id = customers.customer_id ";
                PreparedStatement st = con.prepareStatement(select_all);
                ResultSet rs = st.executeQuery();

                while(rs.next()){

                    Model_Loan loan  = new Model_Loan();

                    loan.setLoan_id(rs.getInt("loan_id"));
                    loan.setCustomer_name(rs.getString("name"));
                    loan.setLoan(rs.getDouble("loan"));
                    loan.setInterest_rate(rs.getDouble("interest_rate"));
                    loan.setDuration(rs.getInt("duration"));
                    loan.setPayback(rs.getDouble("payback_amount"));
                    loan.setPayback_month(rs.getDouble("payback_month"));
                    loan.setStatus(rs.getString("status"));

                    loans.add(loan);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return loans ;
         }         
        
     
      public List<String> getCustomerNames() {
       List<String> customerNames = new ArrayList<>();
       try {
           Connection con = DriverManager.getConnection(url, username, password);
           String selectQuery = "SELECT name FROM customers";
           PreparedStatement st = con.prepareStatement(selectQuery);
           ResultSet rs = st.executeQuery();

           while (rs.next()) {
               String customerName = rs.getString("name");
               customerNames.add(customerName);
           }
       } catch (SQLException e) {
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Database error");
       }
       return customerNames;
   }
          public Model_Loan get_by_id(int loan_id) {
            Model_Loan loan = null;
            String sql = "SELECT l.loan_id, l.customer_id, c.name, l.loan, l.duration, l.interest_rate, l.payback_amount, l.payback_month, l.status "
                       + "FROM loans l "
                       + "INNER JOIN customers c ON l.customer_id = c.customer_id "
                       + "WHERE l.loan_id = ?";

            try (Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setInt(1, loan_id);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        loan = new Model_Loan();
                        loan.setLoan_id(rs.getInt("loan_id"));
                        loan.setCustomer_id(rs.getInt("customer_id"));
                        loan.setCustomer_name(rs.getString("name"));
                        loan.setLoan(rs.getDouble("loan"));
                        loan.setDuration(rs.getInt("duration"));
                        loan.setInterest_rate(rs.getDouble("interest_rate"));
                        loan.setPayback(rs.getDouble("payback_amount"));
                        loan.setPayback_month(rs.getDouble("payback_month"));
                        loan.setStatus(rs.getString("status"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return loan;
    }
          
      public void delete_loan(int loan_id) {
            try {
                Connection con = DriverManager.getConnection(url, username, password);
                String delete_query = "DELETE FROM loans WHERE loan_id = ?";
                PreparedStatement st = con.prepareStatement(delete_query);
                st.setInt(1, loan_id);
                int rowsDeleted = st.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("User deleted successfully.");
                }
            } catch (Exception e) {
                e.printStackTrace();
        }
    } 
      
      

    public void update_loan(int loan_id, double loanAmount, double interestRate, int duration, double paybackAmount, double paybackMonth) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String update_query = "UPDATE loanS SET loan=?, interest_rate=?, duration=?, payback_amount=?, payback_month=? WHERE loan_id=?";
            PreparedStatement st = con.prepareStatement(update_query);


            st.setDouble(1, loanAmount);
            st.setDouble(2, interestRate);
            st.setInt(3, duration);
            st.setDouble(4, paybackAmount);
            st.setDouble(5, paybackMonth);
            st.setInt(6, loan_id);

            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Loan updated successfully.");
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
       public int count_loans() {
        int count = 0;
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql_query = "SELECT COUNT(*) FROM loans";
            PreparedStatement st = con.prepareStatement(sql_query);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Server error");
        }
        return count;
    }
}
