package selfPractice;
public class SwapTwoVariables {
    public static void main(String[] args) {
        String C = "Chocolate";
        String M = "Milk";
        String beverages;
        beverages = C;
        C = M;
        M = beverages;
        System.out.println("C: " +C);
        System.out.println("M: " +M);
    }
}
