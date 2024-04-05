package Model;
public class Model_Customers {
    int customer_id ;
    String name ;
    String contact_number ;
    String address ;
    String email ;
    String password ;

    public Model_Customers() {
    }

    public Model_Customers(int customer_id, String name, String contact_number, String address, String email, String password) {
        this.customer_id = customer_id;
        this.name = name;
        this.contact_number = contact_number;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}
