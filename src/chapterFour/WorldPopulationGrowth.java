package chapterFour;//4.40
import java.util.Scanner;
public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner people = new Scanner(System.in);
        long  worldPopulation;
        double worldPopulationGrowthRate;
        System.out.println("What's the current world population?");
        worldPopulation = people.nextLong();
        System.out.println("What's the current world population growth rate?");
        worldPopulationGrowthRate = people.nextDouble();
        worldPopulationGrowthRate/=100;
        for (int year = 1; year <=75; year++ ){
          long currentWorldPopulation = (long) (worldPopulation + (worldPopulation *  worldPopulationGrowthRate) * year);
            System.out.printf("%d\t%d\n", year, currentWorldPopulation);
        }

    }
}
