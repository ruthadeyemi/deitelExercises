package classwork;

import java.util.Scanner;

public class KataDriver {

        public static void main(String[] args) {
            Scanner kata = new Scanner(System.in);
            System.out.println("Enter score");
            int grade =kata.nextInt();
            char result = Kata.calculateGradeFor(grade);
            System.out.println(result);
        }


}
