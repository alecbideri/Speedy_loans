package Model;
public class Model_Loan {
    int loan_id ;
    int customer_id ;
    double loan ;
    double interest_rate ;
    int duration ;
    String status ;
    double payback ;
    double payback_month ;
    String customer_name ;

    public Model_Loan() {
    }

    public Model_Loan(int loan_id, int customer_id, double loan, double interest_rate, int duration, String status, double payback, double payback_month, String customer_name) {
        this.loan_id = loan_id;
        this.customer_id = customer_id;
        this.loan = loan;
        this.interest_rate = interest_rate;
        this.duration = duration;
        this.status = status;
        this.payback = payback;
        this.payback_month = payback_month;
        this.customer_name = customer_name;
    }

    public int getLoan_id() {
        return loan_id;
    }

    public void setLoan_id(int loan_id) {
        this.loan_id = loan_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }


    
}

