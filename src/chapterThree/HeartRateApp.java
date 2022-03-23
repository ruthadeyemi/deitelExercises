package chapterThree;
import java.util.Scanner;
public class HeartRateApp {
        public static void main(String[] args) {
            Scanner calculate = new Scanner(System.in);
            System.out.print("Enter first name: ");
            String firstName = calculate.nextLine();
            System.out.print("Enter last name: ");
            String lastName = calculate.nextLine();
            System.out.print("Enter your day of birth: ");
            int day = calculate.nextInt();
            System.out.print("Enter your month of birth: ");
            int month = calculate.nextInt();
            System.out.print("Enter your Year of birth: ");
            int year = calculate.nextInt();
            HeartRate heart = new HeartRate(firstName, lastName,day,month,year);
            System.out.println();
            System.out.print("========User Information========");
            System.out.println("\t\nFirstName: " +firstName+"\t\nlastName: " +lastName+ "\t\nAge: " + heart.calculateForAge());
            heart.targetHeartRate();

        }
}
