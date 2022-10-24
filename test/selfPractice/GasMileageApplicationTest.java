package chapterFour;
import java.util.Scanner;
public class GasMileageApplicationTest {
    public static void main(String[] args) {
        GasMileageApplication calculator = new GasMileageApplication();
        int milesDriven;
        int gallonsUsed;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Miles Driven for this trip: ");
        milesDriven = userInput.nextInt();
        while (milesDriven != 'y') {
            System.out.print("Enter Gallons used for this trip: ");
            gallonsUsed = userInput.nextInt();
            System.out.printf("Your MilesPerGallons obtained for this trip is: %.2f\n", calculator.getTripMilesPerGallonsObtained(milesDriven, gallonsUsed));
            System.out.print("Calculate another trip? (Enter y for yes and n for no)");


            System.out.println("=====================================================================================");
            System.out.println("Combined total miles per gallons obtained for trips");
            System.out.printf("Combined miles driven: %.2f\nCombined gallon used: %.2f\n", calculator.getTotalMilesDriven(), calculator.getTotalGallonsUsed());
            System.out.printf("Your combined total miles per gallons obtained for all trips is: %.2f\n", calculator.getTotalMilesPerGallonsObtained());
        }
    }
}