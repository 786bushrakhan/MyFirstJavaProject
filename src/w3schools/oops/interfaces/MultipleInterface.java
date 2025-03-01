package w3schools.oops.interfaces;

public class MultipleInterface {
    public static void main (String [] args){
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
    }
}

class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod(){
        System.out.println("Some text..");
    }
    public void myOtherMethod(){
        System.out.println("Some other text...");
    }
}