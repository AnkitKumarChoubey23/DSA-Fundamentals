package dsa_lab_practice_package;

import java.util.*;

public class Postfix {

    public static int evaluatePostfix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            // If token is an operator
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/") ) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }

                stack.push(result);
            }
            else {
                // Token is a number
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        int result = evaluatePostfix(tokens);
        System.out.print(result);

        sc.close();
    }
}
