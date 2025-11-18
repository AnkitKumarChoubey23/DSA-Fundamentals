package dsa_lab_practice_package;

import java.util.*;

class InfixToPostfix {

    // Function to return precedence of operators
    private static int precedence(char ch) {
        switch (ch) {
            case '^': return 3;
            case '*':
            case '/': return 2;
            case '+':
            case '-': return 1;
        }
        return -1;
    }

    // Convert infix to postfix
    public static String convert(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            // If character is operand, add to result
            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }
            // If '(' push to stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If ')' pop until '('
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // Operator encountered
            else {
                while (!stack.isEmpty() &&
                       precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop all remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}

public class InfixTOPostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String infix = sc.next();

        System.out.print(InfixToPostfix.convert(infix));

        sc.close();
    }
}
