package classwork;//14.3
import  java.util.Scanner;
public class ComparingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string");
        String stringOne = scanner.nextLine();
        System.out.print("Enter the second string");
        String stringTwo = scanner.nextLine();
        System.out.println(stringOne.compareTo(stringTwo));

        if (stringOne.compareTo(stringTwo) > 0)
            System.out.println("the first string is greater than the second one");
        else if (stringOne.compareTo(stringTwo) < 0)
            System.out.println(" the first string is lesser than the second one");
        else
            System.out.println("both string are equals");
    }
}
