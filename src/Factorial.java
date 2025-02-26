public class Factorial {
    public static void main(String [] args){
        int num = 6;
        int fact = 1;

        // A factorial is the multiplication of all numbers between 1 and a given number.

        for (int i = num; i > 1; i--){
            fact = i * fact;
        }
        System.out.println(fact);

    }
}