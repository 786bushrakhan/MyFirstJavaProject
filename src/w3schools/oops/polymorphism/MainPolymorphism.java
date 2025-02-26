package w3schools.oops.polymorphism;

public class MainPolymorphism {
    public static void main (String [] args){
        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();
        Cat cat = new Cat();

        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
        cat.animalSound();
    }
}

class Animal{
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The Pig says: wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The Dog says: bow bow");
    }
}

class Cat extends Animal{
    public void animalSound(){
        System.out.println("The Cat says: meow meow");
    }
}


