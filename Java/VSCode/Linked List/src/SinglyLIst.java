public class SinglyLIst {
    public static void main(String[] args) {
        SinglyLIst list = new SinglyLIst();
        list.insertFirst(50);
        list.insertFirst(56);
        list.insertFirst(62);
        list.insertFirst(89);
        list.insertLast(99);
        list.insert(35,3);
        list.display();
        System.out.println(list.delete());
        System.out.println(list.deleteLast());
        list.display();
    }
    private Node head;
    private Node tail;
    private int size;
    public SinglyLIst() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail==null) {
            tail = head;
        }
        size +=1;
    }
    public void insertLast(int value) {
        if(tail==null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail=node;
        size++;
    }
    public void insert(int value,int index) {
        if(index==0){
            insertFirst(value);
        }
        if(index==size) {
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size++;
    }
    public int delete() {
        int value = head.value;
        head = head.next;
        if(head==null) {
            tail = null;
        }
        return value;
    }
    public int deleteLast() {
        if(size<=1) {
            return delete();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void display() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value; 
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
