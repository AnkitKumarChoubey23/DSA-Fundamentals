package dsa_lab_practice_package;

import java.util.*;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, char src, char aux, char dest) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return;
        }

        // Move n-1 disks from src → aux
        towerOfHanoi(n - 1, src, dest, aux);

        // Move nth disk from src → dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // Move n-1 disks from aux → dest
        towerOfHanoi(n - 1, aux, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        towerOfHanoi(n, 'A', 'B', 'C');

        sc.close();
    }
}
