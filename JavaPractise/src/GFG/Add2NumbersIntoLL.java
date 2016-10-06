package GFG;

import java.util.LinkedList;

/**
 * Created by GV Sharma on 9/17/2016.
 */
public class Add2NumbersIntoLL {
    Node head;

    public static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        Add2NumbersIntoLL ll = new Add2NumbersIntoLL();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        Add2NumbersIntoLL ll1 = new Add2NumbersIntoLL();
        ll1.head = new Node(4);
        ll1.head.next = new Node(5);
        ll1.head.next.next = new Node(6);
        add(ll, ll1);
    }

    private static void add(Add2NumbersIntoLL ll, Add2NumbersIntoLL ll1) {
        String traverseLL = traverseLL(ll);
        String traverseLL2 = traverseLL(ll1);
        System.out.println(Integer.parseInt(traverseLL) + Integer.parseInt(traverseLL2));
    }

    private static String traverseLL(Add2NumbersIntoLL ll) {
        String val = "";
        Node temp = ll.head;
        while (temp != null) {
            val = val + ((Integer) temp.data).toString();
            temp = temp.next;
        }
        return val;
    }

}
