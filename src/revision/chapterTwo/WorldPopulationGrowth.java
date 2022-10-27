package revision.chapterTwo;
public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double currentWorldPopulation = 7_900_000_000.;
        double growthRate = 1.05;
        System.out.printf(" The world population is currently %f billion %n ", currentWorldPopulation);
        System.out.printf("Annual World population growth rate is %f percent %n ", growthRate);

        growthRate = growthRate / 100;
        double yearOne = currentWorldPopulation + ( currentWorldPopulation *  growthRate );
        System.out.print("next one year = " +yearOne+ "\n");
        currentWorldPopulation = (long) yearOne;
        double yearTwo = currentWorldPopulation + ( currentWorldPopulation * growthRate );
        System.out.print(" next two year = " +yearTwo+ "\n");
        currentWorldPopulation = (long) yearTwo;
        double yearThree = currentWorldPopulation + ( currentWorldPopulation * growthRate );
        System.out.print(" next three year = " +yearThree+ "\n");
        currentWorldPopulation = (long) yearThree;
        double yearFour = currentWorldPopulation + ( currentWorldPopulation * growthRate );
        System.out.print(" next four year = " +yearFour+ "\n");
        currentWorldPopulation = (long) yearFour;
        double yearFive = currentWorldPopulation + ( currentWorldPopulation * growthRate );
        System.out.print(" next five year = " +yearFive+ "\n");
    }
}
