//Asia M 2/5 Chap3 Assignment1

import java.util.Scanner;

public class HerbertHomeRepair {

    // Method to compute the estimate
    public static double computeEstimate(double costOfMaterials, double hoursOfWork, double hoursOfTravel) {
        // Constants for costs
        final double HOURLY_RATE = 35.0; // Cost per hour for on-site work
        final double TRAVEL_RATE = 12.0;  // Cost per hour for travel time

        // Calculate total cost
        return costOfMaterials + (HOURLY_RATE * hoursOfWork) + (TRAVEL_RATE * hoursOfTravel);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for job details
        System.out.print("Enter the name of the job (e.g., Smith bathroom remodel): ");
        String jobName = scanner.nextLine();
        
        System.out.print("Enter the cost of materials: ");
        double costOfMaterials = scanner.nextDouble();
        
        System.out.print("Enter the number of hours of work required: ");
        double hoursOfWork = scanner.nextDouble();
        
        System.out.print("Enter the number of hours of travel time: ");
        double hoursOfTravel = scanner.nextDouble();

        // Calculate estimate
        double estimatedCost = computeEstimate(costOfMaterials, hoursOfWork, hoursOfTravel);

        // Display the job name and estimated price
        System.out.printf("%nJob Name: %s%n", jobName);
        System.out.printf("Estimated Price: $%.2f%n", estimatedCost);

        // Close the scanner
        scanner.close();
    }
}