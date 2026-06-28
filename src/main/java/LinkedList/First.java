package LinkedList;
public class First{

    }
class Node{
    int data;
    Node next;

    public Node(int value){
        this.data=value;
        this.next=null;
    }
    public static void main(String[] args) {
        Node head;
//        System.out.println(head);
        Node newNode = new Node(10);

        newNode.next=new Node(20);
        newNode.next.next=new Node(30);
        System.out.println(newNode.next);
    }
}