package zeeslag.spelelementen.speler;

public class Speler {

    private final String naam;

    public Speler(SpelerBuilder builder) {
        this.naam = builder.naam;
    }

    public String getNaam() {
        return naam;
    }

    public static class SpelerBuilder {

        private String naam;

        private SpelerBuilder(){}

        public static SpelerBuilder speler(){
            return new SpelerBuilder();
        }

        public Speler build(){
            return new Speler(this);
        }

        public SpelerBuilder withNaam(String naam){
            this.naam = naam;
            return this;
        }
    }
}
