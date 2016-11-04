package zeeslag.spelelementen;

import java.util.ArrayList;

public class Bord {

    private ArrayList<Locatie> locaties;

    public Bord(int maxXCoordinaat, int maxYCoordinaat) {
        locaties = new ArrayList<Locatie>();
        vulLocatiesIn(maxXCoordinaat, maxYCoordinaat);
    }

    public ArrayList<Locatie> vulLocatiesIn(int maxXCoordinaat, int maxYCoordinaat) {
        int x = 0;
        int y = 0;
        while (x <= maxXCoordinaat && y <= maxYCoordinaat) {
            locaties.add(new Locatie(x, y));
            if(x == maxXCoordinaat) {
                x = 0;
                y++;
            }else {
                x++;
            }
        }
        return locaties;
    }

    public ArrayList<Locatie> getLocaties() {
        return locaties;
    }
}

