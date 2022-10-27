package revision.chapterTwo;
import  java.util.Scanner;
public class BodyMassIndexCalculator {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in kg: ");
        double height = input.nextInt();
        System.out.print("Enter your weight in kg: ");
        double weight = input.nextInt();

        double bmi = weight / (height*height);

        System.out.println("Your BMI is "+bmi);

        if(bmi < 18.5){
        System.out.println("You are UNDERWEIGHT");
    }

        if (bmi >= 18.5){
        if (bmi <= 24.9){
            System.out.println("You are NORMAL weight");
        }
    }

        if (bmi >= 25){
        if (bmi <= 29.9){
            System.out.println("You are OVERWEIGHT");
        }
    }

        if (bmi >= 30){
        System.out.println("You are OBESE");
    }
}


}
