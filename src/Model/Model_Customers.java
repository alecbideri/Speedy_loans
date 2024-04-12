package Model;
public class Model_Customers {
    int customer_id ;
    String name ;
    String contact_number ;
    String address ;
    String email ;
    String password ;
    double payback ;
    double payback_month ;
    double loan ;
    double interest_rate ;
    int duration ;

    public Model_Customers() {
    }

    public Model_Customers(int customer_id, String name, String contact_number, String address, String email, String password, double payback, double payback_month, double loan, double interest_rate, int duration) {
        this.customer_id = customer_id;
        this.name = name;
        this.contact_number = contact_number;
        this.address = address;
        this.email = email;
        this.password = password;
        this.payback = payback;
        this.payback_month = payback_month;
        this.loan = loan;
        this.interest_rate = interest_rate;
        this.duration = duration;
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

    public double getPayback() {
        return payback;
    }

    public void setPayback(double payback) {
        this.payback = payback;
    }

    public double getPayback_month() {
        return payback_month;
    }

    public void setPayback_month(double payback_month) {
        this.payback_month = payback_month;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

  
    
}
