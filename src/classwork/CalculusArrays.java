package classwork;

import java.util.Scanner;
public class CalculusArrays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] score = new int[10];
        int sum = 0;
         double average = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n = 0; n < 10; n++) {
            System.out.println("Enter a score");
            score[n] = input.nextInt();
            sum = sum + score[n];
            average = sum/score[n];
            if (score[n] > max) {
                max = score[n];
            }
            if (score[n] < min) {
                min = score[n];
            }

        }
        System.out.println("Average = " + average);
        System.out.println("sum = " + sum);
        System.out.println("your minimum = " + min);
        System.out.println("your maximum =" + max);

    }

}