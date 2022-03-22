package chapterTwo;
import java.util.Scanner;
public class PalinDrome{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		if (num1 == num5) {
			if (num2 == num4) {
				System.out.printf("%d %d %d %d %d is palindrome: ", num1, num2, num3, num4, num5);
			}
		}
		if (num1 != num5) {
			if (num2 != num4) {
				System.out.printf("%d %d %d %d %d is not palindrome: ", num1, num2, num3, num4, num5);
			}
}
}
} 