package ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Janus");
        list.add("Markus");
        list.add("Peter");
        list.add("Line");
        list.add("Mads");
        list.add("Søren");
        list.add("Mathias");
        list.add("Trine");
        list.add("Anders");

        System.out.println(countLengthN(list, 5));
        printLengthN(list, 5);
        System.out.println(listLengthN(list, 5));
    }

    public static int countLengthN(ArrayList<String> list, int n) {
        return countLengthN(list, 0, list.size() - 1, n);
    }

    private static int countLengthN(ArrayList<String> list, int low, int high, int n) {
        if (low == high) {
            return list.get(low).length() == n ? 1 : 0;
        } else {
            int mid = (low + high) / 2;
            int l1 = countLengthN(list, low, mid, n);
            int l2 = countLengthN(list, mid + 1, high, n);
            return l1 + l2;
        }
    }

    public static void printLengthN(ArrayList<String> list, int n) {
        printLengthN(list, 0, list.size() - 1, n);
    }

    private static void printLengthN(ArrayList<String> list, int low, int high, int n) {
        if (low == high) {
            String str = list.get(low);
            if (str.length() == n) {
                System.out.println(str);
            }
        } else {
            int mid = (low + high) / 2;
            printLengthN(list, low, mid, n);
            printLengthN(list, mid + 1, high, n);
        }
    }

    public static ArrayList<String> listLengthN(ArrayList<String> list, int n) {
        return listLengthN(list, 0, list.size() - 1, n);
    }

    private static ArrayList<String> listLengthN(ArrayList<String> list, int low, int high, int n) {
        ArrayList<String> listLengthN = new ArrayList<>();

        if (low == high) {
            if (list.get(low).length() == n) {
                listLengthN.add(list.get(low));
            }
            return listLengthN;
        } else {
            int mid = (low + high) / 2;
            listLengthN.addAll(listLengthN(list, low, mid, n));
            listLengthN.addAll(listLengthN(list, mid + 1, high, n));
            return listLengthN;
        }
    }
}
