package chapterTwo;//2.32
import java.util.Scanner;
public class NegativePositiveZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveInteger = 0;
        int  negativeInteger = 0;
        int  zeroValue = 0;

        System.out.print("Enter first integer: ");
        int inputIntegers = input.nextInt();

        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter second integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter third integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter fourth integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.print("Enter fifth integer: ");
        inputIntegers = input.nextInt();
        if (inputIntegers == 0);
        zeroValue+=1;

        if (inputIntegers<0);
        negativeInteger+=1;

        if (inputIntegers>0);
        positiveInteger+=1;

        System.out.printf("Zero values %d", zeroValue);
        System.out.printf("Positive Integers %d", positiveInteger);
        System.out.printf("Negative Integers %d", negativeInteger);
    }

}
