package chapterFour;//4.36
import java.util.Scanner;
public class Comparator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter two integer numbers separately:");
        int firstNumber = read.nextInt();
        int secondNumber = read.nextInt();
        if (firstNumber == secondNumber){
            System.out.print(0);
        }
        if (firstNumber > secondNumber){
            System.out.print(1);
        }
        if (secondNumber > firstNumber){
            System.out.print(-1);
        }
    }
}
