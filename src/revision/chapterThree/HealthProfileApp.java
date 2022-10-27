package revision.chapterThree;

import chapterThree.HealthProfile;

import java.util.Scanner;

public class HealthProfileApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String secondName = input.nextLine();
        System.out.print("Enter your gender (male/female): ");
        String gender = input.nextLine();
        System.out.print("Enter your Date of birth (dd mm yyyy): ");
        int[] dateOfBirth = new int[3];
        for (int i = 0; i < 3; i++) {
            dateOfBirth[i] = input.nextInt();
        }
        System.out.printf("Input weight in pounds: ");
        double weight = input.nextDouble();
        System.out.printf("Input height in inches: ");
        double height = input.nextDouble();

        HealthProfile display = new HealthProfile(firstName, secondName, gender, dateOfBirth, height, weight);
        display.printHealthProfileInformation();
    }
}
