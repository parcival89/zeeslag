package zeeslag.commandline;

public enum GebruikerKeuze {

    SPEL_STARTEN(1, "Een nieuw spel starten."),
    AFLSUITEN(2, "Afsluiten");

    private int keuze;
    private String keuzeBoodschap;

    GebruikerKeuze(int keuze, String keuzeBoodschap){
        this.keuze = keuze;
        this.keuzeBoodschap = keuzeBoodschap;
    }

    public int getKeuze() {
        return keuze;
    }

    public String getKeuzeBoodschap() {
        return keuzeBoodschap;
    }
}
