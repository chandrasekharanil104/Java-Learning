public class PersonalComputer extends ProductClass{
    private ComputerCaseClass computerCaseClass;
    private MotherboardClass motherboardClass;
    private MonitorClass monitorClass;

    public PersonalComputer(String model, String manufacturer, ComputerCaseClass computerCaseClass, MotherboardClass motherboardClass, MonitorClass monitorClass) {
        super(model, manufacturer);
        this.computerCaseClass = computerCaseClass;
        this.motherboardClass = motherboardClass;
        this.monitorClass = monitorClass;
    }

    private void drawPixel(){
        monitorClass.drawPixelAt(10, 10, "green");
    }

    public void powerUp(){
        computerCaseClass.pressPowerButton();
        drawPixel();
    }

//    public ComputerCaseClass getComputerCaseClass() {
//        return computerCaseClass;
//    }
//
//    public MotherboardClass getMotherboardClass() {
//        return motherboardClass;
//    }
//
//    public MonitorClass getMonitorClass() {
//        return monitorClass;
//    }
}
