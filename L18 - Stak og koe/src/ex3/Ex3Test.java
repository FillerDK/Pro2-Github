package ex3;

public class Ex3Test {
    public static void main(String[] args) {
        String palindrome = "ABCDEFGFEDCBA";
        String notPalindrome = "ABCCA";

        System.out.println(isPalindrome(palindrome));
        System.out.println(isPalindrome(notPalindrome));
    }

    public static boolean isPalindrome(String s) {
        ListStack24V<Character> stack = new ListStack24V<>();
        boolean isPalindrome = true;
        int size = s.length();

        for (int i = 0; i < size/2; i++) {
            stack.push(s.charAt(i));
        }
        int newSize = size/2;
        // checks if length of string is even
        if (size % 2 == 1) newSize++;
        for (int i = newSize; isPalindrome && i < size; i++) {
            char ch = s.charAt(i);
            if (stack.peek().equals(ch)) stack.pop();
            else isPalindrome = false;
        }

        return isPalindrome;
    }
}
