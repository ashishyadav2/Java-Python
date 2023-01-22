package datastructures.stack;

import java.util.Arrays;

public class BasicStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
    }
}
class Stack {
    private final int[] stackArray;
    private int top;
    private final int capacity;
    Stack(int size) {
        stackArray = new int[size];
        capacity = size;
        top=-1;
    }
    public void print() {
        System.out.println(Arrays.toString(stackArray));
    }
    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack overflown");
        }
        else {
            top++;
            stackArray[top]= item;
        }
    }
    public int pop() {
        int removedItem=-1;
        if(isEmpty()) {
            System.out.println("Stack underflow");
        }
        else {
            removedItem = stackArray[top];
            stackArray[top] = 0;
            top--;
        }
        return removedItem;
    }
    public boolean isFull() {
        return top==capacity-1;
    }
    public boolean isEmpty() {
        return top==-1;
    }
}
