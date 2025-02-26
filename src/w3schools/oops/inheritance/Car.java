package w3schools.oops.inheritance;
class Vehicle{
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut, tuut!");
    }
}
public class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main (String [] args){
        Car obj = new Car();
        obj.honk();
        System.out.println(obj.brand + " " + obj.modelName);
    }
}
