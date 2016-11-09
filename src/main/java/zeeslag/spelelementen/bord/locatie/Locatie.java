package zeeslag.spelelementen.bord.locatie;

public class Locatie {

    private int xCoordinaat;
    private int yCoordinaat;

    private Locatie(LocatieBuilder builder) {
        this.xCoordinaat = builder.xCoordinaat;
        this.yCoordinaat = builder.yCoordinaat;
    }

    public int getXCoordinaat() {
        return xCoordinaat;
    }

    public int getYCoordinaat() {
        return yCoordinaat;
    }

    public static class LocatieBuilder {
        private int xCoordinaat;
        private int yCoordinaat;

        private LocatieBuilder() {}

        public static LocatieBuilder locatie(){
            return new LocatieBuilder();
        }

        public Locatie build(){
            return new Locatie(this);
        }

        public LocatieBuilder withXCoordinaat(int xCoordinaat) {
            this.xCoordinaat = xCoordinaat;
            return this;
        }

        public LocatieBuilder withYCoordinaat(int yCoordinaat) {
            this.yCoordinaat = yCoordinaat;
            return this;
        }
    }
}
