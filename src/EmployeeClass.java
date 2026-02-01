public class EmployeeClass extends WorkerClass{
    private long employee;
    protected String hireDate;

    public EmployeeClass(String name, String birthDate, String endDate, long employee, String hireDate){
//        super("Monkey D Luffy", "April 1st", "2050");
        super(name, birthDate, endDate);
        this.employee = employee;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmployeeClass{" +
                "employee=" + employee +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
