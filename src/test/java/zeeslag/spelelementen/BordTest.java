package zeeslag.spelelementen;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static zeeslag.spelelementen.Bord.BordBuilder.bord;

public class BordTest {

    @Test
    public void contructor_bordHeeftLijstLocaties() {
        Bord bord = bord().withMaxXCoordinaat(12).withMaxYCoordinaat(13).build();
        assertThat(bord.getLocaties()).isNotNull();
    }

    @Test
    public void constructor_lijstLocatiesWordtingevuld() {
        Bord bord1 = bord().withMaxXCoordinaat(8).withMaxYCoordinaat(8).build();
        Bord bord2 = bord().withMaxXCoordinaat(4).withMaxYCoordinaat(10).build();
        assertThat(bord1.getLocaties()).hasSize(81);
        assertThat(bord2.getLocaties()).hasSize(55);
    }

    @Test
    public void contructor_bordHeeftMaxCoordinaten() {
        Bord bord1 = bord().withMaxXCoordinaat(11).withMaxYCoordinaat(12).build();
        Bord bord2 = bord().withMaxXCoordinaat(15).withMaxYCoordinaat(15).build();
    }
}