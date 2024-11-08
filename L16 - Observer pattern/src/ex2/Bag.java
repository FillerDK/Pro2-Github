package ex2;

public interface Bag {

    /** Add the string to the bag */
    void add(String s);

    /** Remove the string s from the bag (if it is the bag). */
    void remove(String s);

    /** Get the count of the string s in the bag. */
    int getCount(String s);
}
