package zeeslag.spelelementen.speler;

import org.junit.Test;
import zeeslag.ZeeslagAssertions;

import static zeeslag.ZeeslagAssertions.assertThat;
import static zeeslag.spelelementen.speler.Speler.SpelerBuilder.*;

public class SpelerTest {

    @Test
    public void constructor_spelerHeeftNaam() {
        Speler speler1 = speler().withNaam("Sander").build();
        assertThat(speler1).heeftNaam("Sander");

        Speler speler2 = speler().withNaam("Parcival").build();
        assertThat(speler2).heeftNaam("Parcival");
    }
}