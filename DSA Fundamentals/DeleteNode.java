package dsa_lab_practice_package;

import java.util.*;

public class DeleteNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Delete first occurrence of x
    public static Node deleteByValue(Node head, int x) {
        // Case 1: Empty list
        if (head == null) return null;

        // Case 2: Value is in the head
        if (head.data == x) {
            return head.next;
        }

        // Traverse to find the node whose next has value x
        Node temp = head;
        while (temp.next != null && temp.next.data != x) {
            temp = temp.next;
        }

        // If value not found
        if (temp.next == null) {
            return null;  // signal "not found"
        }

        // Delete the node
        temp.next = temp.next.next;

        return head;
    }

    // Print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

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

        int x = sc.nextInt();

        Node newHead = deleteByValue(head, x);

        if (newHead == null && (head == null || head.data != x)) {
            System.out.print("Not Found");
        } else {
            printList(newHead);
        }

        sc.close();
    }
}
