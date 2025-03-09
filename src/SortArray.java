import java.util.Arrays;
public class SortArray {
    public static void main (String [] args){
        String [] cars = {"BMW", "Volvo", "Audi", "Toyota", "Mazda", "Swift", "Ford", "Tesla", "Fiat"};
        Arrays.sort(cars);

        for (int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        for (String i : cars) {
            System.out.println(i);

        }
    }
}
