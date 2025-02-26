import java.sql.SQLOutput;

public class SwapVariable {
    public static void main(String [] args){
        int a = 10;
        int b = 20;
        int c;

        c = a;
        a = b;
        b = c; // With Using third variable

        System.out.println("Value of variable a after Swapping is " + a);
        System.out.println("Value of variable b after Swapping is " + b);

        int x = 20;
        int y = 40;

        x = x + y;
        y = x - y;
        x = x - y; // Without using third variable

        System.out.println("Value of x after Swapping without third variable is " + x);
        System.out.println("Value of y after Swapping without third variable is " + y);

    }

}

