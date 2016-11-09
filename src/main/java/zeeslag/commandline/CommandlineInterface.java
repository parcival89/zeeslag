package zeeslag.commandline;

import zeeslag.spelelementen.bord.Bord;

import java.util.Scanner;
import java.util.stream.Stream;

import static zeeslag.commandline.CommandlineInterface.LineCreater.slagveldLijn;
import static zeeslag.commandline.CommandlineInterface.LineCreater.zetOmNaarLetter;
import static zeeslag.spelelementen.bord.Bord.BordBuilder.bord;

public class CommandlineInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TODO @Sander gebruik de juiste dimensies
        Zeeslag huidigSpel = new Zeeslag(bord().build());

        print("Welkom bij Zeeslag!!");

        int keuze = -1;
        do {
            print("Kies een van de volgende opties .. ");
            Stream.of(GebruikerKeuze.values())
                    .forEachOrdered(keuzeGebruiker -> print(String.format("%d. %s", keuzeGebruiker.getKeuze(), keuzeGebruiker.getKeuzeBoodschap())));

            keuze = scanner.nextInt();
        }while(!isGeldigeKeuze(keuze));

        voerKeuzeUit(keuze, huidigSpel);
    }

    public static void voerKeuzeUit(int keuze, Zeeslag zeeslag) {
        if(keuze == GebruikerKeuze.SPEL_STARTEN.getKeuze()){
            printBord(zeeslag.getBord());
        }else if (keuze == GebruikerKeuze.AFLSUITEN.getKeuze()){
            System.exit(42);
        }
    }

    public static void printBord(Bord bord) {
        String xLegende = LineCreater.xLegende(bord.getAantalKolommen());
        String scheidingslijn = LineCreater.scheidingslijn(bord.getAantalKolommen());

        print(xLegende);
        print(scheidingslijn);
        for(int i = 0; i < bord.getAantalRijen(); i++) {
            print(slagveldLijn(zetOmNaarLetter(i),bord.getAantalKolommen()));
        }
        print(scheidingslijn);
        print(xLegende);

    }

    public static boolean isGeldigeKeuze(int keuze) {
        return keuze == 1 || keuze == 2;
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static class LineCreater {
        private static final String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        public static String zetOmNaarLetter(int omTeZettenGetal) {
            StringBuilder resultBuilder = new StringBuilder();
            boolean firstRun = true;
            do {
                if(!firstRun){
                    omTeZettenGetal--;
                }
                firstRun = false;
                int deelGetal = omTeZettenGetal % alfabet.length();
                resultBuilder.append(alfabet.substring(deelGetal, deelGetal + 1));
                omTeZettenGetal = (omTeZettenGetal - deelGetal) / alfabet.length();
            }while(omTeZettenGetal >= 1);

            return resultBuilder.reverse().toString();
        }

        public static String slagveldLijn(String lijnNummer, int legendeMax) {
            String result = String.format("%s|", lijnNummer);
            for(int i = 0; i < legendeMax; i++){
                result += " . ";
            }

            return String.format("%s|%s", result, lijnNummer);
        }

        public static String scheidingslijn(int legendeMax) {
            String result = "-- ";
            for(int i = 0; i < legendeMax; i++){
                result += "-- ";
            }

            return result + "--";
        }

        public static String xLegende(int legendeMax) {
            String result = "--";
            for(int i = 1; i <= legendeMax; i++){
                result += String.format(" %d ", i);
            }
            return result + "--";
        }
    }
}
