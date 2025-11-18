package dsa_lab_practice_package;

import java.util.*;

public class InsertNode {

    // Node class for linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert node at given 1-based position
    public static Node insertAtPosition(Node head, int pos, int val) {
        Node newNode = new Node(val);

        // Case 1: Insert at beginning (pos = 1)
        if (pos == 1) {
            newNode.next = head;
            return newNode;
        }

        // Traverse to node before the target position
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Insert in the middle or end
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
        }

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

        // Build the initial linked list
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int pos = sc.nextInt();
        int val = sc.nextInt();

        head = insertAtPosition(head, pos, val);

        printList(head);

        sc.close();
    }
}
