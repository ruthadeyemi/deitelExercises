package chapterFour;
import java.util.Scanner;
public class GasMileageApplicationTest {
    public static void main(String[] args) {
     int milesDriven;
     int gallonsUsed;
     char count = 'y';
     Scanner userInput = new Scanner(System.in);
     GasMileageApplication calculator = new GasMileageApplication();
     while (count != 'y'){
         System.out.print("Enter Miles Driven for this trip: ");
         milesDriven = userInput.nextInt();
         System.out.print("Enter Gallons used for this trip: ");
         gallonsUsed = userInput.nextInt();
         System.out.printf("Your MilesPerGallons obtained for this trip is: %.2f\n", calculator.getTripMilesPerGallonsObtained(milesDriven,gallonsUsed));
         System.out.print("Calculate another trip? (Enter y for yes and n for no)");
         count = userInput.next().charAt(0);
     }
        System.out.println("=====================================================================================");
        System.out.println("Combined total miles per gallons obtained for trips");
        System.out.printf("Combined miles driven: %.2f\nCombined gallon used: %.2f\n", calculator.getTotalMilesDriven(),calculator.getTotalGallonsUsed());
        System.out.printf("Your combined total miles per gallons obtained for all trips is: %.2f\n", calculator.getTotalMilesPerGallonsObtained());
    }
}