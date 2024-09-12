package ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
    }

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    private static boolean isPalindrome(String s, int left, int right) {
        if (right <= left) return true;
        else return s.charAt(left) == s.charAt(right) &&
                    isPalindrome(s, left + 1, right - 1);
    }
}
