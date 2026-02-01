public class SalariedEmployee extends EmployeeClass{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String endDate, long employee, String hireDate, double annualSalary, boolean isRetired){
        super(name, birthDate, endDate, employee, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", hireDate='" + hireDate + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }

    public void retire(){
        if(Integer.parseInt(endDate) - Integer.parseInt(hireDate) > 60){
            System.out.println("retired");
        } else {
            System.out.println("Not Yet");
        }
    }
}
