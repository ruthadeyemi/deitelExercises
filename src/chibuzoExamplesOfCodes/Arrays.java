package chibuzoExamplesOfCodes;
import java.util.Scanner;
public class Arrays{
    public static void main(String[] args) {
        Scanner grade = new Scanner(System.in);
        // System.out.println("Enter a score");
        int NUMBER_OF_USER_INPUT = 5;
        int[] number;
        number = new int[5];
        int totalScores = 0;
        System.out.println("Enter a score");
        int maximumNumber = number[0];
        for (int enter = 0; enter < 5; enter++) {
            number[enter] = grade.nextInt();
        }
        // System.out.println("Enter a score");

        //  for (int enter = 0; enter < totalScores.lenght;)
        //    maximumNumber =Math.max(maximumNumber,number[enter]);
        // System.out.print(studentScore[enter] + " ");
        // for (int i = 0; i < studentScore; i++) ;
        // System.out.print(studentScore[i] + " ");
    }

}
