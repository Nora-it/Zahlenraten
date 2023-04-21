import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean playAgain = true;
        do {
            System.out.println("Ich denke mir jetzt eine Zahl von 0 bis 100 aus.... ");
            var rand = new Random();
            var zf = rand.nextInt(100);
            int eingabe;
            var scanner = new Scanner(System.in);
            do {
                System.out.print("Rate die Zahl:");

                eingabe = scanner.nextInt();
                if (eingabe > zf) {
                    System.out.println("zu groß!");
                } else if (eingabe < zf) {
                    System.out.println("zu klein!");
                }

            } while (eingabe != zf);

            System.out.println("Congratulations!!!");
            System.out.println("Möchtest du erneut spielen?(j/J)");
            var auswl=scanner.next();
            if (auswl.charAt(0)=='j' || auswl.charAt(0)=='J'){
                playAgain = true;
            }
            else{
                playAgain = false;
                System.out.println("Good bye!");
            }
        }while(playAgain);

    }

}