package chapterThree;//3.12
public class PetrolPurchase {
    private  String stationLocation;
    private  String petrolType;
    private int quantity;
    private double priceLiter;
    private  double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double priceLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.priceLiter = priceLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }
    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }
    public String getPetrolType() {
        return petrolType;
    }
    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPriceLiter() {
        return priceLiter;
    }
    public void setPriceLiter(double priceLiter) {
        this.priceLiter = priceLiter;
    }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public double setPercentageDiscount(double percentageDiscount) {
        percentageDiscount = percentageDiscount / 100.0;//* (priceLiter * quantity);
        return percentageDiscount;
    }

    public double getPurchaseAmount(){
        double PurchaseAmount = ((quantity * priceLiter) - percentageDiscount);
        return PurchaseAmount;
    }

}
