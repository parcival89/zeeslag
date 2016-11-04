package zeeslag.commandline;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CommandlineInterfaceTest {

    @Test
    public void eenPlusEenIsTwee(){
        Assertions.assertThat(1+1).isEqualTo(2);
    }
}