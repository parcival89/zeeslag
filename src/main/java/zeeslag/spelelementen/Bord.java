package zeeslag.spelelementen;

import java.util.ArrayList;
import java.util.List;

public class Bord {

    private final int maxYCoordinaat;
    private final int maxXCoordinaat;
    private List<Locatie> locaties;

    private Bord(BordBuilder builder) {
        locaties = new ArrayList<>();
        this.maxXCoordinaat = builder.maxXCoordinaat;
        this.maxYCoordinaat = builder.maxYCoordinaat;
        vulLocatiesOp();
    }

    public List<Locatie> vulLocatiesOp() {
        int x = 0;
        int y = 0;
        while (x <= this.maxXCoordinaat && y <= this.maxYCoordinaat) {
            this.locaties.add(new Locatie(x, y));
            if (x == this.maxXCoordinaat) {
                x = 0;
                y++;
            } else {
                x++;
            }
        }
        return this.locaties;
    }

    public List<Locatie> getLocaties() {
        return locaties;
    }

    public int getAantalKolommen(){
        return maxXCoordinaat + 1;
    }

    public int getMaxXCoordinaat() {
        return maxXCoordinaat;
    }

    public int getAantalRijen(){
        return maxYCoordinaat + 1;
    }

    public int getMaxYCoordinaat() {
        return maxYCoordinaat;
    }

    public static class BordBuilder {
        private int maxXCoordinaat = 9;
        private int maxYCoordinaat = 9;

        private BordBuilder() {
        }

        public static BordBuilder bord() {
            return new BordBuilder();
        }

        public Bord build() {
            return new Bord(this);
        }

        public BordBuilder withMaxXCoordinaat(int maxXCoordinaat) {
            this.maxXCoordinaat = maxXCoordinaat;
            return this;
        }

        public BordBuilder withMaxYCoordinaat(int maxYCoordinaat) {
            this.maxYCoordinaat = maxYCoordinaat;
            return this;
        }
    }
}

