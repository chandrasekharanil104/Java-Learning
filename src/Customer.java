public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String email(){
        return email;
    }

    public Customer(String name, double creditLimit, String email){
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(){
        this("Tim", 1000, "Tim@tim.com");
    }

    public Customer(String name, String email){
        this();
    }
}
