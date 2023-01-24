import java.util.Arrays;
public class BasicQueue {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.display();
        q.delete();
        q.delete();
        q.display();
    }
}
class Queue {
    private int[] qArr;
    private int capacity;
    private int front,rear;
    Queue(int size) {
        front=rear = -1;
        capacity = size;
        qArr = new int[size];        
    }
    void display(){        
        System.out.print(Arrays.toString(qArr)+"\n");        
    }
    void insert(int item) {
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            if(front==-1) {
                front = 0;
            }
            rear++;
            qArr[rear] = item;
        }
    }
    void delete() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            if(front>=rear) {
                front=rear=-1;
            }
            else {
                qArr[front] = 0;
                front++;
            }
        }
    }
    boolean isFull(){
        if(front==0&&rear==capacity-1) return true;
        else return false;
    }
    boolean isEmpty(){
        if(front==-1) return true;
        else return false;
    }
}