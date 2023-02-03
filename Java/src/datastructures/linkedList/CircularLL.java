public class CircularLL {
    static class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;

    void addEmpty(int data) {
        Node node = new Node(data);
        head = tail = node;
        node.next = head;
        return;
    }

    void addFront(int data) {
        if (head == null) {
            addEmpty(data);
            return;
        }
        Node node = new Node(data);
        node.next = head;
        head = node;
        tail.next = node;
    }

    void addEnd(int data) {
        Node node = new Node(data);
        if (head == null) {
            addEmpty(data);
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;
    }

    void addAfter(int item, int data) {
        Node node = new Node(data);
        Node getNode = search(item);
        if (getNode == null) {
            System.out.println("Node does not exist!");
            return;
        }
        if (getNode == tail) {
            addEnd(data);
            return;
        }
        node.next = getNode.next;
        getNode.next = node;

    }
    void delete(int item) {
        Node getNode = search(item);
        Node temp = head;
        if(head==null) {
            return;
        }
        if(head==tail) {
            head=tail=null;
            return;
        }
        if(getNode==head) {
            head=head.next;
            tail.next = head;
            return;
        }
        if(getNode==tail) {
            while(temp.next!=tail) {
                temp= temp.next;
            }
            tail = temp;
            tail.next = head;
            return;
        }
        temp = head;
        while(temp.next!=getNode) {
            temp = temp.next;
        }
        temp.next = getNode.next;
        
    }
    Node search(int item) {
        Node temp = head;
        do {
            if(temp.data==item) {
                return temp;
            }
            temp = temp.next;
        }while(temp!=head);
        return null;
    }

    void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        do {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.addEnd(59);
        list.addEnd(18);
        list.addEnd(67);
        list.addFront(75);
        list.addAfter(75, 45);
        list.addAfter(18, 48);
        list.addAfter(67, 98);
        list.display();
        list.delete(75);
        list.display();
    }
}
