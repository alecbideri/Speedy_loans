package DAO;
import Model.Model_Users;
import java.util.List;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class D_USERS {
    
    String url = "jdbc:mysql://localhost:3306/loan";
    String username = "root";
    String pass_word = "Alecb200@.";
    
    
    public boolean is_user_id_exists(String user_id){
        
        boolean exists = false ;
        
        try {
            
            Connection con = DriverManager.getConnection(url , username , pass_word);
            String sql_select = "select user_id from users where user_id = ?";
            PreparedStatement st = con.prepareStatement(sql_select);
            
            st.setString(1, user_id);
            
            ResultSet rs = st.executeQuery();
            exists = rs.next();
            
            rs.close();
            st.close();
            con.close ();
            
            
            
        }catch (Exception e){
            e.printStackTrace();
       }
        
        return exists;
    }
    
    
public void create_user(Model_Users obj){
    try {
        Connection con = DriverManager.getConnection(url, username, pass_word);
        String sql_insert = "INSERT INTO users(user_id, username, email, role, password) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement st = con.prepareStatement(sql_insert);

        st.setString(1, obj.getUser_id());
        st.setString(2, obj.getUser_name());
        st.setString(3, obj.getEmail());
        st.setString(4, obj.getRole());
        st.setString(5, obj.getPassword());

        int check = st.executeUpdate();

        if (check > 0) {
            JOptionPane.showMessageDialog(null, "User registered successfully");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to register user");
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

// In D_USERS.java

    public boolean check_login(String user_id, String pass) {
        boolean isValid = false;
        try {
            Connection con = DriverManager.getConnection(url, username,pass_word);
            String sql_select = "SELECT * FROM users WHERE user_id = ? AND password = ?";
            PreparedStatement st = con.prepareStatement(sql_select);
            st.setString(1, user_id);
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
    
        public List<Model_Users> display_users(){
        
        List <Model_Users> users = new ArrayList<>();
        try {
            
            Connection con = DriverManager.getConnection(url , username , pass_word);
            String select_all = "select * from users";
            PreparedStatement st = con.prepareStatement(select_all);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                Model_Users user  = new Model_Users();
                
                user.setUser_id(rs.getString("user_id"));
                user.setUser_name(rs.getString("username"));
                user.setEmail(rs.getString("email"));
                user.setRole(rs.getString("role"));
                user.setPassword(rs.getString("password"));
                  
                
                users.add(user);
               
            }
        
        }catch (Exception e){
            e.printStackTrace();
        }
        
        return users ;
    }
        
       public void delete_user(String user_id) {
            try {
                Connection con = DriverManager.getConnection(url, username, pass_word);
                String delete_query = "DELETE FROM users WHERE user_id = ?";
                PreparedStatement st = con.prepareStatement(delete_query);
                st.setString(1, user_id);
                int rowsDeleted = st.executeUpdate();
                if (rowsDeleted > 0) {
                    System.out.println("User deleted successfully.");
                }
            } catch (Exception e) {
                e.printStackTrace();
        }
    }
       
           public void update_user(String user_id, String name, String email, String role, String password) {
                try {
                    Connection con = DriverManager.getConnection(url, username, password);
                    String update_query = "UPDATE users SET username=?, email=?, role=?, password=? WHERE user_id=?";
                    PreparedStatement st = con.prepareStatement(update_query);
                    st.setString(1, name);
                    st.setString(2, email);
                    st.setString(3, role);
                    st.setString(4, password);
                    st.setString(5, user_id);

                    int rowsUpdated = st.executeUpdate();
                    if (rowsUpdated > 0) {
                        System.out.println("User updated successfully.");
                    }
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
    }
           
            public String getUsername(String user_id) {
            String user_name = "";
            try {
                Connection con = DriverManager.getConnection(url, username, pass_word);
                String sql_select = "SELECT username FROM users WHERE user_id = ?";
                PreparedStatement st = con.prepareStatement(sql_select);
                st.setString(1, user_id);
                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    user_name = rs.getString("username");
                }
                rs.close();
                st.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return user_name;
        }

}
