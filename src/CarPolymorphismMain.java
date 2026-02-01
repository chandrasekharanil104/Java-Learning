public class CarPolymorphismMain {
    public static void main(String[] args){
        CarPolymorphism car = new GasPoweredCar("Tesla", 50.32, 4);

        car.drive();
        car.runEngine();
    }
}
