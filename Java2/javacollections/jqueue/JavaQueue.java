package javacollections.jqueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaQueue {
    public static void normalQueue(){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(16);
        queue.offer(12);
        queue.add(98);
        queue.offer(45);
        queue.forEach((i)-> System.out.println(i));
        System.out.println("============");
        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println("==============");
        queue.forEach((i)-> System.out.println(i));
    }
    public static void pQueue() {
        Queue<Integer> pq = new PriorityQueue<>();
        System.out.println("----------------");
        pq.offer(89);
        pq.offer(15);
        pq.offer(10);
        pq.offer(897);
        pq.forEach((i)-> System.out.println(i));

    }
    public static void main(String[] args) {
        normalQueue();
        pQueue();
    }
}
