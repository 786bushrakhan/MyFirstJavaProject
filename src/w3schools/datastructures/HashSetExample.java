package w3schools.datastructures;

import java.util.HashSet;

public class HashSetExample {
    public static void main (String [] args){
            HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(7);
        numbers.add(8);
        numbers.add(4);
        numbers.add(2);
        numbers.add(39);
        System.out.println(numbers);

        for(int i = 1; i <= 40; i++){
            if(numbers.contains(i)){
                System.out.println(i + " was found in the set.");
            }
            else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
