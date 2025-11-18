package dsa_lab_practice_package;

import java.util.*;

class MyPriorityQueue {

    private PriorityQueue<Integer> pq;

    public MyPriorityQueue() {
        // Higher number = higher priority → use reverse order
        pq = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void insert(int x) {
        pq.add(x);
    }

    public void delete() {
        if (!pq.isEmpty()) {
            pq.poll();   // removes highest priority
        }
    }

    public void display() {
        if (pq.isEmpty()) return;

        // Print in sorted (priority) order
        PriorityQueue<Integer> temp = new PriorityQueue<>(pq);
        while (!temp.isEmpty()) {
            System.out.print(temp.poll() + " ");
        }
        System.out.println();
    }
}

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyPriorityQueue pq = new MyPriorityQueue();

        while (true) {
            String command = sc.next();

            if (command.equals("INSERT")) {
                int x = sc.nextInt();
                pq.insert(x);
            }
            else if (command.equals("DELETE")) {
                pq.delete();
            }
            else if (command.equals("DISPLAY")) {
                pq.display();
            }
            else if (command.equals("STOP")) {
                break;
            }
        }

        sc.close();
    }
}
