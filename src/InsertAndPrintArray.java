public class InsertAndPrintArray {
    public static void main(String [] args){
        int [] a = new int[10];
        for(int i = 0; i < a.length; i++){
            a[i] = i + 10;
            System.out.println(a[i]);
        }

        for(int i =0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
