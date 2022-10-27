package selfPractice;

public class FactorsPositiveNumber {
    public static void main(String[] args) {
        int number = 60;
        System.out.print("Factors of " + number+ "are: ");
        for (int i = 1; i <= number; ++i){
            if (number % i == 0){ // if number is divided by i then i is the factors;
                System.out.print(i + " ");
            }
        }
    }
}
