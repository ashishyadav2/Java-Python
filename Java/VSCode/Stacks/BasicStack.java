import java.util.Arrays;
class Stack {
    private int stackArr[];
    private int capacity;
    private int top;
    Stack(int size) {
        stackArr = new int[size];
        capacity = size;
        top = -1;
    }
    public void print() {
        System.out.println(Arrays.toString(stackArr));
    }
    public void push(int item) {
        if(top==capacity-1) {
            System.out.println("Stack overflow");
            System.exit(-1);
        }
        top++;
        stackArr[top] = item;
    }
    public int pop() {
        if(top==-1){
            System.out.println("Stack underflow");
            System.exit(-1);
        }
        return stackArr[top--];
    }
}
public class BasicStack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(21);
        stack.push(69);
        stack.push(56);
        stack.push(30);
        stack.push(32);
        stack.print();
    }
}