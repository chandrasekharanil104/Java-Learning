package dev.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListClass {
    public static void main(String[] args){

        Boolean toggleFlag = true;
         ArrayList<String> groceryList = new ArrayList<>();

         while(toggleFlag) {

             System.out.println("Available Actions : ");
             System.out.println("0 - Shutdown");
             System.out.println("1 - add items to the list");
             System.out.println("2 - remove items from the list");
             System.out.println("Enter a number for which action you want to do : ");

             Scanner scanner = new Scanner(System.in);
             String input = scanner.nextLine();

             switch (input) {
                 case "0":
                     toggleFlag = false;
                     groceryList.sort(Comparator.naturalOrder());
                     System.out.println("Final List is : " + groceryList);
                     break;

                 case "1":
                     System.out.println("Enter the item you want to add : ");
                     Scanner groceryScanner = new Scanner(System.in);
                     String groceryItem = groceryScanner.nextLine();

                     groceryList.add(groceryItem);

                     System.out.println("ITEM ADDED IS : " + groceryItem + " AND LIST IS : " + groceryList);
                     break;

                 case "2":
                     System.out.println("Enter the item you want to remove : ");
                     Scanner removeScanner = new Scanner(System.in);
                     String removeItem = removeScanner.nextLine();

                     if(groceryList.contains(removeItem)){
                         int removeIndex = groceryList.indexOf(removeItem);

                         groceryList.remove(removeIndex);
                         System.out.println("Removed Item is : " + removeItem + " and new list is : " + groceryList);
                     }
                     break;

                 default:
                     System.out.println("TRY AGAIN!");

             }
         }


    }
}
