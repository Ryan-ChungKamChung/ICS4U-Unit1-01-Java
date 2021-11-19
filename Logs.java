/*
 * This program calculates the amount of logs than can be put in a truck
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-11-17
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
* This class contains the calculations used to determine the maximum amount of
* logs that can be put inside of a truck.
*/
final class Logs {

    // Public Constant Declarations
    /**
     * MAX_WEIGHT is equal to the max weight that a truck can carry.
     * */
    public static final int MAX_WEIGHT = 1100;

    /**
     * LOG_WEIGHT_PER_METER is the density of maple (20kg/m).
     * */
    public static final int LOG_WEIGHT_PER_METER = 20;

    /**
    * Prevents instantiation.
    * Throw an exception IllegalStateException when called.
    *
    * @throws IllegalStateException
    *
    */
    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Prints the amount of logs that can fit in a truck.
     *
     * @param args No args will be used.
     * @throws IOException if inputReader fails.
     * */
    public static void main(final String[] args) throws IOException {

        // Variable Declarations
        final float heightOfLog;
        final float maxAmountOfLogs;

        // User prompt
        System.out.print("Enter the log length (0.25, 0.5 or 1 meters): ");

        // Gathering the user input
        final BufferedReader inputReader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // Reads the input and converts it to float
        heightOfLog = Float.parseFloat(inputReader.readLine());

        // Calculates the max amount of logs that can fit in the truck
        maxAmountOfLogs = MAX_WEIGHT / LOG_WEIGHT_PER_METER / heightOfLog;

        // Outputs the result of the calculation to the user
        System.out.println("The truck can hold " + maxAmountOfLogs + " logs.");

        System.out.println("\nDone.");
    }

}

