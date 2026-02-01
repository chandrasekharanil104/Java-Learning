package dev.java;

import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args){
//        LinkedList<String> placesToVisit = new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("India");
        placesToVisit.add("Dubai");
        placesToVisit.add(1, "Europe");

        System.out.println(placesToVisit);

        addElements(placesToVisit);

        System.out.println(placesToVisit);
        System.out.println(placesToVisit.get(4));

        placesToVisit.remove(2);

        System.out.println(placesToVisit);

    }

    public static void addElements(LinkedList<String> list){
        list.addFirst("Vijayawada");
        list.addLast("Australia");
    }
}
