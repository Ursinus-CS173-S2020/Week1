/*
 * Purpose: To demonstrate how % (the modulus operator) can be used to
 * take the remainder after division
 */

import java.util.Scanner;
public class Modulus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What number do you want to divide?");
        int a = in.nextInt();
        System.out.println("What do you want to divide it by?");
        int b = in.nextInt();
        System.out.println(a + " goes into " + b + " " + a/b + " times");
    }
}
