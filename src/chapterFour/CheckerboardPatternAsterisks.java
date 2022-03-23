package chapterFour;
//4.33
public class CheckerboardPatternAsterisks {
    public static void main(String[] args) {
        for(int star = 0; star < 8; star++){
            if(star % 2 == 0)
                System.out.print(" ");
            for(int sterik = 0; sterik < 8; sterik++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
