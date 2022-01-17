package homeWork;

public class PatternA {
    public static void main(String[] args) {
        int number;
        int row;
        for (number = 1; number <= 6; number++){
        for (row =1; row <= number; row++){
            System.out.print(row+ " ");
        }
            System.out.println();
        }
    }
}
