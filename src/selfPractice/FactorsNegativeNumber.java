package selfPractice;
/**
declare and initialize number
print out number
run a for loop from negative to positive number with Math.abs
 skip the iteration for i = 0 using if, else if statement */

public class FactorsNegativeNumber {
    public static void main(String[] args) {
        int number = -20;
        System.out.print("Factors of " +number+ "are: ");
        for (int i = number; i <= Math.abs(number); ++i){
            if (i == 0){
                continue;
            }
            else {
                if (number % i == 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
