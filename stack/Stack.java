package stack;

import java.util.Arrays;

public class Stack {
    private final char[] array = new char[5];
    private int top = -1;

    public void push(char ch){
        if(top == array.length - 1)
            throw new StackOverflowError();
        array[++top] = ch;
    }

    public char pop(){
        if(isEmpty())
            throw new IllegalStateException();
        return array[top--];
    }

    public char peek(){
        if(isEmpty())
            throw new IllegalStateException();
        return array[top];
    }

    public boolean isEmpty(){
        return top == -1 ;
    }

    @Override
    public String toString(){
        var contents = Arrays.copyOfRange(array, 0, top);
        return Arrays.toString(contents);
    }
}
