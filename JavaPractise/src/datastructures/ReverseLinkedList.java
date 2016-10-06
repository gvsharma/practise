package datastructures;

import java.util.LinkedList;

/**
 * Created by GV Sharma on 8/12/2016.
 */
public class ReverseLinkedList {
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(14);
        list.head.next.next = new Node(25);
        list.head.next.next.next = new Node(46);
        System.out.println("Original Linked list..!");
        printList(head);
        head = list.reverse(head);
        System.out.println("<------------->");
        printList(head);
    }

    private static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    Node reverse(Node node) {
        Node prev=null;
        Node current=node;
        Node next=null;
        while(current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            System.out.print(current.data+" ");
        }
        node = prev;
        return node;
    }

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }
    }
}
