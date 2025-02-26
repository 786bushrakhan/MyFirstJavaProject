package w3schools.oops;

public class Main {
    int x = 5;
    int y;

    public Main (int y){
        this.y = y;

    }

    public Main (){

    }

    public static void main(String[] args) {

        Main myObj = new Main();
        Main myObj1 = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj1.x);

        myObj1.x = 25;

        System.out.println(myObj.x);
        System.out.println(myObj1.x);

        myObj.x = 34;

        System.out.println(myObj.x);
        System.out.println(myObj1.x);

        Main myObj2 = new Main(7);
        System.out.println(myObj2.y);
        System.out.println(myObj2.x);

        Car obj = new Car();
        System.out.println(obj.getWeight());
        obj.setWeight(500);
        obj.setColor("Blue");
        System.out.println(obj.getColor());
        System.out.println(obj.getWeight());
    }
}
