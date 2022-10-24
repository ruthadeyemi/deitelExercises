package examples;

import java.util.Scanner;
public class Acvanced {
    public  static void sumResult() {
        int sumTotal = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integer you want input: ");
        int[] sum = new int[input.nextInt()];
        for (int i = 1; i < sum.length; i++) {
            System.out.println("enter  number:" + i);
            sum[i] = input.nextInt();
        }
        for (int i : sum) {
            sumTotal *= i;
        }
        System.out.println(sumTotal);

    }
        public static void main (String[]args){

        }

}
