//Asia M Chap8 Assignment1 3/18/25//

import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        String[] birthdates = new String[10];
        int count = 0;
        final String SENTINEL = "ZZZ";
        
        System.out.println("Enter up to 10 friends' names and birthdates.");
        System.out.println("Enter '" + SENTINEL + "' for a name when you are finished.");
        
        boolean done = false;
        while (!done && count < 10) {
            System.out.print("Enter name #" + (count + 1) + " or '" + SENTINEL + "' to quit: ");
            String name = scanner.nextLine();
            
            if (name.equals(SENTINEL)) {
                done = true;
            } else {
                System.out.print("Enter birthdate for " + name + ": ");
                String birthdate = scanner.nextLine();
                
                names[count] = name;
                birthdates[count] = birthdate;
                count++;
                
                if (count == 10) {
                    System.out.println("Maximum number of friends reached.");
                }
            }
        }
        
        System.out.println("\nYou entered " + count + " friend(s):");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        
        System.out.println("\nBirthdate Lookup");
        System.out.println("Enter a friend's name to see their birthdate or '" + SENTINEL + "' to quit.");
        
        boolean lookupDone = false;
        while (!lookupDone) {
            System.out.print("\nEnter a name to look up: ");
            String lookupName = scanner.nextLine();
            
            if (lookupName.equals(SENTINEL)) {
                lookupDone = true;
                System.out.println("Thank you for using Birthday Reminder!");
            } else {
                int index = -1;
                for (int i = 0; i < count; i++) {
                    if (names[i].equalsIgnoreCase(lookupName)) {
                        index = i;
                        break;
                    }
                }
                
                if (index != -1) {
                    System.out.println("Birthdate for " + names[index] + ": " + birthdates[index]);
                } else {
                    System.out.println("Error: Name not found. Please try again.");
                }
            }
        }
        
        scanner.close();
    }
}
