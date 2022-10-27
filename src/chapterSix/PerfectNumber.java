package chapterSix;

public class PerfectNumber {
        public static void main(String[] args) {
            System.out.println("Perfect Numbers Between 1 and 1000");

            for (int number = 1; number <= 1000; number++) {
                perfectNumbers(number);
            }
        }
        public static void perfectNumbers(int number) {
            int factorSum = 0;
            for (int divisor = 1; divisor < number; divisor++) {
                int factor;
                if (number % divisor == 0) {
                    factor = divisor;
                    factorSum += factor;
                }
            }
            if (factorSum == number) {
                System.out.printf("%d is a PerfectNumber: %n", number);
                for (int divisor = 1; divisor < number; divisor++) {
                    int factor;
                    if (number % divisor == 0) {
                        factor = divisor;

                        System.out.printf("%d is a factor of %d, %n", factor, number);
                    }
                }
                System.out.printf("Sum of the factors is: %d%n",factorSum);
                System.out.println();
            }
        }
}
