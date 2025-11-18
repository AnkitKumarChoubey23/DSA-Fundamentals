package dsa_lab_practice_package;

import java.util.*;

class CircularQueue {
    int[] arr;
    int front, rear, size, capacity;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int x) {
        if (size == capacity) return; // queue full

        if (front == -1) front = 0; // first element

        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    public void dequeue() {
        if (size == 0) return; // queue empty

        front = (front + 1) % capacity;
        size--;

        if (size == 0) {  // reset queue
            front = -1;
            rear = -1;
        }
    }

    public void display() {
        if (size == 0) return;

        int count = size;
        int i = front;

        while (count-- > 0) {
            System.out.print(arr[i] + " ");
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();           // size of queue
        CircularQueue q = new CircularQueue(n);

        while (true) {
            String command = sc.next(); // read the operation

            if (command.equals("ENQUEUE")) {
                int x = sc.nextInt();
                q.enqueue(x);
            }
            else if (command.equals("DEQUEUE")) {
                q.dequeue();
            }
            else if (command.equals("DISPLAY")) {
                q.display();
            }
            else if (command.equals("STOP")) {
                break;
            }
        }

        sc.close();
    }
}
