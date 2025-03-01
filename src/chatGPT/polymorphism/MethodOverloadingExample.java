package chatGPT.polymorphism;

public class MethodOverloadingExample {
    public static void main (String [] args){
        MathOperations math = new MathOperations();
        System.out.println("Sum of 2 numbers: " + math.add(8, 45));
        System.out.println("Sum of 3 numbers: " + math.add(75, 45, 93));
        System.out.println("Sum of 2 double numbers: " + math.add(6.9, 4.3));
        System.out.println(math.add(5.5, 6));
        System.out.println(math.add(4, 6, 9, 6));
    }
}

class MathOperations {
     int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c, int d){
         return a + b + c + d;
    }

    int add(int a, int b, int c){
         return a + b + c;
    }

    double add(double a, double b){
         return a + b;
    }

    double add(double a, int b){
         return a + b;
    }
}
