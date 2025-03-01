package chatGPT.polymorphism;

public class MethodOverridingExample {
    public static void main (String [] args){
        Animal animal;

        animal = new Cat();
        animal.sound();
        animal = new Dog();
        animal.sound();
        animal = new Animal();
        animal.sound();
        Cat cat = new Cat();
        cat.sound();

    }
}

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}