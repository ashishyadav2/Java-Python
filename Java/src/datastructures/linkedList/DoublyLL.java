public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertFirst(256);
        list.insertEnd(569);
        list.insertEnd(15);
        list.insertFirst(32);
        list.display();
        list.delete(list.head);
        list.insertAfter(list.head, 46);
        list.display();
    }
    private Node head;
    private int size;
    DoublyLL() {
        this.size=0;
    }
    void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.print("NULL\n");
    }
    void insertFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head!=null) {
            head.prev = node;
        }
        head = node;
    }
    void insertEnd(int data) {
        Node node = new Node(data);
        Node temp = head;
        
        if(head==null) { // first element to be inserted
            node.prev = null;
            head = node;
            return;
        }
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
       
    }
    void insertAfter(Node prevNode,int data) {
        if(prevNode==null) {
            System.out.println("Node is null");
            return;
        }
        Node node = new Node(data);
        node.next = prevNode.next;
        prevNode.next = node;
        node.prev = prevNode;
        if(node.next!=null) {
            node.next.prev = node;
        }
    }
    void delete(Node delNode) {
        if(head==null||delNode==null) return;
        if(delNode ==head){
            head = delNode.next;
        }
        if(delNode.next!=null) {
            delNode.next.prev = delNode.prev;
        }
        if(delNode.prev!=null) {
            delNode.prev.next = delNode.next;
        }
    }
    static class Node {
        private int data;
        private Node next;
        private Node prev;
        Node(int data) {
            this.data = data;
        }
        Node(int data,Node next) {
            this.next = next;
        }
    }
}