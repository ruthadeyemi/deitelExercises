package chapterFour;
//4.22
public class TabularOutput {
    public static void main(String[] args){
        System.out.println("N   N2       N3       N4");
            int N = 1;
            while (N <= 5){
                System.out.printf("%d\t%d\t\t%d\t\t%d\n",N,(10*N),(100*N),(1000*N));
                N++;
            }
    }
}
