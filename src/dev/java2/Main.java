package dev.java2;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Wolf", "Large", 1.0);

        FlightEnabled flier = dog;

//        flier.takeOff();
//        flier.fly();
//        flier.land();

        inFlight(flier);

    }

    public static void AnimalSomething(Animal animal){
        animal.makeSound();
        animal.move("Fast");
    }

    public static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracker){
            tracker.track();
        }
        flier.land();
    }
}
