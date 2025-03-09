public class AverageOfAges {
    public static void main(String[] args){
        int[] ages = {35,45,55,65,75,85,95,25,91};
        int sum = 0;

        for (int i = 0; i < ages.length; i++){
            sum = sum + ages[i];
        }
        System.out.println(sum);
        int average = sum / ages.length;
        System.out.println(average);
    }
}
