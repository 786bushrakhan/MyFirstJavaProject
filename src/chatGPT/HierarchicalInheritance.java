package chatGPT;

public class HierarchicalInheritance {
    public static void main (String [] args){
        Dog d = new Dog();
        d.sound();
        d.bark();

        Cat c = new Cat();
        c.sound();
        c.meow();

        Lion l = new Lion();
        l.sound();
        l.roar();


    }
}
