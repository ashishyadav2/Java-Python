package datastructures.queue;

import java.util.Arrays;

public class CircularQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(25);
        q.insert(29);
        q.insert(829);
        q.insert(289);
        q.insert(28899);
        q.print();
        q.insert(69);
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.print();
        q.delete();
    }
}
class Queue {
    private final int[] qArr;
    private final int capacity;
    private int front,rear;
    Queue(int size) {
        qArr = new int[size];
        capacity = size;
        front=rear=-1;
    }
    boolean isFull() {
        return (front==0&&rear==capacity-1) || (front == rear + 1);
    }
    boolean isEmpty() {
        return front==-1;
    }
    void print() {
        System.out.println(Arrays.toString(qArr));
    }
    void insert(int item) {
        if(isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if(front==-1) front= 0;
            rear=(rear+1)%capacity;
            qArr[rear] = item;
        }
    }
    void delete() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            qArr[front] = 0;
            if(front==rear) {
                front=rear=-1;
            }
            else {
                front=(front+1)%capacity;
            }
        }
    }
}