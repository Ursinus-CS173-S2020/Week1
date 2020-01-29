/*
 * Purpose: To show what happens when we use numbers
 * that are too big for their datatypes
 */

public class Overflow {
    public static void main(String[] args) {
        int x = 1000000000; // One billion
        x = x*3;
        System.out.println(x);
    }
}
