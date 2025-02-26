package w3schools.oops;

public class Person {
    String firstName = "Bushra";
    String lastName = "Khan";
    int age = 28;

    public static void main (String [] args){
        Person obj = new Person();
        System.out.println("FirstName is " + obj.firstName + " " + "LastName is " + obj.lastName);
        System.out.println("Age is " + " " + obj.age);

        Person obj1 = new Person();
        obj1.firstName = "Heena";
        System.out.println(obj1.firstName);
    }
}
