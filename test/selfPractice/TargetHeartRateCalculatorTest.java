//package selfPractice;
//import chapterThree.HeartRate;
//
//import java.util.Scanner;
//public class TargetHeartRateCalculatorTest {
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter your first name: ");
//        String firstname = input.nextLine();
//
//        System.out.println("Enter your last name: ");
//        String lastname = input.nextLine();
//
//        System.out.println("Enter the day: ");
//        int day = input.nextInt();
//
//        System.out.println("Enter the month: ");
//        int month = input.nextInt();
//
//        System.out.println("Enter the year: ");
//        int year = input.nextInt();
//
//        HeartRate heart = new HeartRate(firstname, lastname,day,month,year);
//
//        System.out.printf("%s %s  date of birth is %d/%d/%d.%n %s %s age is %d%n", heart.getLastName(),
//                heart.getFirstName(),heart.getDay(),heart.getMonth(),heart.getYear(),
//                heart.getLastName(),heart.getFirstName() ,heart.displayAge());
//
//        System.out.printf("%s %s maximum heart rate is %d%n",heart.getLastName(),
//                heart.getFirstName(), heart.maximumHeartRate());
//
//        System.out.printf("%s %s target heart rate is %.2f%n",heart.getLastName(),
//                heart.getFirstName(), heart.targetHeartRate());
//
//   }
//}
