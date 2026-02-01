public class WorkerMainClass {
    @Override
    public String toString() {
        return "WorkerMainClass{}";
    }

    public static void main(String[] args){
        WorkerClass zoro = new WorkerClass("Zoro", "April 10", "NA");

        System.out.println(zoro);

       // EmployeeClass luffy = new EmployeeClass(32567, "1995");
        SalariedEmployee luffy = new SalariedEmployee("Luffy", "1995", "2050", 8487236, "2025", 250000, false);



        System.out.println(luffy);
        luffy.retire();
    }
}
