package selfPractice;

public class PrimeNumbers {
    public static void main(String[] args){

        boolean itsPrime = true;
        int counter =0;

        for (int i =2; i <= 10000; i++){
            itsPrime = true;

            for (int j =2; j < i; j++){
                if (i % j == 0){
                    itsPrime =false;
                    break;
                }
            }

            if (itsPrime){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of non prime numbers is "+counter);

    }
}
