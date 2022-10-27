package revision.chapterThree;

import chapterThree.PetrolPurchase;

public class PetrolPurchaseDriverClass {
    public static void main(String[] args) {
        chapterThree.PetrolPurchase purchaseInformation = new PetrolPurchase("World Oil", "kerosine", 10, 120.65, 20.5);
        System.out.println("Display of your purchase");
        System.out.printf("Station location is: %s%n", purchaseInformation.getStationLocation());
        System.out.printf("petrol type is: %s%n", purchaseInformation.getPetrolType());
        System.out.printf("Quantity of petrol is: %d%n", purchaseInformation.getQuantity());
        System.out.printf("Price per liter is: %.2f%n", purchaseInformation.getPriceLiter());
        System.out.printf("Discount is; %.2f%n", purchaseInformation.getPercentageDiscount());
        System.out.printf("Net purchase amount is: %.2f%n", purchaseInformation.getPurchaseAmount());
    }
}
