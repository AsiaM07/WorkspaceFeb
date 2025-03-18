//Asia M 2/6 Chap2 Assignment1

import java.util.Scanner;

public class Eggs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of eggs in the order: ");
        int totalEggs = scanner.nextInt();

        
        double dozenPrice = 3.25; 
        double singleEggPrice = 0.45; 
        int dozens = totalEggs / 12;
        int looseEggs = totalEggs % 12;

        double totalCost = (dozens * dozenPrice) + (looseEggs * singleEggPrice);

        System.out.printf("You ordered %d eggs. That’s %d dozen at $%.2f per dozen and %d loose eggs at $%.2f each for a total of $%.2f.%n",
                totalEggs, dozens, dozenPrice, looseEggs, singleEggPrice, totalCost);

        scanner.close();
    }
}