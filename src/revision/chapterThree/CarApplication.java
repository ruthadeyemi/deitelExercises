package revision.chapterThree;
public class CarApplication {
    public static void main(String[] args) {
        Car modelOne = new Car("Toyota","2002",12000000);
        Car modelTwo = new Car("Lambo","2024",55000000);

        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n ",modelOne.getModel(),modelOne.getYear(),modelOne.getPrice());
        System.out.println();
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n%n ",modelTwo.getModel(),modelTwo.getYear(),modelTwo.getPrice());
        System.out.println("After five percent discount of the initial price");
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n ",modelOne.getModel(),modelOne.getYear(),modelOne.getPrice()-(0.05 * modelOne.getPrice()));
        System.out.println();
        System.out.println("After seven percent discount of the initial price");
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n ",modelTwo.getModel(),modelTwo.getYear(),modelTwo.getPrice()-(0.07 * modelTwo.getPrice()));
    }
}
