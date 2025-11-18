package dsa_lab_practice_package;

import java.util.*;

public class IsBalancedStack {

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Handle closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {

                // If stack empty → no matching opening
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                // Check matching pairs
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // After full scan: stack must be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        if (isBalanced(input))
            System.out.print("Balanced");
        else
            System.out.print("Not Balanced");

        sc.close();
    }
}
