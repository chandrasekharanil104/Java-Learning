package dev.java;

import java.util.Arrays;
import java.util.Random;

public class EnumExplanation {
    public static void main(String[] args){
        DaysOfTheWeek weekDay = DaysOfTheWeek.TUESDAY;
        System.out.println("Week of the day is : " + weekDay);

        for(int i = 0; i < 10; i++){
            weekDay = getRandomDay();
            System.out.printf("Week of the day is : %s and its ordinal value is : %d%n", weekDay, weekDay.ordinal());
        }

    }

    public static DaysOfTheWeek getRandomDay(){
        int randomInteger = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();

        System.out.println("what does allDays look like : " + Arrays.toString(DaysOfTheWeek.values()));

        return allDays[randomInteger];
    }
}
