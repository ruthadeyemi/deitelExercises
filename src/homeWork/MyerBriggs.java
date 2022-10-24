package homeWork;

import java.util.Scanner;

public class MyerBriggs {
   private static final Scanner scanner = new Scanner(System.in);
    private static String characterTrait;
    private static String characterTraitA;
    private static String characterTraitB;
    private static String characterTraitC;
    private static String characterTraitD;

    public static void main(String[] args) {
        System.out.println("please enter your name:");
        String name = scanner.next();
        System.out.println("Hello " +name+ " Welcome to Myer briggs question personality test. input option a or b below: ");
        checkForExtrovertsAndIntrovert();
        checkForSensitiveAndIntuitive();
        checkForThinkersAndFeelers();
        checkForJudgementalAndPerceives();
        displayPersonalityTraits();
    }

    private static void displayPersonalityTraits() {
        System.out.println("============================================================================================");
        System.out.println("Your personality type is "  +characterTraitA+ " " + characterTraitB+ " " + characterTraitC + " " +characterTraitD);
    }

    private static void checkForJudgementalAndPerceives() {
        int countAOne=0;
        int countBOne = 0;
        System.out.println("Question 16:(a) Preparation,plan ahead or (b) Go with the flow,adapt as you go");
        String question4 = scanner.next();
        if (question4.equals("a")){countAOne++;}
        else if (question4.equals("b")){countBOne++;}

        System.out.println("Question 17:(a) Active, initiate or (b) Reflective,deliberate");
        String question8 = scanner.next();
        if (question8.equals("a")){countAOne++;}
        else if (question8.equals("b")){countBOne++;}

        System.out.println("Question 18:(a) Facts,things,'what is' or (b) Ideals,dreams,'what could be,' philosophical");
        String question12 = scanner.next();
        if (question12.equals("a")){countAOne++;}
        else if (question12.equals("b")){countBOne++;}

        System.out.println("Question 19:(a) Matter of fact, issue-oriented or (b) Sensitive.people-oriented,compassionate");
        String question16 = scanner.next();
        if (question16.equals("a")){countAOne++;}
        else if (question16.equals("b")){countBOne++;}

        System.out.println("Question 20:(a) Control,govern or (b) Latitude,freedom");
        String question20 = scanner.next();
        if (question20.equals("a")){countAOne++;}
        else if (question20.equals("b")){countBOne++;}

        if ((countAOne)>(countBOne)){
            characterTrait = "J:judgemental";}
        else characterTrait = "P:perceives";

        System.out.printf("%d %d %n", countAOne, countBOne);
        System.out.println();
        System.out.println("Your character trait is " +characterTrait);
        characterTraitA = characterTrait;
        System.out.println("============================================================================================");
    }

    private static void checkForThinkersAndFeelers() {
        int countAOne=0;
        int countBOne = 0;
        System.out.println("Question 11:(a) Firm,tend to criticize,hold the line or (b) gentle,tend to appreciate, conciliate");
        String question3 = scanner.next();
        if (question3.equals("a")){countAOne++;}
        else if (question3.equals("b")){countBOne++;}

        System.out.println("Question 12:(a) Regulated,structured or (b) Easy going,'live' and 'let live'");
        String question7 = scanner.next();
        if (question7.equals("a")){countAOne++;}
        else if (question7.equals("b")){countBOne++;}

        System.out.println("Question 13:() External, communicative, express yourself or (b) Internal,reticent,keep to yourself");
        String question11 = scanner.next();
        if (question11.equals("a")){countAOne++;}
        else if (question11.equals("b")){countBOne++;}

        System.out.println("Question 14:(a) Focus on here-and-now or (b) Look for the future,global perspective, 'big picture'");
        String question15 = scanner.next();
        if (question15.equals("a")){countAOne++;}
        else if (question15.equals("b")){countBOne++;}

        System.out.println("Question 15:(a) Tough-minded,just or (b) Tender-hearted, merciful");
        String question19 = scanner.next();
        if (question19.equals("a")){countAOne++;}
        else if (question19.equals("b")){countBOne++;}

        if ((countAOne)>(countBOne)){
            characterTrait = "T:thinkers";}
        else characterTrait = "F:feelers";

        System.out.printf("%d %d %n", countAOne, countBOne);
        System.out.println();
        System.out.println("Your character trait is " +characterTrait);
        characterTraitB = characterTrait;
        System.out.println("===========================================================================================");

    }

