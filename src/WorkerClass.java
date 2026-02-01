import java.time.LocalDate;

public class WorkerClass {
    private String name;
    private String birthDate;
    protected String endDate;

    public WorkerClass(){

    }

    public WorkerClass(String name, String birthDate, String endDate){
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        int currentYear = LocalDate.now().getYear();
        return  currentYear - Integer.parseInt(birthDate);
    }

    public double collectPay(){
        return 25000;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "WorkerClass{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
