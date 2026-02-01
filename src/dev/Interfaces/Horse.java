package dev.Interfaces;

public class Horse implements Animal, Pet{
    public Horse(){
        System.out.println("Horse Created");
    }

    @Override
    public void makeNoise(){
        System.out.println("Hee-Hawww");
    }

    @Override
    public void movementSpeed(){
        System.out.println("Horses can run up to 55 mph");
    }

    @Override
    public void play(){
        System.out.println("The horse is playing in the field");
    }

}
