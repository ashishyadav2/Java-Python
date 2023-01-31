package datastructures.queue;

import java.util.Arrays;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        DEQueue q = new DEQueue(5);
        q.insertRear(21);
        q.insertRear(30);
        q.insertRear(25);
        q.insertFront(56);
        q.insertFront(69);
        q.insertFront(35);
        q.print();
        q.deleteFront();
        q.print();
        q.deleteRear();
        q.print();
    }
}
class DEQueue {
    private final int[] qArr;
    private final int size;
    private int front, rear;
    DEQueue(int size) {
        qArr = new int[size];
        this.size = size;
        front=-1;
        rear=0;
    }
    boolean isFull() {
        return (front==0&&rear==size-1) || (front==rear+1);
    }
    boolean isEmpty() {
        return front==-1;
    }
    void print() {
        System.out.println(Arrays.toString(qArr));
    }
    void insertFront(int item) {
        if(isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            if(front==0) {
                front = size-1;
            }
            else if(front==-1) {
                front=rear=0;
            }
            else {
                front--;
            }
            qArr[front] = item;
        }
    }
    void insertRear(int item) {
        if(isFull()) {
            System.out.println("Queue is Full");
        }
        else {
            if(rear==size-1) {
                rear=0;
            }
            else if(front==-1) {
                front=rear=0;
            }
            else {
                rear++;
            }
            qArr[rear] = item;
        }
    }
    void deleteFront() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            if(front==rear) {
                front=rear=-1;
            }
            else if(front==size-1) {
                front = 0;
            }
            qArr[front] = 0;
            front++;
        }
    }void deleteRear() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
        }
        else {
            if(front==rear) {
                front=rear=-1;
            }
            else if(rear==0) {
                rear = size-1;
            }
            qArr[rear] = 0;
            rear--;
        }
    }
}
