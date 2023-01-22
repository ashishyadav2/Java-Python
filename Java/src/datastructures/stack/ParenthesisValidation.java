package datastructures.stack;
import java.util.Scanner;

public class ParenthesisValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Expression: ");
        Stacks stack = new Stacks(input.next());
        System.out.println(stack.temp());
    }
}
class Stacks {
    private final char[] stackStr;
    private int top;
    private final int capacity;
    Stacks(String str) {
        stackStr = str.toCharArray();
        capacity = str.length();
        top=-1;
    }
    public boolean arePair(char opening, char closing) {
        if(opening=='(' && closing==')') return true;
        if(opening=='[' && closing==']') return true;
        if(opening=='{' && closing=='}') return true;
        return false;
    }
    public boolean temp() {
        for(int i=0;i<capacity;i++) {
            if(stackStr[i]=='(' || stackStr[i]=='[' || stackStr[i]=='{' ) {
                push(stackStr[i]);
            }
            if(stackStr[i]==')' || stackStr[i]==']' || stackStr[i]=='}' ) {
                char poppedItem = pop();
                if(!arePair(poppedItem,stackStr[i])){
                    return false;
                }
            }
        }
        return true;
    }
    public void push(char item) {
        if(isFull()) {
            System.out.println("Stack overflown");
        }
        else {
            stackStr[++top] = item;
        }
    }
    public char pop() {
        char item = '0';
        if(isEmpty()) {
            System.out.println("Stack underflow");
        }
        else {
            item = stackStr[top--];
        }
        return item;
    }
    public boolean isFull() {
        return top==capacity-1;
    }
    public boolean isEmpty() {
        return top==-1;
    }
}
