package dev.Collections;

import java.util.ArrayList;
import java.util.List;

public class TheLists {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("red");
       colors.add("white");

        System.out.println(colors.size());
        System.out.println("HERE : " + colors.get(0));

        for(String color: colors){
            System.out.println(color);
        }

        System.out.println(colors);
    }
}
