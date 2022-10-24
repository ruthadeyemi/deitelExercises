package interviewQuestions;
import java.util.ArrayList;

public class EnhancedForLoop {
    public static void main(String[] args) {
        ArrayList<String> cohortNine = new ArrayList();
        cohortNine.add("Emmanuel");
        cohortNine.add("Mary Jane");
        cohortNine.add("Esther");
        cohortNine.add("Ruth");
        cohortNine.add("Jerry");
        cohortNine.add("Increase");

        for (String names : cohortNine) {
            System.out.println(names);
        }
    }
}
