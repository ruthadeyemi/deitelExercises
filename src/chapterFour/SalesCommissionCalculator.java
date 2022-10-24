package chapterFour;//4.19
import java.util.Scanner;
public class SalesCommissionCalculator {
   public void calculateForSalesCommission(){
       Scanner userInput = new Scanner(System.in);
               double salesPersonEarnings;
               double grossSales = 0.0;
               int item = 0;
               int numberOfSoldItems;
               while (item < 4){
                   item++;
                   System.out.printf("Enter number of sold items #%d: ", item);
                   numberOfSoldItems = userInput.nextInt();
                   if (item == 1) grossSales += numberOfSoldItems * 239.99;
                   else if (item == 2) grossSales += numberOfSoldItems * 129.75;
                   else if (item == 3) grossSales += numberOfSoldItems * 99.95;
                   else if (item == 4) grossSales += numberOfSoldItems * 350.89;
               }
               salesPersonEarnings = 0.09 * grossSales + 200;
       System.out.println();
       System.out.printf("Salesperson's earnings for last week: $%.2f\n", salesPersonEarnings);
   }
}
