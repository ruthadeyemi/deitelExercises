package chapterTwo;
//2.34
import java.util.Scanner;
public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print( "Enter the current world population (exclude commas): ");
        long currentPopulation = input.nextLong();
        System.out.print( "Enter the annual world population growth rate: ");
        double growthRate = input.nextDouble();
        growthRate = growthRate / 100;
        double yearOne = currentPopulation + ( currentPopulation *  growthRate );
        System.out.print("next one year = " +yearOne+ "\n");
          currentPopulation = (long) yearOne;
          double yearTwo = currentPopulation + ( currentPopulation * growthRate );
        System.out.print("next two year = " +yearTwo+ "\n");
          currentPopulation = (long) yearTwo;
        double yearThree = currentPopulation + ( currentPopulation * growthRate );
        System.out.print("next three year = " +yearThree+ "\n");
        currentPopulation = (long) yearThree;
        double yearFour = currentPopulation + ( currentPopulation * growthRate );
        System.out.print("next four year = " +yearFour+ "\n");
        currentPopulation = (long) yearFour;
        double yearFive = currentPopulation + ( currentPopulation * growthRate );
        System.out.print("next five year = " +yearFive+ "\n");


    }
}
