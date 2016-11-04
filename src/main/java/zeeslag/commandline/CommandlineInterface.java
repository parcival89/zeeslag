package zeeslag.commandline;

import zeeslag.spelelementen.Bord;

import java.util.Scanner;
import java.util.stream.Stream;

public class CommandlineInterface {

    public static void main(String[] args) {
        initApplicatie();
        Scanner scanner = new Scanner(System.in);
        //TODO @Sander gebruik de juiste dimensies
        Zeeslag huidigSpel = new Zeeslag(new Bord(10,10));

        print("Welkom bij Zeeslag!!");

        int keuze = -1;
        do {
            print("Kies een van de volgende opties .. ");
            Stream.of(GebruikerKeuze.values())
                    .forEachOrdered(keuzeGebruiker -> print(String.format("%d. %s", keuzeGebruiker.getKeuze(), keuzeGebruiker.getKeuzeBoodschap())));

            keuze = scanner.nextInt();
        }while(!isGeldigeKeuze(keuze));

        voerKeuzeUit(keuze);
    }

    private static void voerKeuzeUit(int keuze) {
        if(keuze == GebruikerKeuze.SPEL_STARTEN.getKeuze()){
            printBord();
        }else if (keuze == GebruikerKeuze.AFLSUITEN.getKeuze()){
            System.exit(42);
        }
    }

    private static void printBord() {
        print("Hier is het test bord");

        //TODO @Sander: Wacht op Jonas
        print("-- 1  2  3  4  5  6  7  8  9  10 --");
        print("-- -- -- -- -- -- -- -- -- -- -- --");
        for(int i = 0; i < 8; i++) {
            //TODO @Sander verticale  lijnen moeten alfabetisch zijn
            print((i+1) + "| .  .  .  .  .  .  .  .  .  . |" + (i+1));
        }
        print("-- -- -- -- -- -- -- -- -- -- -- --");
        print("-- 1  2  3  4  5  6  7  8  9  10 --");

    }

    private static boolean isGeldigeKeuze(int keuze) {
        return keuze == 1 || keuze == 2;
    }

    private static void print(String message){
        System.out.println(message);
    }

    private static void initApplicatie(){

    }
}
