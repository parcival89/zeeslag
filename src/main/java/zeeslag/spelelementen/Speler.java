package zeeslag.spelelementen;

public class Speler {

    private String naam;

    public Speler(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String nieuweNaam) {
        naam = nieuweNaam;
    }
}
