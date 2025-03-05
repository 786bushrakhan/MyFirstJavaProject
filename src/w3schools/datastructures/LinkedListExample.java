package w3schools.datastructures;

import datastructures.linkedlist.MyLinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main (String [] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(4));
        System.out.println(cars.size());

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
