package examples;    // Psuedocode
/* Prompt the user to enter input
   Save the input to a variable
   compare the input to a given number
   System.out.println. the price amount base on the given price multiply the price by the userinput */

   import java.util.Scanner;

public class TestDriller {

    public static void main(String[] args) {
        int copies;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter How Many Copies You Want To Buy: ");
        copies = input.nextInt();
	int option1price = 2000;
	int option2price = 1800;
	int option3price = 1600;
	int option4price = 1500;
	int option5Price = 1300;
	int option6price = 1200;
	int option7price = 1100;
	int option8price = 1000;
        if(copies >= 1 && copies <= 4 ){
            System.out.println(2000 * copies + " Is Your Price Bill. Thanks!!! ");
        }else{
            if (copies >= 5 && copies <= 9){
                System.out.println(1800 * copies + " Is Your Price Bill. Thanks!!! ");
            }else {
                if (copies >= 10 && copies <= 29){
                    System.out.println(1600 * copies + " Is Your Price Bill. Thanks!!! ");
                }else {
                    if (copies >= 30 && copies <= 49){
                        System.out.println(1500 * copies + " Is Your Price Bill. Thanks!!! ");
                    }else {
                        if (copies >= 50 && copies <= 99){
                            System.out.println(1200 * copies + " Is Your Price Bill. Thanks!!! ");
                        }else {
                            if (copies >= 100 && copies <= 199){
                                System.out.println(1200 * copies + " Is Your Price Bill. Thanks!!! ");
                            }else {
                                if (copies >= 200 && copies <= 499 ){
                                    System.out.println(1100 * copies + " Is Your Price Bill. Thanks!!! ");
                                }else {
                                    if (copies >= 500){
                                        System.out.println(1000 * copies + " Is Your Price Bill. Thanks!!! ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}