package dev.java;

public class LinkedListTutorialTwo {
    public String cityName;
    private double distanceInMiles;

    public LinkedListTutorialTwo(String cityName, double distanceInMiles){
        this.cityName = cityName;
        this.distanceInMiles = distanceInMiles;
    }

    public String getCityName(){
        return cityName;
    }

    public double getDistanceInMiles(){
        return distanceInMiles;
    }

    public static void main(String[] args){

    }
}
