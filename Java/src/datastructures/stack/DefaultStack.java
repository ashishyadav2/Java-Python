package datastructures.stack;

import java.util.Stack;

public class DefaultStack {
    public static void main(String[] args) {
        Stack stack = new Stack(); //default initialization
        Stack<String> stackStr = new Stack<String>();
        stack.push(25);
        stack.push(56);
        stack.push(21);
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.empty());
        System.out.println(stack.search(56));
        System.out.println(stack);

        stackStr.push("hello");
        stackStr.push("world");
        System.out.println(stackStr);

    }
}
