package interviewQuestions;
public class ReverseWord {
    public static void main(String[] args) {
        String input = "cohort_nine";
        char[] reverse = input.toCharArray();
        for (int i = reverse.length - 1; i >= 0; i--)
            System.out.print(reverse[i]);
    }
}
