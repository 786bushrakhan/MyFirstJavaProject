package w3schools.oops;

public class Car {
    private int weight;
    private String color;

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        this.weight = weight;

    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public static void main(String[] args) {

        Car volvo = new Car();
        Car audi = new Car();
        Car toyota = new Car();
    }

    void drive() {
        System.out.println("Drive");
    }

    void brake() {
        System.out.println("Brake");
    }
}
