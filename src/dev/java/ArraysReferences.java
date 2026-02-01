package dev.java;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String item, int count){
    public GroceryItem(String name){
        this(name, "Dairy", 1);
    }
}

public class ArraysReferences {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("oranges", "PRODUCE", 6);
        groceryArray[2] = "5 apples";

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("condensedMilk"));
        objectList.add("normalMilk");

        System.out.println(objectList);

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("banana"));
        groceryList.add(new GroceryItem("curd"));
        groceryList.add(new GroceryItem("pineapple", "PRODUCE", 2));
        groceryList.add(0, new GroceryItem("muskmelon", "PRODUCE", 3));
        groceryList.remove(2);
        System.out.println(groceryList);
    }
}
