package chapterSix;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Enter any number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(isPerfect(number));
    }

    public static boolean isPerfect(int number) {
        boolean perfectNumber = false;
        if (number == 1)
            return false;

        int sum = 1;

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }
        // If sum of divisors is equal to
        // n, then n is a perfect number
        if (sum == number)
            perfectNumber = true;
    return perfectNumber;
    }
}
