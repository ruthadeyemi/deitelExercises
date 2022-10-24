package chapterFour;//4.17
import java.util.Scanner;
public class GasMileage {
    public void milesDrivenAndGallonsUsed() {
        Scanner input = new Scanner(System.in);
        int milesDriven;
        int gallonsUsed;
        int totalMilesDriven = 0;
        int totalGallonsUsed = 0;
        double milesPerGallons;
        double totalMilesPerGallons;
        System.out.print("Enter miles driven for this trip {-1 to quit}: ");
        milesDriven = input.nextInt();
        while (milesDriven != -1){
            System.out.print("Enter gallons used for this trip: ");
            gallonsUsed = input.nextInt();
            totalMilesDriven += milesDriven;
            totalGallonsUsed += gallonsUsed;
            if (gallonsUsed != 0){
                milesPerGallons = (double) milesDriven / gallonsUsed;
                System.out.printf("Miles driven and gallons used for this tankful is: %.2f\n", milesPerGallons);
            }
            if (totalGallonsUsed != 0){
                totalMilesPerGallons = (double) totalMilesDriven / totalGallonsUsed;
                System.out.printf("Total miles driven and gallons used is: %.2f\n", totalMilesPerGallons);
            }
            System.out.print("Enter miles driven {-1 to quit}:");
            milesDriven = input.nextInt();
        }
    }
}
