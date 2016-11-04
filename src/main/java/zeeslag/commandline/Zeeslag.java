package zeeslag.commandline;

import zeeslag.spelelementen.Bord;

public class Zeeslag {

    private Bord bord;

    public Zeeslag(Bord bord){
        this.bord = bord;
    }

    public Bord getBord() {
        return bord;
    }
}
