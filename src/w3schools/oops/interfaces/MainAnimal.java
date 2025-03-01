package w3schools.oops.interfaces;

public class MainAnimal {
    public static void main (String [] args){
        Dog d = new Dog();
        d.animalSound();
        d.sleep();
    }

}
class Dog implements Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says : bow bow");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz");

    }
}
