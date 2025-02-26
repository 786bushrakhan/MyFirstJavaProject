public class MinElement {
    public static void main(String [] args){
        int[] arr = {12, 11, 9, 7, 10};
        int minimum = arr[0];

        for (int i = 1; i < 5; i++){
            if (minimum > arr[i]){
                minimum = arr[i];
            }
        }
        System.out.println(minimum);
    }
}
