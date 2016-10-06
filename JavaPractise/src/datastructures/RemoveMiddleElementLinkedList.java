package datastructures;

/**
 * Created by GV Sharma on 8/12/2016.
 */
public class RemoveMiddleElementLinkedList {
    public static void main(String[] args) {
        RemoveMiddleElementLinkedList list = new RemoveMiddleElementLinkedList();
        list.head = new Node(24);
        list.head.next = new Node(15);
        list.head.next.next = new Node(35);
        list.head.next.next.next = new Node(56);
        list.head.next.next.next.next = new Node(20);

        System.out.println("Original list");
        printElements(head);
        System.out.println(" ");
        System.out.println("list size");
        printSize(head);
        System.out.println(" ");
        System.out.println("after removing list");
        removeMiddleElement(head);
        printElements(head);
        System.out.println(" ");
        System.out.println("list size");
        printSize(head);
    }

    private static void removeMiddleElement(Node node) {
        Node fastP = node;
        Node slowP = node;
        Node prev = null;
        if (node == null) {
            return;
        }

        if (node.next == null) {
            return;
        }

        while (fastP != null && fastP.next != null) {
            fastP = fastP.next.next;
            prev = slowP;
            slowP = slowP.next;
        }
        prev.next = slowP.next;
        slowP = null;
    }

    private static void printElements(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
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

    static void printSize(Node node) {
        int i = 0;
        while (node != null) {
            i++;
            node = node.next;
        }
        System.out.print("List size: " + i);
    }
}
