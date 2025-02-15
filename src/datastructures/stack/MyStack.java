package datastructures.stack;

public class MyStack {
    int [] myStack;
    int top;
    int capacity;
    public MyStack(int capacity){
        myStack = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }
    public boolean isEmpty(){
        if(top < 0){
            return true;
        }
        else{
            return false;
        }

    }

    public boolean push(int value){
        if(top >= capacity - 1){
            System.out.println("Stack Overflow");
            return false;
        }
        else{
            top = top + 1;
            myStack[top] = value;
            return true;
        }
    }

    public int peek(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else{
            int value = myStack[top];
            return value;
        }

    }

    public int pop(){
        if(top < 0){
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int value = myStack[top];
            top = top - 1;
            return value;
        }
    }
}

