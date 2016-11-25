package zeeslag.spelelementen.bord.locatie;

import org.assertj.core.api.AbstractAssert;

import static zeeslag.ZeeslagAssertions.assertThat;

public class LocatieAssert extends AbstractAssert<LocatieAssert, Locatie> {
    public LocatieAssert(Locatie actual) {
        super(actual, LocatieAssert.class);
    }

    public LocatieAssert heeftXCoordinaat(int coordinaat) {
        assertThat(actual.getXCoordinaat()).isEqualTo(coordinaat);
        return this;
    }

    public LocatieAssert heeftYCoordinaat(int coordinaat) {
        assertThat(actual.getYCoordinaat()).isEqualTo(coordinaat);
        return this;
    }
}
