package interviewQuestions;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        int count = 0;
        for (int i = 0; i <= number; i++){
            if (number % 1 == 0){
                count++;
            }
        }
        if (count % 2 == 0)
            System.out.print(number+  " is a prime number");
        else
            System.out.println(number+ " is not a prime number");
    }
}
