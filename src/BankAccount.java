public class BankAccount {
    private long accNumber;
    private long accBalance;
    private String customerName;
    private String email;
    private long phoneNumber;

    public BankAccount(){
        System.out.println("Empty Constructor Called!!");
    }

    public BankAccount(long accNumber, long accBalance, String customerName, String email, long phoneNumber){
        System.out.println("Constructor with parameters called");
        this.accNumber = accNumber;
        this.accBalance = accBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public long getAccNumber(){
        return accNumber;
    }

    public long getAccBalance(){
        return accBalance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmail(){
        return email;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccNumber(long accNumber){
        this.accNumber = accNumber;
    }

    public void setAccBalance(long accBalance){
        this.accBalance = accBalance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public long depositFunds(long amount){
        this.accBalance = this.accBalance + amount;
        return this.accBalance;
    }

    public long withdrawFunds(long amount){
        if(this.accBalance > amount) {
            this.accBalance = this.accBalance - amount;
        } else {
            System.out.println("LOW BALANCE!! -- Not allowed to withdraw funds");
        }
        return this.accBalance;
    }

}
