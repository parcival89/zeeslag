package zeeslag;

import org.assertj.core.api.Assertions;
import zeeslag.spelelementen.bord.Bord;
import zeeslag.spelelementen.bord.BordAssert;
import zeeslag.spelelementen.bord.locatie.Locatie;
import zeeslag.spelelementen.bord.locatie.LocatieAssert;
import zeeslag.spelelementen.speler.Speler;
import zeeslag.spelelementen.speler.SpelerAssert;

public class ZeeslagAssertions extends Assertions{

    public static BordAssert assertThat(Bord bord){
        return new BordAssert(bord);
    }

    public static LocatieAssert assertThat(Locatie locatie){
        return new LocatieAssert(locatie);
    }

    public static SpelerAssert assertThat(Speler speler) {
        return new SpelerAssert(speler);
    }
}
