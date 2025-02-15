package datastructures.stack;

public class StringStack {
    String [] stack;
    int top;
    int capacity;

    public StringStack(int capacity){
        stack = new String[capacity];
        top = -1;
        this.capacity = capacity;
    }

    public boolean isEmpty(){
        if(top < 0){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean push(String value){
        if(top >= capacity - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            top = top + 1;
            stack[top] = value;
            return true;
        }

    }

    public String peek(){
        if(top < 0){
            System.out.println("Stack Overflow");
            return "";
        }
        else{
            String value = stack[top];
            return value;
        }
    }

    public String pop(){
        if(top < 0){
            System.out.println("Stack Overflow");
            return "";
        }
        else{
            String value = stack[top];
            top = top - 1;
            return value;
        }

    }

    public void traverse(){
        for(int i = 0; i <= top; i++){
            System.out.println(stack[i]);
        }

    }
}
