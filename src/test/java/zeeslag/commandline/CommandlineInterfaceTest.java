package zeeslag.commandline;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static zeeslag.ZeeslagAssertions.assertThat;

public class CommandlineInterfaceTest {

    @Rule
    public  ExpectedException expectedException = ExpectedException.none();

    @Test
    public void xLegende_printGetallenVan1TotMaxXCoordinaat() {
        assertThat(CommandlineInterface.LineCreater.xLegende(1)).isEqualTo("-- 1 --");
        assertThat(CommandlineInterface.LineCreater.xLegende(7)).isEqualTo("-- 1  2  3  4  5  6  7 --");
        assertThat(CommandlineInterface.LineCreater.xLegende(10)).isEqualTo("-- 1  2  3  4  5  6  7  8  9  10 --");
        assertThat(CommandlineInterface.LineCreater.xLegende(14)).isEqualTo("-- 1  2  3  4  5  6  7  8  9  10  11  12  13  14 --");
    }

    @Test
    public void scheidingslijn_houdtRekeningMetMaxXCordinaat() {
        assertThat(CommandlineInterface.LineCreater.scheidingslijn(3)).isEqualTo("-- -- -- -- --");
        assertThat(CommandlineInterface.LineCreater.scheidingslijn(7)).isEqualTo("-- -- -- -- -- -- -- -- --");
        assertThat(CommandlineInterface.LineCreater.scheidingslijn(10)).isEqualTo("-- -- -- -- -- -- -- -- -- -- -- --");
        assertThat(CommandlineInterface.LineCreater.scheidingslijn(14)).isEqualTo("-- -- -- -- -- -- -- -- -- -- -- -- -- -- -- --");
    }

    @Test
    public void slagveldLijn_houdtRekeningMetMaxXCordinaat() {
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("A", 3)).contains("| .  .  . |");
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("A", 7)).contains("| .  .  .  .  .  .  . |");
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("A", 10)).contains("| .  .  .  .  .  .  .  .  .  . |");
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("A", 14)).contains("| .  .  .  .  .  .  .  .  .  .  .  .  .  . |");
    }

    @Test
    public void slagveldLijn_printLijnNummerAanBeideKanten() {
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("A", 3)).contains("A| .  .  . |A");
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("G", 7)).contains("G| .  .  .  .  .  .  . |G");
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("B", 10)).contains("B| .  .  .  .  .  .  .  .  .  . |B");
        assertThat(CommandlineInterface.LineCreater.slagveldLijn("D", 14)).contains("D| .  .  .  .  .  .  .  .  .  .  .  .  .  . |D");
    }

    @Test
    public void zetOmNaarLetter(){
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(0)).isEqualTo("A");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(1)).isEqualTo("B");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(2)).isEqualTo("C");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(3)).isEqualTo("D");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(10)).isEqualTo("K");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(11)).isEqualTo("L");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(12)).isEqualTo("M");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(24)).isEqualTo("Y");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(25)).isEqualTo("Z");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(26)).isEqualTo("AA");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(51)).isEqualTo("AZ");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(126)).isEqualTo("DW");
        assertThat(CommandlineInterface.LineCreater.zetOmNaarLetter(4077)).isEqualTo("EZV");
    }
}