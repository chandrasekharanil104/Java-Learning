public class RunCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("Mercedes");
        car.setModel("S60");
        car.setColor("Orange");
        car.setDoors(2);
        car.setConvertible(true);

        System.out.println("Make : " + car.getMake());
        System.out.println("doors : " + car.getDoors());

        car.displayCar();
    }
}
