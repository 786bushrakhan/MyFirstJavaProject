public class LinearSearchExample {
    public static void main (String [] args){
        int [] arr = {79, 56, 28, 69, 68};
        int age = 56;

        for (int i = 0; i < arr.length; i++){
            if (age == arr[i]){
                System.out.println("Given age " + age + " is present in the array at index " + i);
                break;
            }
        }
    }
}
