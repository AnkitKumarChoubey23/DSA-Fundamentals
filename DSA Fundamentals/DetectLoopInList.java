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

class LinkedListCycle {

    // Detect loop using Floyd's Cycle Detection
    public static boolean hasLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;           // cycle detected
            }
        }
        return false;                  // no cycle
    }
}

public class DetectLoopInList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        // Store nodes to connect loop later
        Node[] nodes = new Node[n];

        for (int i = 0; i < n; i++) {
            Node newNode = new Node(sc.nextInt());
            nodes[i] = newNode;

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int pos = sc.nextInt();  // 0-based index for loop start, -1 means no loop

        // Create loop if pos is valid
        if (pos != -1 && pos >= 0 && pos < n) {
            tail.next = nodes[pos];
        }

        if (LinkedListCycle.hasLoop(head)) {
            System.out.print("Loop Found");
        } else {
            System.out.print("No Loop");
        }

        sc.close();
    }
}
