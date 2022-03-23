package chapterFour;//4.34
import java.util.Scanner;
public class ReadNumbersUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int numberCounter = 1;
        while (numberCounter<=5) {
            System.out.print("Enter a number:");
            int number = ask.nextInt();
            numberCounter++;
        }


    }
}
