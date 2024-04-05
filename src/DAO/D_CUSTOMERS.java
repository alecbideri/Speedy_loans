package DAO;
import java.util.List;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import Model.Model_Customers;
public class D_CUSTOMERS {
    String url = "jdbc:mysql://localhost:3306/loan";
    String username = "root";
    String password = "Alecb200@.";
    
    
    public void create_customer(Model_Customers obj){
    try {
        Connection con = DriverManager.getConnection(url, username, password);
        String sql_insert = "INSERT INTO customers(name , email , address , contact_number,password) VALUES (?, ?, ?, ?,?)";
        PreparedStatement st = con.prepareStatement(sql_insert);

        st.setString(1, obj.getName());
        st.setString(2, obj.getEmail());
        st.setString(3, obj.getAddress());
        st.setString(4, obj.getContact_number());
        st.setString(5, obj.getPassword());

        int check = st.executeUpdate();

        if (check > 0) {
            JOptionPane.showMessageDialog(null, "Customer registered successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to register customer");
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
    
    public List<Model_Customers> display_customers(){
        
        List <Model_Customers> customers = new ArrayList<>();
        try {
            
            Connection con = DriverManager.getConnection(url , username , password);
            String select_all = "select * from customers";
            PreparedStatement st = con.prepareStatement(select_all);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                Model_Customers customer  = new Model_Customers();
                
                customer.setCustomer_id(rs.getInt("customer_id"));
                customer.setName(rs.getString("name"));
                customer.setAddress(rs.getString("address"));
                customer.setEmail(rs.getString("email"));
                customer.setContact_number(rs.getString("contact_number"));
                
                customers.add(customer);
               
            }
        
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return customers ;
    }
    
    
     public void delete_customer(int customer_id) {
            try {
                Connection con = DriverManager.getConnection(url, username, password);
                String delete_query = "DELETE FROM customers WHERE customer_id = ?";
                PreparedStatement st = con.prepareStatement(delete_query);
                st.setInt(1, customer_id);
                int rowsDeleted = st.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("customer deleted successfully.");
                }
            } catch (Exception e) {
                e.printStackTrace();
        }
    }
     
      public void update_customer(int customer_id, String name, String email, String address, String contact) {
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String update_query = "UPDATE customers SET name=?, email=?, address=?, contact_number=? WHERE customer_id=?";
            PreparedStatement st = con.prepareStatement(update_query);
            st.setString(1, name);
            st.setString(2, email);
            st.setString(3, address);
            st.setString(4, contact);
            st.setInt(5, customer_id);
            int rowsUpdated = st.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("User updated successfully.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
      
      public int count_customers() {
        int count = 0;
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            String sql_query = "SELECT COUNT(*) FROM customers";
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
      
      
       public boolean check_login_customer(String email, String pass) {
        boolean isValid = false;
        try {
            Connection con = DriverManager.getConnection(url, username,password);
            String sql_select = "SELECT * FROM customers WHERE email = ? AND password = ?";
            PreparedStatement st = con.prepareStatement(sql_select);
            st.setString(1, email);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            isValid = rs.next(); // If a row is returned, the user with the provided user_id and password exists
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Sevrer error");
        }
        return isValid;
    }

}


