package chapterSix;
import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int programNumber = 20;
        int playerNumber = 0;
        System.out.print("I have a number. Guess the number ");
        //System.out.println("Enter your guess! Human.");
       // System.out.printf("%d",playerNumber);

        if (playerNumber == programNumber){
            System.out.print("congratulations! you guessed the number.");
        }
        else if (playerNumber > programNumber){
            System.out.printf("Too High.Try Again ", playerNumber );
        }
        else{  //(playerNumber < programNumber){
            System.out.printf("Too Low. Try Again ", playerNumber);

            }
           // return 0;
    }
}
