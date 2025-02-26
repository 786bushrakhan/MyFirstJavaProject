package w3schools.oops.abstraction;

public class AbstractionProgram {
    public static void main (String [] args){
        Cat cat = new Cat();
        cat.sleep();
        cat.animalSound();
    }
}

abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzzz");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The Cat says: meow meow");
    }
}

