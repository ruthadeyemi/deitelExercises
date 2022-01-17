package classwork;
public class Kata {
    public static char calculateGradeFor(int score) {
        // if (score > 100) return (String) "Invalid score";
        if (score >= 90) return 'A';
        if (score >= 80 && score < 90) return 'B';
        if (score >= 70 && score < 80) return 'C';
        if (score >= 60 && score < 70) return 'D';
        if (score < 60) return 'F';
        return 0;
    }

//    public static int calculateTotalOf(int[] numbers) {
//        int[] score = new int[5];
//        int sum = 0;
//        int n;
//        double average = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (n = 0; n < 5; n++) {
//            sum = sum + score[n];
//            average = sum / score[n];
//            //  return sum;
//        }
//        return sum;
//
//    }
//
//    public static int calculateMinimumOf(int[] numbers) {
//        for(score[n] < min){
//         min = score[n];
//        }
//    }
}