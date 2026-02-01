public class ComputerMain {
    public static void main(String[] args){
        ComputerCaseClass theCase = new ComputerCaseClass("2208", "Dell", "240");
        MonitorClass theMonitor = new MonitorClass("27 inch beast", "alienware", 27, "1920X1080");
        MotherboardClass theMotherboard = new MotherboardClass("BJ-200", "ASUS", 4, 6,  "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell", theCase, theMotherboard, theMonitor);

//        thePC.getMonitorClass().drawPixelAt(10, 10, "red");
//        thePC.getMotherboardClass().programName("Windows OS");
//        thePC.getComputerCaseClass().pressPowerButton();

        thePC.powerUp();
    }

}
