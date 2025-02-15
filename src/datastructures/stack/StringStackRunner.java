package datastructures.stack;

public class StringStackRunner {
    public static void main (String [] args){
        StringStack obj = new StringStack(10);
        System.out.println(obj.isEmpty());
        obj.push("Afreen");
        obj.push("Bushra");
        obj.push("Danish");
        obj.push("Heena");
        obj.push("Mehfooza");
        obj.push("Meraj");
        obj.push("Iqra");
        obj.push("Yaseen");
        obj.push("Aameen");
        System.out.println(obj.push("Azra"));
        boolean isPushed = obj.push("Aayeza");
        System.out.println(isPushed);
        String value = obj.peek();
        System.out.println(value);
        String isPopped = obj.pop();
        System.out.println(isPopped);
        String stack = obj.peek();
        System.out.println(stack);
        obj.traverse();
    }
}
