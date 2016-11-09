package zeeslag.spelelementen.bord;

import org.junit.Test;

import static zeeslag.ZeeslagAssertions.assertThat;
import static zeeslag.spelelementen.bord.Bord.BordBuilder.bord;

public class BordTest {

    @Test
    public void contructor_bordHeeftLijstLocaties() {
        Bord bord = bord().withMaxXCoordinaat(12).withMaxYCoordinaat(13).build();
        assertThat(bord.getLocaties()).isNotNull();
    }

    @Test
    public void constructor_initialiseertMetStandaard100Locaties() {
        assertThat(bord().build().getLocaties()).hasSize(100);
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

    @Test
    public void getAantalRijen_isMaxYCoordinaatPlus1(){
        Bord bord = bord().build();

        assertThat(bord.getAantalRijen()).isEqualTo(bord.getMaxYCoordinaat() + 1);
    }

    @Test
    public void getAantaKolommen_isMaxXCoordinaatPlus1(){
        Bord bord = bord().build();

        assertThat(bord.getAantalKolommen()).isEqualTo(bord.getMaxXCoordinaat() + 1);
    }
}