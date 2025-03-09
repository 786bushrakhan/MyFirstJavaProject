public class MaxElement {
    public static void main(String[] args) {
        int[] ages = {46, 37, 68, 99, 42};
        int maximum = ages[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > maximum)
                maximum = ages[i];
        }
        System.out.println(maximum);
    }
}


