package examples;

public class PatternD {
    public static void main(String[] args) {
        int num = 0;
        int count = 1;

        for (num = 1; num <= 6; num++) {
            count = count + 1;
            System.out.print(num + " ");
        }
        System.out.println();
        for (num = 1; num <= 5; num++) {
            for (count=1; count<=1;count++){
                System.out.print("  ");
            }
           for (num=1; num<= 5; num++){
               System.out.print(num+" ");
           }
        }
        System.out.println();
        for (num = 1; num <= 4; num++) {
            for (count=1; count<=1;count++){
                System.out.print("    ");
            }
            for (num=1; num<= 4; num++){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        for (num = 1; num <= 3; num++) {
            for (count=1; count<=1;count++){
                System.out.print("      ");
            }
            for (num=1; num<= 3; num++){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        for (num = 1; num <= 2; num++) {
            for (count=1; count<=1;count++){
                System.out.print("        ");
            }
            for (num=1; num<= 2; num++){
                System.out.print(num+" ");
            }
        }
        System.out.println();
        for (num = 1; num <= 1; num++) {
            for (count=1; count<=1;count++){
                System.out.print("          ");
            }
            for (num=1; num<= 1; num++){
                System.out.print(num+" ");
            }
        }

    }
}




