package chapterTwo;
//2.10
public class StatementsDisplay {
    public static void main(String[] args) {
       // Assuming that x = 5 and y = 1, what does each of the following statements display?
        int x = 5;
        int y = 1;
        /*a)*/ System.out.printf("x = %d%n", x + 5); // x = 10
       /*b)*/ System.out.printf("Value of %d *%d is %d\n", x, y, (x * y) ); // value of 5 *1 is 5
        /*c)*/ System.out.printf("x is %d and y is %d", x, y); // x is 5 and y is 1
        /*d)*/ System.out.printf("%d is not equal to %d\n", (x + y), (x * y) ); // 16 is not equals to 5
    }
}
