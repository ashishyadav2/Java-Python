public class DoublyLL {
    public static void main(String[] args) {

    }
    private Node head;
    private Node tail;
    private int size;
    DoublyLL() {
        this.size=0;
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