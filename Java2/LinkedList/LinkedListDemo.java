package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Hello");
        ll.add("World");
        ll.add("Java");
        ll.add("Python");
        Collections.sort(ll,Collections.reverseOrder());
        System.out.println(ll);
    }
}
