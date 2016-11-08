package zeeslag.spelelementen;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SpelerTest {

    @Test
    public void constructor_spelerHeeftNaam() {
        Speler speler1 = new Speler("Sander");
        Speler speler2 = new Speler("Parcival");
        assertThat(speler1.getNaam()).isEqualTo("Sander");
        assertThat(speler2.getNaam()).isEqualTo("Parcival");
        speler1.setNaam("El Jonas");
        speler2.setNaam("El Parcival");
        assertThat(speler1.getNaam()).isEqualTo("El Jonas");
        assertThat(speler2.getNaam()).isEqualTo("El Parcival");
    }
}