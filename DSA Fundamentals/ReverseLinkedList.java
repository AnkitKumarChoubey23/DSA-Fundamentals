package dsa_lab_practice_package;

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListHelper {

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next;

        while (current != null) {
            next = current.next;   // save next
            current.next = prev;   // reverse pointer
            prev = current;        // move prev
            current = next;        // move current
        }

        return prev; // new head
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        head = LinkedListHelper.reverseList(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}
