//Asia M 2/6 Chap2 Assignment2

import java.util.Scanner;

public class MinutesConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();

        // Constants for conversion
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;

        // Calculate hours and days
        long hours = minutes / MINUTES_IN_HOUR;
        double days = hours / (double) HOURS_IN_DAY;

        // Display the results
        System.out.printf("%d minutes equals %d hours and equals %.3f days.%n", minutes, hours, days);

        // Close the scanner
        scanner.close();
    }
}