//Asia M Chap4 Assignment1 2/12

import java.util.Random;

public class MathCalculations {

    public static void main(String[] args) {
    	
        double squareRootOf37 = Math.sqrt(37);
        System.out.printf("The square root of 37 is %.2f.%n", squareRootOf37);

        
        double angleInDegrees = 300;
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sineOf300 = Math.sin(angleInRadians);
        double cosineOf300 = Math.cos(angleInRadians);
        System.out.printf("The sine of 300 degrees is %.4f.%n", sineOf300);
        System.out.printf("The cosine of 300 degrees is %.4f.%n", cosineOf300);

        double value = 22.8;
        double floorValue = Math.floor(value);
        double ceilingValue = Math.ceil(value);
        long roundedValue = Math.round(value);
        System.out.printf("The floor of 22.8 is %.1f.%n", floorValue);
        System.out.printf("The ceiling of 22.8 is %.1f.%n", ceilingValue);
        System.out.printf("The rounded value of 22.8 is %d.%n", roundedValue);

        char characterD = 'D';
        int integer71 = 71;
        int largerValue = Math.max(characterD, integer71);
        int smallerValue = Math.min(characterD, integer71);
        System.out.printf("The larger of 'D' and 71 is %d.%n", largerValue);
        System.out.printf("The smaller of 'D' and 71 is %d.%n", smallerValue);

        Random random = new Random();
        int randomNumber = random.nextInt(21); 
        System.out.printf("A random number between 0 and 20 is %d.%n", randomNumber);
    }
}