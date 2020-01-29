/*
 * Purpose: To show casting for dividing two integers and having
 * the answer be a decimal
 */
import java.util.Scanner;

public class CastingExample {
    public static void main(String[] args) {
        int a;
        int b = 3;
        a = 5;
        System.out.print(a + "/" + b + "=");
        System.out.println((double)a/(double)b);
    }
}
