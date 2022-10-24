package selfPractice;
public class GasMileageApplication {
    double totalMiles;
    double totalGallons;
    public double getTripMilesPerGallonsObtained(int milesDriven, int gallonsUsed){
        return milesDriven / (double)gallonsUsed;
    }
    public double getTotalMilesDriven(){
        return totalMiles;
    }
    public double getTotalGallonsUsed(){
        return totalGallons;
    }
    public double getTotalMilesPerGallonsObtained(){
        return totalMiles / totalGallons;
    }
}
