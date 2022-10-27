import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int maximumNumber = 15;
        int inputedNumber;
        boolean correct =false;
        int count =0;
        int count2 =0;
        int switchCase;

        Random random = new SecureRandom();
        int rightGuess = random.nextInt(maximumNumber);

        do{
            System.out.println("Enter a number to guess");
            inputedNumber = input.nextInt();

            if(inputedNumber < rightGuess) {
                System.out.println("Too low, try again");
            }else if(inputedNumber > rightGuess)
            {
                System.out.println("Too high, try again");
            }
            count = count +1;


            if (inputedNumber == rightGuess) {
                System.out.println("Congrats!!! \nYou guessed the number");
                break;
            }
        }while (inputedNumber != rightGuess);
        System.out.println("Your entry was "+count+" times");


        if (count <=10){
            System.out.println("Aha!, you know the secret");
        }else {
            System.out.println("You should be able to do better ");
        }

        do {
            System.out.println();
            System.out.println("Do you want to play again?\nPress 1 for yes and 2 for No");
            switchCase = input.nextInt();
            switch (switchCase) {
                case 1:
                    do {
                        System.out.println("Enter a number to guess");
                        inputedNumber = input.nextInt();

                        if (inputedNumber < rightGuess) {
                            System.out.println("Too low, try again");
                        } else if (inputedNumber > rightGuess) {
                            System.out.println("Too high, try again");
                        }
                        count2 = count2 + 1;

                        if (inputedNumber == rightGuess) {
                            System.out.println("Congrats!!! \nYou guessed the number");
                            break;
                        }

                    } while (inputedNumber != rightGuess);
                    System.out.println("Your entry was "+count2+" times");
                    break;
                case 2:
                    System.exit(2);
            }
        }while (correct =true);
    }
}
