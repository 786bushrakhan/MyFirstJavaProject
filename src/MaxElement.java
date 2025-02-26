public class MaxElement {
    public static void main(String [] args){
        int[] arr = {12, 11, 9, 7, 10, 68};
        int maximum = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (maximum < arr[i]){
                maximum = arr[i];
            }
        }
        System.out.println(maximum);
    }
}
