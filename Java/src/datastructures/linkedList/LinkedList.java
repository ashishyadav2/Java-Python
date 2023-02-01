public class LinkedList {    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(52);
        list.insertLast(96);
        list.insertFirst(79);
        list.insertLast(48);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.insertAt(125, 2);
        list.sort(list.head);
        list.display();
    }
    private Node head;
    private Node tail;
    private int size;

    LinkedList() {
        this.size = 0;
    }
    void sort(Node head) {
        Node current = head;
        Node index = null;
        int temp;
        if(head==null) return;
        while(current!=null) {
            index = current.next;
            while(index!=null) {
                if(current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }
    void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head; //linking
        head = node; //shifting head;
        if(tail==null) tail = head; // if only one node is present head and tail is same
        size++;
    }
    void insertLast(int data){
        if(tail==null) { //only one node is present
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node; //linking
        tail = node; // shifting tail
        size++;
    }
    void insertAt(int data,int index) {
        if(index==0) insertFirst(data);
        if(index==size) {
            insertLast(data); 
            return;
        }
        Node temp = head;
        for (int i=1;i<index;i++) {
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }
    int deleteFirst() {
        int value = head.data;
        head = head.next;
        if(head==null) {
            tail = null;
        }
        return value;
    }
    int deleteLast() {
        if(size<=1) {
            return deleteFirst();            
        }
        Node secondLast = get(size-2);
        int val = tail.data;
        tail = secondLast; // shifting tail
        tail.next = null; // breaking link
        size--;
        return val;
    }
    Node get(int index) {
        Node temp = head;
        for(int i=0;i<index;i++) {
            temp = temp.next;
        }
        return temp;
    }
    void display() {
        Node temp = head;
        System.out.println();
        while(temp!=null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    static class Node {
        private int data;
        private Node next;
        Node(int data) {
            this.data = data;
        }
        Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }
}