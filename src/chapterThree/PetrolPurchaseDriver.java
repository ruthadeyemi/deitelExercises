package chapterThree;
import java.util.Scanner;
class PetrolPurchaseDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PetrolPurchase purchaseInformation = new PetrolPurchase("Petrocam", "Oil", 50, 180.10, 3.5);
        System.out.println("Display of your purchase");
        System.out.printf("Station location is: %s%n", purchaseInformation.getStationLocation());
        System.out.printf("petrol type is: %s%n", purchaseInformation.getPetrolType());
        System.out.printf("Quantity of petrol is: %d%n", purchaseInformation.getQuantity());
        System.out.printf("Price per liter is: %.2f%n", purchaseInformation.getPriceLiter());
        System.out.printf("Discount is; %.2f%n", purchaseInformation.getPercentageDiscount());
        System.out.printf("Net purchase amount is: %.2f%n", purchaseInformation.getPurchaseAmount());

    }
}