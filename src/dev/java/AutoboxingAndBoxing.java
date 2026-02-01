package dev.java;

import java.util.Arrays;

public class AutoboxingAndBoxing {
    public static void main(String[] args){

        int valueInt = 10;

        System.out.println("primitiveValue is primitive: " + int.class.isPrimitive());

        Integer valueInteger = Integer.valueOf(15);

        System.out.println(valueInteger instanceof Integer ? "true" : "false");

        int unboxedValue = valueInteger;
        System.out.println(unboxedValue);
        System.out.println(valueInteger);

        Integer[] wrapperValue = new Integer[5];
        wrapperValue[0]  = 25;
        System.out.println(Arrays.toString(wrapperValue));
    }
}
