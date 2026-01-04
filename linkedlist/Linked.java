package linkedlist;

class Node{
    private int value;

    void setValue(int value){
        this.value = value;
        System.out.println("iam from setVAlue"+ value);
    }
    void getValue(){
        System.out.println("iam the value"+ value);
    }
}

public class Linked {
    public  static  void main(String[] args){
        System.out.println("Lakshman");
        Node node = new Node();
        node.setValue(12);
        node.getValue();
    }
}
