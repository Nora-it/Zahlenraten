
public class Main {
    public static void main(String[] args) {
        var scanner = new java.util.Scanner(System.in);

        int modulo = 0;
        do {
            //1. Eingabe
            int nummer1 =0;
            boolean error;
            do {
                try {
                    System.out.println("Bitte erste Zahl eingeben:(1,2,3,...)");
                    nummer1 = scanner.nextInt();
                    error=false;
                }
                catch(Exception e){
                    scanner.next();
                    error=true;
                }
            }
            while (error);
            int nummer2=0;
            do {
                try {
                    System.out.println("Bitte zweite Zahl eingeben:(1,2,3,...)");
                    nummer2 = scanner.nextInt();
                    error=false;
                }
                catch(Exception e){
                    scanner.next();
                    error=true;
                }
            }
            while (error);

            String allowedSymbols = "+-*/%";
            char symbol;
            do {
                System.out.println("Bitte Rechenzeichen eingeben(+,-,*,/,%)");
                symbol = scanner.next().charAt(0);
            }
            while(allowedSymbols.indexOf(symbol)==-1);
            // 2. Verarbeitung, Berechnung
            int summe = 0, differenz = 0, produkt = 0, quotient = 0;
            if (symbol == '+') {
                summe = nummer1 + nummer2;
            } else if (symbol == '-') {
                differenz = nummer1 - nummer2;
            } else if (symbol == '*') {
                produkt = nummer1 * nummer2;
            } else if (symbol == '/') {
                if (nummer2 != 0) {
                    quotient = nummer1 / nummer2;
                } else {
                    System.out.println("Division durch 0");
                }
            } else if (symbol == '%') {
                modulo = nummer1 % nummer2;
            }

            //3. Ausgabe
            System.out.println("Zahl:" + nummer1 + "," + nummer2);
            if (symbol == '+') System.out.println("Summe:" + summe);
            if (symbol == '-') System.out.println("differenz:" + differenz);
            if (symbol == '*') System.out.println("produkt:" + produkt);
            if (symbol == '/') System.out.println("quotient:" + quotient);
            if (symbol == '%') System.out.println("modulo:" + modulo);
            //Fußgesteuerte Schleife
        } while (modulo != 0);

    }
}
