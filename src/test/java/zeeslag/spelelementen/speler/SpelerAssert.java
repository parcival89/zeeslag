package zeeslag.spelelementen.speler;

import org.assertj.core.api.AbstractAssert;

import static zeeslag.ZeeslagAssertions.assertThat;

public class SpelerAssert extends AbstractAssert<SpelerAssert, Speler> {
    public SpelerAssert(Speler actual) {
        super(actual, SpelerAssert.class);
    }

    public SpelerAssert heeftNaam(String naam) {
        assertThat(actual.getNaam()).isEqualTo(naam);
        return this;
    }
}
