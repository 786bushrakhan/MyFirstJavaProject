public class SumOfArray {
    public static void main(String[] args) {
        int[] a = {45,67,45,56,78};
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
          System.out.println("Sum of an Array is " +sum);
    }
}