package zeeslag.spelelementen;

public class Locatie {

    private int xCoordinaat;
    private int yCoordinaat;

    public Locatie(int xCoordinaat, int yCoordinaat) {
        this.xCoordinaat = xCoordinaat;
        this.yCoordinaat = yCoordinaat;
    }

    public int getXCoordinaat() {
        return xCoordinaat;
    }

    public int getYCoordinaat() {
        return yCoordinaat;
    }

}
