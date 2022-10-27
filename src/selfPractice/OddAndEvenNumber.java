package selfPractice;

public class OddAndEvenNumber {
    public static void main(String[] args) {
        int number = 1;
        int count;
        while (number < 100) {
            number++;
            if (number % 2 != 0){
                System.out.printf(" %d%n", number);
                System.out.println();
            }
             else if (number % 2 == 0)
                System.out.printf(" %d%n", number);
        }
//        for (count = 1; count <= 20; count++) {
//            if (count % 2 !=  0) {
//                System.out.printf("Odd numbers from 1 to 20 are" + count);
//            }
//            else {
//
//                System.out.printf("Even numbers from 1 to 22 are" + count);
//            }
//        }

    }
}
