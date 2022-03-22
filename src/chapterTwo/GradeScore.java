package chapterTwo;//student grades
import java.util.Scanner;
public class  GradeScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("Enter score:");
		score = input.nextInt();
		if (score > 90) {
			System.out.println(" A - excellent!");
		}
		if (score >= 80) {
			if (score < 90) {
				System.out.println(" B - very good!");
			}
		}
		if (score >= 70) {
			if (score < 80) {
				System.out.println("C-good!");
			}
		}
		if (score >= 60) {
			if (score < 70) {
				System.out.println("D - passed");
			}
		}
		if (score < 60) {
			System.out.println("F-failed!");
		}
	}
}

















