package DSA_ASS7;


import ArraysAndString.Node;

public class OddEvenNodes {
    public class Node{
        int data;
        ArraysAndString.Node next;
        Node(int data) {
            this.data = data;
            this.next = next;
        }
    }
    static Node head;
    public static void main(String[] args) {
        addEle(17);
        addEle(15);
        addEle(8);
        addEle(9);
        addEle(2);
        addEle(4);
        addEle(6);
        display1();
    }
    public static void display1() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
           Node cur = head;
            while (cur != null) {
                System.out.println(cur.data + " ");
                cur = cur.next;
            }
            System.out.println();
        }
    }

    private void addEle(int data) {

    }
}
