public class ProductClass {
    private String model;
    private String manufacturer;
    private int height;
    private int width;
    private int depth;

    public ProductClass(String model, String manufacturer){
        this.model = model;
        this.manufacturer = manufacturer;
    }

}

class MonitorClass extends ProductClass{
    private int size;
    private String resolution;


    public MonitorClass(String model, String manufacturer){
        super(model, manufacturer);
    }

    public MonitorClass(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d, %d in color %s", x , y, color));
    }
}

class MotherboardClass extends ProductClass{

    private int ramSlots;
    private int cardSlots;
    private String bios;


    public MotherboardClass(String model, String manufacturer){
        super(model, manufacturer);
    }

    public MotherboardClass(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void programName(String programName){
        System.out.println("Program " + programName + " is loading... ");
    }
}

class ComputerCaseClass extends ProductClass{

    private String powerSupply;

    public ComputerCaseClass(String model, String manufacturer){
        super(model, manufacturer);
    }

    public ComputerCaseClass(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }
}
