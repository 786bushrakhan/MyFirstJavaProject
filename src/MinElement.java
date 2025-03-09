public class MinElement {
    public static void main(String[] args) {
        int[] ages = {46, 37, 68, 99, 42};
        int minimum = ages[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > minimum) {
                minimum = ages[i];
            }
        }
        System.out.println(minimum);
    }
}

