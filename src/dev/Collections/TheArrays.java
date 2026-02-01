package dev.Collections;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Red";
        colors[1] = "Green";

        System.out.println(colors);
        System.out.println(Arrays.toString(colors));

        for(String color: colors){
            System.out.println(color);
        }

        int[] numbers = {1,2,3,4,5};

        for(int number: numbers){
            System.out.println(number);
        }

        Arrays.stream(numbers).forEach(System.out::println);
    }
}
