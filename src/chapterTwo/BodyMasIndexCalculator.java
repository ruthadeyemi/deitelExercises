package chapterTwo;
//2.33
import java.util.Scanner;
public class BodyMasIndexCalculator {
    public static void main(String[] args) {
        Scanner reads = new Scanner(System.in);
        System.out.println("Enter your body weight in pounds from 115 to 443:");
        int weightInPounds = reads.nextInt();
        System.out.println("Enter your height in inches from 58 to 76:");
        int heightInInches = reads.nextInt();
        int BMI = weightInPounds * 703 / heightInInches * heightInInches;
        System.out.print(weightInPounds *703);
        System.out.println("Your Body Mass Index is: " +BMI);

    }
}
