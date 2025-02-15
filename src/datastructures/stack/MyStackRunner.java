package datastructures.stack;

public class MyStackRunner {
    public static void main (String [] args){
        MyStack obj = new MyStack(10);
        boolean isEmpty = obj.isEmpty();
        System.out.println(isEmpty);
        obj.push(10);
        System.out.println(obj.isEmpty());
        obj.push(30);
        obj.push(40);
        obj.push(75);
        obj.push(85);
        obj.push(90);
        obj.push(20);
        obj.push(66);
        obj.push(89);
        obj.push(99);
        System.out.println(obj.peek());
        obj.push(77);
        System.out.println(obj.pop());
    }
}
