package zeeslag.spelelementen;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class BordTest {

    @Test
    public void contructor_bordHeeftLijstLocaties() {
        Bord bord = new Bord(12,13);
        Assertions.assertThat(bord.getLocaties()).isNotNull();
    }

    @Test
    public void constructor_lijstLocatiesWordtingevuld() {
        Bord bord1 = new Bord(8,8);
        Bord bord2 = new Bord(4,10);
        Assertions.assertThat(bord1.getLocaties()).hasSize(81);
        Assertions.assertThat(bord2.getLocaties()).hasSize(55);
    }

    @Test
    public void contructor_bordHeeftMaxCoordinaten() {
        Bord bord1 = new Bord(11,12);
        Bord bord2 = new Bord(15,15);
    }


}