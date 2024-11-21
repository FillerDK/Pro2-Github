package ex2;

import ex1_Stack.Stack24V;

public class Ex2Test {
    public static void main(String[] args) {
        String correct = "(3+{5[99 {*}]}[23[{67}67]])";
        String notCorrect = "(}){";

        System.out.println("String correct is correct: " + isCorrect(correct));
        System.out.println("String notCorrect is correct: " + isCorrect(notCorrect));
    }

    public static boolean isCorrect(String s) {
        ParenthesisBracketListStack<Character> stack = new ParenthesisBracketListStack<>();
        boolean isCorrect = true;
        for (int i = 0; isCorrect && i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == '}') {
                if (stack.peek().equals('{')) stack.pop();
                else isCorrect = false;
            } else if (ch == ')') {
                if (stack.peek().equals('(')) stack.pop();
                else isCorrect = false;
            } else if (ch == ']') {
                if (stack.peek().equals('[')) stack.pop();
                else isCorrect = false;
            }
        }
        return isCorrect;
    }
}
