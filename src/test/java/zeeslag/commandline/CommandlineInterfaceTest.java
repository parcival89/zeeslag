package zeeslag.commandline;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandlineInterfaceTest {

    @Test
    public void eenPlusEenIsTwee() {
        assertThat(1 + 1).isEqualTo(2);
    }
}