    private static void checkForSensitiveAndIntuitive() {
        int countAOne=0;
        int countBOne = 0;
        System.out.println("Question 6:(a) Practical,realistic,experiential or (b) Imaginative, innovative,theoretical");
        String question2 = scanner.next();
        if (question2.equals("a")){countAOne++;}
        else if (question2.equals("b")){countBOne++;}

        System.out.println("Question 7:(a) candid, straight forward,frank or (b) tactful,kind,encouraging");
        String question6 = scanner.next();
        if (question6.equals("a")){countAOne++;}
        else if (question6.equals("b")){countBOne++;}

        System.out.println("Question 8:(a) Plan,schedule or (b) Unplanned, spontaneous");
        String question10 = scanner.next();
        if (question10.equals("a")){countAOne++;}
        else if (question10.equals("b")){countBOne++;}

        System.out.println("Question 9:(a) Seek many task,public activities,interaction with others or (b) Seek private,solitary activities with quiet to concentrate");
        String question14 = scanner.next();
        if (question14.equals("a")){countAOne++;}
        else if (question14.equals("b")){countBOne++;}

        System.out.println("Question 10:(a) Standard,usual,conventional or (b) Different,novel,unique");
        String question18 = scanner.next();
        if (question18.equals("a")){countAOne++;}
        else if (question18.equals("b")){countBOne++;}

        if ((countAOne)>(countBOne)){
            characterTrait = "S:sensitive";}
        else characterTrait = "N:intuitive";

        System.out.printf("%d %d %n", countAOne, countBOne);
        System.out.println();
        System.out.println("Your character trait is " +characterTrait);
        characterTraitC = characterTrait;
        System.out.println("============================================================================================");

    }

    private static void checkForExtrovertsAndIntrovert() {
        int countAOne=0;
        int countBOne = 0;
        System.out.println("Question 1:(a) Expend energy,enjoy groups or (b) Conserve energy,enjoy one-one.");
        String question1 = scanner.next();
        if (question1.equals("a")){countAOne++;}
        else if (question1.equals("b")){countBOne++;}

        System.out.println("Question 2:(a) Interpret literally, or (b) Look for meaning and possibilities");
        String question5 = scanner.next();
        if (question5.equals("a")){countAOne++;}
        else if (question5.equals("b")){countBOne++;}

        System.out.println("Question 3:(a) Logical,thinking,questioning or (b) empathetic,feeling,accommodating");
        String question9 = scanner.next();
        if (question9.equals("a")){countAOne++;}
        else if (question9.equals("b")){countBOne++;}

        System.out.println("Question 4:(a) Organized,orderly or (b) Flexible, adaptable");
        String question13 = scanner.next();
        if (question13.equals("a")){countAOne++;}
        else if (question13.equals("b")){countBOne++;}

        System.out.println("Question 5:(a) More outgoing, think out loud or (b) More reserved,think to yourself");
        String question17 = scanner.next();
        if (question17.equals("a")){countAOne++;}
        else if (question17.equals("b")){countBOne++;}

        if ((countAOne)>(countBOne)){
            characterTrait = "E:extrovert";}
        else characterTrait = "I:introvert";

        System.out.printf("%d %d %n", countAOne, countBOne);
        System.out.println();
        System.out.println("Your character trait is " +characterTrait);
        characterTraitD = characterTrait;
        System.out.println("============================================================================================");

    }
}
