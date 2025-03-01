public class FibonacciSeries {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int temp;
        int num = 7;

        // The sum of preceeding two numbers

        for (int i = 0; i < num; i++) {
            System.out.println(first);
            temp = first + second;
            first = second;
            second = temp;
        }
    }
}

