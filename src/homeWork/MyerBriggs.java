package MyProject;

import java.util.Scanner;

public class MyerBriggs {
 private static int counta1=0;
   private static int countb1=0;
   private static int counta2=0;
    private static int countb2=0;
   private static int counta3=0;
    private static int countb3=0;
   private static int counta4=0;
    private static int countb4=0;
    private static  int counta5=0;
    private  static  int countb5=0;
    private static String person;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("are you a logical thinker or a feeler?");
        String question1=scanner.next();
        if (question1.equals("a")){counta1++;
        }
        else if (question1.equals("b")){countb1++;}


        System.out.println("are you outgoing or reserved?");
        String question5= scanner.next();
        if (question5.equals("a")){counta2++;
        }
        else if (question5.equals("b")){countb2++;}


        System.out.println("are you a planner or are you spontaneous?");
        String question9= scanner.next();
        if (question9.equals("a")){counta3++;
        }
        else if (question9.equals("b")){countb3++;}


        System.out.println("are you a people pleaser or do you like being by yourself?");
        String question13= scanner.next();
        if (question13.equals("a")){counta4++;
        }
        else if (question13.equals("b")){countb4++;}


        System.out.println("are you a team player or a loner?");
        String question17= scanner.next();
        if (question1.equals("a")){counta5++;
        }
        else if (question17.equals("b")){countb5++;}

        if ((counta1+counta2+counta3+counta4+counta4+counta5)>(countb1+countb2+countb3+countb4+countb5)){
            person="E";
        }
        else person="I";


        System.out.printf("%d  %d %n %d %d %n %d %d %n %d  %d %n %d  %d", counta1, countb1, counta2, countb2, counta3, countb3, counta4, countb4, counta5, countb5);
        System.out.println();
        System.out.println(person);

    }
}
