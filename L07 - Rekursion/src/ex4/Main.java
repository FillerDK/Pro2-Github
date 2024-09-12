package ex4;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        printAnagrams("cat");
    }

    public static void printAnagrams(String s) {
        printAnagrams("", s);
    }

    private static void printAnagrams(String prefix, String word) {
        if (word.length() <= 1) {
            System.out.println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String p = prefix + word.charAt(i);
                String w = word.substring(0, i) + word.substring(i + 1);
                printAnagrams(p, w);
            }
        }
    }
}
