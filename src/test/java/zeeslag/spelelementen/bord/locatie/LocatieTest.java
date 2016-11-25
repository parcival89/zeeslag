package zeeslag.spelelementen.bord.locatie;

import org.junit.Test;

import static zeeslag.ZeeslagAssertions.assertThat;
import static zeeslag.spelelementen.bord.locatie.Locatie.LocatieBuilder.locatie;

public class LocatieTest {

    @Test
    public void constructor_locatieHeeftXCoordinaat() {
        Locatie locatie1 = locatie().withXCoordinaat(9).withYCoordinaat(8).build();
        assertThat(locatie1)
                .heeftXCoordinaat(9)
                .heeftYCoordinaat(8);

        Locatie locatie2 = locatie().withXCoordinaat(10).withYCoordinaat(10).build();
        assertThat(locatie2)
                .heeftXCoordinaat(10)
                .heeftYCoordinaat(10);
    }
}