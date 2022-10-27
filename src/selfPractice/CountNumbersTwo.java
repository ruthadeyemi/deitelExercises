package selfPractice;

public class CountNumbersTwo {
    public static void main(String[] args) {
        int count = 0, number = 00034567;
        while (number != 0){
            number  /= 10;
            ++count;
        }
        System.out.println("number of digits: " +count);
    }
}
