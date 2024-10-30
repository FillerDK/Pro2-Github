package ex6;

import java.util.Comparator;

public class idk implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String c1 = o1.substring(o1.length() - 1);
        String c2 = o2.substring(o2.length() - 1);
        if (o1.substring(o1.length()).compareTo(o2.substring(o2.length())) < 0);
    }
}
