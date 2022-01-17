package chapterTwo;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        System.out.println(" enter the first number");
        Scanner ruth =new Scanner(System.in);
        int firstNumber=ruth.nextInt();
        System.out.println("enter second Number");
        int secondNumber=ruth.nextInt();
        int sum = firstNumber+secondNumber;
        System.out.printf(" the sum is %d", sum);
    }


}
