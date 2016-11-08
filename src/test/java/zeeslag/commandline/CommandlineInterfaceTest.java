package zeeslag.commandline;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandlineInterfaceTest {

    @Rule
    public  ExpectedException expectedException = ExpectedException.none();

    @Test
    public void xLegende_printGetallenVan1TotMaxXCoordinaat() {
        assertThat(CommandlineInterface.xLegende(1)).isEqualTo("-- 1 --");
        assertThat(CommandlineInterface.xLegende(7)).isEqualTo("-- 1  2  3  4  5  6  7 --");
        assertThat(CommandlineInterface.xLegende(10)).isEqualTo("-- 1  2  3  4  5  6  7  8  9  10 --");
        assertThat(CommandlineInterface.xLegende(14)).isEqualTo("-- 1  2  3  4  5  6  7  8  9  10  11  12  13  14 --");
    }

    @Test
    public void scheidingslijn_houdtRekeningMetMaxXCordinaat() {
        assertThat(CommandlineInterface.scheidingslijn(3)).isEqualTo("-- -- -- -- --");
        assertThat(CommandlineInterface.scheidingslijn(7)).isEqualTo("-- -- -- -- -- -- -- -- --");
        assertThat(CommandlineInterface.scheidingslijn(10)).isEqualTo("-- -- -- -- -- -- -- -- -- -- -- --");
        assertThat(CommandlineInterface.scheidingslijn(14)).isEqualTo("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
    }

    @Test
    public void slagveldLijn_houdtRekeningMetMaxXCordinaat() {
        assertThat(CommandlineInterface.slagveldLijn("A", 3)).contains("| .  .  . |");
        assertThat(CommandlineInterface.slagveldLijn("A", 7)).contains("| .  .  .  .  .  .  . |");
        assertThat(CommandlineInterface.slagveldLijn("A", 10)).contains("| .  .  .  .  .  .  .  .  .  . |");
        assertThat(CommandlineInterface.slagveldLijn("A", 14)).contains("| .  .  .  .  .  .  .  .  .  .  .  .  .  . |");
    }

    @Test
    public void slagveldLijn_printLijnNummerAanBeideKanten() {
        assertThat(CommandlineInterface.slagveldLijn("A", 3)).contains("A | .  .  . | A");
        assertThat(CommandlineInterface.slagveldLijn("G", 7)).contains("G | .  .  .  .  .  .  . | G");
        assertThat(CommandlineInterface.slagveldLijn("B", 10)).contains("B | .  .  .  .  .  .  .  .  .  . | B");
        assertThat(CommandlineInterface.slagveldLijn("D", 14)).contains("D | .  .  .  .  .  .  .  .  .  .  .  .  .  . | D");
    }

    //TODO @Sander: nodig?
    @Test
    public void slagveldLijn_GivenLijnNummerNull_GooitException() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Lijn nummer mag niet Null zijn");

        CommandlineInterface.slagveldLijn(null, 3);
    }

    @Test
    public void zetOmNaarLetter(){
        assertThat(CommandlineInterface.zetOmNaarLetter(0)).isEqualTo("A");
        assertThat(CommandlineInterface.zetOmNaarLetter(1)).isEqualTo("B");
        assertThat(CommandlineInterface.zetOmNaarLetter(2)).isEqualTo("C");
        assertThat(CommandlineInterface.zetOmNaarLetter(3)).isEqualTo("D");
        assertThat(CommandlineInterface.zetOmNaarLetter(10)).isEqualTo("K");
        assertThat(CommandlineInterface.zetOmNaarLetter(11)).isEqualTo("L");
        assertThat(CommandlineInterface.zetOmNaarLetter(12)).isEqualTo("M");
        assertThat(CommandlineInterface.zetOmNaarLetter(24)).isEqualTo("Y");
        assertThat(CommandlineInterface.zetOmNaarLetter(25)).isEqualTo("Z");
        assertThat(CommandlineInterface.zetOmNaarLetter(26)).isEqualTo("AA");
        assertThat(CommandlineInterface.zetOmNaarLetter(51)).isEqualTo("AZ");
        assertThat(CommandlineInterface.zetOmNaarLetter(126)).isEqualTo("DW");
        assertThat(CommandlineInterface.zetOmNaarLetter(4077)).isEqualTo("EZV");
    }

}