package chapterThree;
class CarDriver {
    public static void main(String[] args) {
        Car tush = new Car("Camry", "1999", 17000000);
        Car purshe  = new Car("Mercedes","2020",30000000);
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n ",tush.getModel(),tush.getYear(),tush.getPrice());
        System.out.println();
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n%n ",purshe.getModel(),purshe.getYear(),purshe.getPrice());
        System.out.println("After five percent discount of the initial price");
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n ",tush.getModel(),tush.getYear(),tush.getPrice()-(0.05 * tush.getPrice()));
        System.out.println();
        System.out.println("After seven percent discount of the initial price");
        System.out.printf("model: %s%nYear: %s%nPrice: %.2f%n ",purshe.getModel(),purshe.getYear(),purshe.getPrice()-(0.07 * purshe.getPrice()));
    }
}