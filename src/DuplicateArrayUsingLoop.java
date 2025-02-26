public class DuplicateArrayUsingLoop {
    public static void main (String [] args){
        int[] input = {10, 20, 56, 78, 90};
        int[] output = input;

        for(int i = 0; i < input.length; i++){
            System.out.println(input[i] + " " + output[i]);
        }

    }
}
