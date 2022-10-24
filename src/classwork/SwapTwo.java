package classwork;
public class SwapTwo {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        a = a * b; // x now becomes 50
        b = a / b; // y becomes 10
        a = a / b; // x becomes 5

        System.out.println("After swapping:"
                + " a = " + a + ", b = " + b);
    }
}
