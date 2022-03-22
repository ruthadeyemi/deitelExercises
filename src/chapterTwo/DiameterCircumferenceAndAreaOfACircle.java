package chapterTwo;
//2.28
import java.util.Scanner;
public class DiameterCircumferenceAndAreaOfACircle {
    public static void main(String[] args) {
        Scanner numerics = new Scanner(System.in);
        System.out.print("Enter any radius number of your choice: ");
        int radius = numerics.nextInt();
        int diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * 2 * 2;
        System.out.printf("Diameter is: %d \nArea is %.2f \nCircumference is: %.2f ", diameter, area, circumference);
    }
}
