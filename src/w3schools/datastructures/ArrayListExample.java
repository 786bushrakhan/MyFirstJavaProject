package w3schools.datastructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
    public static void main (String [] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Maruti Suzuki");
        cars.add("Swift");
        cars.add(1, "Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        //System.out.println(cars.get(6));
        cars.set(0, "Opel");
        System.out.println(cars);
        cars.remove(4);
        Collections.sort(cars);
        System.out.println(cars);
        System.out.println(cars.size());
        Collections.sort(cars,Collections.reverseOrder());

        for(int i=0; i < cars.size(); i++){
            System.out.print(" " + cars.get(i));
        }
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(22);
        myNumbers.add(56);
        myNumbers.add(78);
        myNumbers.add(90);
        myNumbers.add(8);

        Collections.sort(myNumbers);
        System.out.println(myNumbers);
        System.out.println(myNumbers.contains(90));

        for (int i=0; i < myNumbers.size(); i++){
            System.out.println(myNumbers.get(i));
        }

        Collections.sort(myNumbers,Collections.reverseOrder());
        System.out.println(myNumbers);
    }
}


