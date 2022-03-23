package chapterFour;//4.30
import java.util.Scanner;
public class RightAngledTriangle {
    public static void main(String[] args) {

        int no_row,c=1,blk,i,j;
        System.out.print("Input number of rows: ");
        Scanner in = new Scanner(System.in);
        no_row = in.nextInt();
        for(i=0;i<no_row;i++)
        {
            for(blk=1;blk<=no_row-i;blk++)
                System.out.print(" ");
            for(j=0;j<=i;j++)
            {
                if (j==0||i==0)
                    c=1;
                else
                    c=c*(i-j+1)/j;
                System.out.print(" "+c);
            }
            System.out.print("\n");
        }


//        int i,j,n;
//        System.out.print("Input number of rows : ");
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//
//        for(i=1;i<=n;i++)
//        {
//            for(j=1;j<=i;j++)
//                System.out.print(j);
//
//            System.out.println("");
//        }
    }
}
