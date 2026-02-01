public class CarPolymorphism {
    private String description;

    public CarPolymorphism(String description){
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Start Engine Method getting called from CarPolyMorphism class");
    }

    public void drive(){
        System.out.println("Drive method getting called from CarPolyMorphism class" + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine(){
        System.out.println("Run Engine getting called from CarPolyMorphism class");
    }
}

class GasPoweredCar extends CarPolymorphism{

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Vroom Vroom " + getClass().getSimpleName());
    }

    @Override
    public void startEngine() {
//        super.startEngine();
        System.out.println("Vroom Vroom again");
    }

    @Override
    protected void runEngine() {
//        super.runEngine();
        System.out.println("Vroom Vroom again and again");
    }
}
