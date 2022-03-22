package chapterTwo;//2.35
public class GizaPyramidStatistics {
    public static void main(String[] args) {
    int estimatedNumbersOfStoneUsed = 2300000;
    double averageWeightOfEachStoneUsed = 2.5;
    int numberOfYearsToBuildThePyramid = 20;
    int numberOfSecondsInTwentyYears = 630720000;
    double totalWeightOfThePyramid = estimatedNumbersOfStoneUsed * averageWeightOfEachStoneUsed;
    double weightPyramidBuiltEachYear = (31536000 * totalWeightOfThePyramid) / numberOfSecondsInTwentyYears;
        System.out.printf("The estimated weight of pyramid built in a year is: %.2f tonnes %n", weightPyramidBuiltEachYear);
    double weightPyramidBuiltEachHour  = (3600 * totalWeightOfThePyramid) / numberOfSecondsInTwentyYears;
        System.out.printf("The estimated weight of pyramid built in an hour is: %.2f tonnes %n", weightPyramidBuiltEachHour);
    double weightPyramidBuiltEachMinute = (60 * totalWeightOfThePyramid) / numberOfSecondsInTwentyYears;
        System.out.printf("The estimated weight of pyramid built in a minute is: %.2f tonnes %n", weightPyramidBuiltEachMinute);
    }
}
