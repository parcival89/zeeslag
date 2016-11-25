package zeeslag.spelelementen.bord;

import org.assertj.core.api.AbstractAssert;

import static zeeslag.ZeeslagAssertions.assertThat;


public class BordAssert extends AbstractAssert<BordAssert, Bord> {

    public BordAssert(Bord actual) {
        super(actual, BordAssert.class);
    }

    public BordAssert heeftMaxXCoordinaat(int maxXCoordinaat) {
        assertThat(actual.getMaxXCoordinaat()).isEqualTo(maxXCoordinaat);
        return this;
    }

    public BordAssert heeftMaxYCoordinaat(int maxYCoordinaat) {
        assertThat(actual.getMaxYCoordinaat()).isEqualTo(maxYCoordinaat);
        return this;
    }

    public BordAssert heeftAantalRijen(int aantalRijen) {
        assertThat(actual.getAantalRijen()).isEqualTo(aantalRijen);
        return this;
    }

    public BordAssert heeftAantalKolommen(int aantalKolommen) {
        assertThat(actual.getAantalKolommen()).isEqualTo(aantalKolommen);
        return this;
    }

    public BordAssert heeftAantalLocaties(int aantalLocaties){
        assertThat(actual.getLocaties()).hasSize(aantalLocaties);
        return this;
    }
}
