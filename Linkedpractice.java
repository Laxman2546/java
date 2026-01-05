class Node{
    String data;
    Node next;
    public Node(String data){
        this.data = data;
        this.next = null;
    }
    public static void  printNodes(Node temp){

        while(temp != null){
            System.out.print(temp.data);
            System.out.print("=>");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static Node reverseLinked(Node node){
        Node head = node;
        Node temp = head;
        Node prev= null;
        Node next;
        while (temp !=null){
            next = temp.next;//node2
            temp.next = prev;//null
            prev = temp;//node1
            temp=next;//node2
        }
        return prev;
    }
    public static  void addEnd(Node temp,String value){
        Node newNode = new Node(value);

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void addStart(Node temp,String value){
        Node startNode = new Node(value);
        startNode.next = temp;
        temp = startNode;
        printNodes(temp);
        
    }
}

public class Linkedpractice {

    public static void main(String[] args) {
        Node node1 = new Node("Ella");
        Node node2 = new Node("Munna");
        Node node3 = new Node("Gana");
        Node node4 = new Node("Lakshman");
        node1.next= node2;
        node2.next = node3;
        node3.next= node4;
        Node head = node1;
        Node temp = head;
//        Node prev = Node.reverseLinked(node1);
//        while(prev !=null){
//            System.out.println(prev.data);
//            prev = prev.next;
//        }
        Node.addEnd(temp,"Nani");
        Node.addEnd(temp,"Lucky");
        Node.addStart(temp,"Manikanta");
        Node.addStart(temp,"Sai Vamshi");
//        Node.printNodes(temp);

    }
}
