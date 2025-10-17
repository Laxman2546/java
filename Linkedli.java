class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LL {
    private Node head;

    public void insertData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void Display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "=>");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Linkedli {
    
    public static void main(String[] args) {
        LL linked = new LL();
        linked.insertData(5);
        linked.insertData(6);
        linked.insertData(7);
        linked.Display();
    }    
}
