package dev.java2;

public class Dog extends Animal implements FlightEnabled,Trackable{

    public Dog(String type, String size, double weight){
        super(type, size, weight);
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + " " + type + " is tracking");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " " + type + " is flying");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName() + " " + type + " is taking off");
    }

    @Override
    public void land(){
        System.out.println(getClass().getSimpleName() + " " + type + " is landing");
    }

    @Override
    public void move(String speed) {
        if(speed == "Fast"){
            System.out.println(getClass().getSimpleName() + type + " is running");
        } else {
            System.out.println(getClass().getSimpleName() + type + " is walking");
        }
    }

    @Override
    public void makeSound() {
        if(type ==  "Wolf"){
            System.out.println(getClass().getSimpleName() + "Howling");
        } else {
            System.out.println(getClass().getSimpleName()+ "Woof!");
        }
    }


}
