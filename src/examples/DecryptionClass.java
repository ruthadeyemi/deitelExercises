package examples;

import java.util.Scanner;

public class DecryptionClass {
    public static void main(String[] args) {
        int addedNumber =7;
        int originalDigit1 =0, originalDigit2 =0, originalDigit3 =0, originalDigit4 =0;


        System.out.println("Enter the encrypted digits to decrypt");
        Scanner input = new Scanner(System.in);
        int digits = input.nextInt();

        int digit1 = digits/1000;
        int digit2 = (digits % 1000)/100;
        int digit3 = (digits % 100) /10;
        int digit4 = (digits %10);

        System.out.println("Entered Digits are;\n"+digit1+ " \n"+digit2+" \n"+digit3+" \n"+digit4);
        System.out.println();


        if (digit1  > addedNumber){
            originalDigit1 = digit1 - addedNumber;
        }else {
            if (digit1 < addedNumber && digit1 >0)
            {
                originalDigit1 = digit1 +3;
            }else{
                if (digit1 ==0){
                    originalDigit1 =3;
                }
            }
        }


        if (digit2  > addedNumber)
        {
            originalDigit2 = digit2 - addedNumber;
        }else{
            if (digit2 < addedNumber && digit2 >0){
                originalDigit2 = digit2 +3;
            }else {
                if (digit2 ==0){
                    originalDigit2 =3;
                }
            }
        }


        if (digit3 > addedNumber)
        {
            originalDigit3 = digit3 - addedNumber;
        }else{
            if (digit3 < addedNumber && digit3 >0){
                originalDigit3 = digit3 +3;
            }else {
                if (digit3 ==0){
                    originalDigit3 =3;
                }
            }
        }



        if (digit4  > addedNumber)
        {
            originalDigit4 = digit4 - addedNumber;
        }else{
            if (digit4 < addedNumber && digit4 >0){
                originalDigit4 = digit4 +3;
            }else {
                if (digit4 ==0){
                    originalDigit4 =3;
                }
            }
        }

        System.out.printf("The Original digits are %d %d %d %d", originalDigit1, originalDigit2, originalDigit3, originalDigit4);

    }
}
