package zeeslag.spelelementen;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LocatieTest {

    @Test
    public void constructor_locatieHeeftXCoordinaat() {
        Locatie locatie1 = new Locatie(9, 8);
        Locatie locatie2 = new Locatie(10, 10);
        Assertions.assertThat(locatie1.getXCoordinaat()).isEqualTo(9);
        Assertions.assertThat(locatie1.getYCoordinaat()).isEqualTo(8);
        Assertions.assertThat(locatie2.getXCoordinaat()).isEqualTo(10);
        Assertions.assertThat(locatie2.getYCoordinaat()).isEqualTo(10);

    }
}