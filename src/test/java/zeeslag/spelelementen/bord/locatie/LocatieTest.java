package zeeslag.spelelementen.bord.locatie;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static zeeslag.spelelementen.bord.locatie.Locatie.LocatieBuilder.locatie;

public class LocatieTest {

    @Test
    public void constructor_locatieHeeftXCoordinaat() {
        Locatie locatie1 = locatie().withXCoordinaat(9).withYCoordinaat(8).build();
        Assertions.assertThat(locatie1.getXCoordinaat()).isEqualTo(9);
        Assertions.assertThat(locatie1.getYCoordinaat()).isEqualTo(8);
        
        Locatie locatie2 = locatie().withXCoordinaat(10).withYCoordinaat(10).build();
        Assertions.assertThat(locatie2.getXCoordinaat()).isEqualTo(10);
        Assertions.assertThat(locatie2.getYCoordinaat()).isEqualTo(10);
    }
}