//Asia M Chap6 Assignment1 2/25/25

public class DiagonalOs {
    public static void main(String[] args) {
        int numberOfOs = 10; // Number of 'O's to display

        // Loop to create the diagonal pattern
        for (int i = 0; i < numberOfOs; i++) {
            // Print spaces before the 'O'
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Print the 'O'
            System.out.println("O");
        }
    }
}
