package chapterFour;//4.23
import java.util.Scanner;
public class TwoLargestNumbers {
    public void findTwoLargestNumbers() {
        Scanner userInput = new Scanner(System.in);
        int numberCounter = 1;
        int number;
        int firstLargestNumber;
        int secondLargestNumber;
        System.out.print("Enter a number: ");
        firstLargestNumber = userInput.nextInt();
        System.out.print("Enter a number: ");
        number = userInput.nextInt();
        if (number > firstLargestNumber){
            secondLargestNumber = firstLargestNumber;
            firstLargestNumber = number;
        }
        else
            secondLargestNumber = number;
        numberCounter = 2;
        while (numberCounter < 10){
            System.out.print("Enter a number: ");
            number = userInput.nextInt();
            if (number > firstLargestNumber){
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = number;
            }
            else if (number > secondLargestNumber)
                secondLargestNumber = number;
            numberCounter++;
        }
        System.out.printf("Largest number is: %d\nSecond largest number is: %d\n", firstLargestNumber, secondLargestNumber);
    }
}
