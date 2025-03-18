//Asia M Chap6Web 2/25/25

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to hold player names
        String[] players = {"Art", "Bob", "Cal", "Dan", "Eli"};
        // Array to hold points scored by each player
        int[] points = new int[5];
        
        // Input points scored by each player
        for (int i = 0; i < players.length; i++) {
            System.out.print("Enter points scored by " + players[i] + ": ");
            points[i] = scanner.nextInt();
        }
        
        // Display the bar chart
        System.out.println("\nBar Chart of Points Scored:");
        for (int i = 0; i < players.length; i++) {
            System.out.print(players[i] + ": ");
            for (int j = 0; j < points[i]; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each player's points
        }
        
        scanner.close();
    }
}


