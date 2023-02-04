public class DoublyCircularLL {
    static class Node {
        private Node prev;
        private Node next;
        private int data;

        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;
    Node tail = null;
    private int size;

    void addEmpty(int data) {
        Node node = new Node(data);
        head = tail = node;
        node.prev = head;
        node.next = head;
        size++;
    }

    void addFront(int data) {
        Node node = new Node(data);
        if (head == null) {
            addEmpty(data);
        } else {
            node.next = head;
            tail.next = node;
            node.prev = tail;
            head = node;
            size++;
        }
    }

    void addEnd(int data) {
        Node node = new Node(data);
        if (tail == null) {
            addEmpty(data);
            return;
        }
        tail.next = node;
        node.prev = tail;
        node.next = head;
        head.prev = node;
        tail = node;
        size++;
    }

    void addAt(int data, int index) {
        Node getNode = get(index);
        Node node = new Node(data);
        if (index < 0 || index >= size) {
            System.out.println("index: " + index + " is out of bound!");
            return;
        }
        if (index == 0) {
            addFront(data);
            return;
        }
        if (index == size - 1) {
            addEnd(data);
            return;
        }
        node.next = getNode.next;
        node.prev = getNode;
        getNode.next.prev = node;
        getNode.next = node;
        size++;
    }

    Node get(int index) {
        Node temp = head;
        if (index < 0 || index >= size) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    Node search(int item) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == item) {
                return temp;
            }
            temp = temp.next;
            if (temp == head) {
                break;
            }
        }
        return null;
    }

    int size() {
        return size;
    }

    void removeFirst() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;
    }

    void removeLast() {
        if (head == tail) {
            head = tail = null;
            return;
        }
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
    }

    void deleteNode(int item) {
        Node getNode = search(item);
        if (getNode == head) {
            removeFirst();
            return;
        }
        if (getNode == tail) {
            removeLast();
            return;
        }
        getNode.prev.next = getNode.next;
        getNode.next.prev = getNode.prev;
        getNode = null;
        size--;
    }

    void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("list is empty!");
            return;
        }
        do {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("NULL" + " size: " + size());
    }

    public static void main(String[] args) {
        DoublyCircularLL list = new DoublyCircularLL();
        list.addFront(15);
        list.addFront(19);
        list.addEnd(48);
        list.addEnd(57);
        list.display();
        list.addAt(69, 4);
        list.display();
    }
}