/*
* Purpose: To demonstrate constant variables and arithmetic expressions
* by converting from kilometer to miles
*/
import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        final double KMS_TO_MILES = 0.621371;
        
        System.out.println("How many kilometers are there?");
        Scanner in = new Scanner(System.in);
        double numKilometers = in.nextDouble();
        // TODO: Finish this
        double numMiles = 0.0;
        System.out.print("There are " + numMiles + " miles in ");
        System.out.println(numKilometers + " kilometers");
    }
}
