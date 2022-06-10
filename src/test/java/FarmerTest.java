import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;
/**
 * @version (20220610)
 */
public class FarmerTest {

    @Test
    public void testToString() {
        // action
        Farmer fm1 = new Farmer("農民「佐々木」", 20);
        Farmer fm2 = new Farmer("農民「小林」", 80);

        // assertion
        String msg = "オーバーライドしたtoString()の出力が実行例と異なります!";
        assertEquals("Name：農民「佐々木」/HP:20", fm1.toString(), msg);
        assertEquals("Name：農民「小林」/HP:80", fm2.toString(), msg);
    }

    @Test
    public void testEquals() {
        // action
        Farmer fm1 = new Farmer("農民「佐々木」", 20);
        Farmer fm2 = new Farmer("農民「小林」", 80);
        Farmer fm3 = new Farmer("農民「小林」", 80);

        // assertion
        String msg = "オーバーライドしたequals()の出力が正しくありません!";
        assertEquals(true, fm1.equals(fm1), msg);
        assertEquals(false, fm1.equals(fm2), msg);
        assertEquals(false, fm1.equals(fm3), msg);
        assertEquals(true, fm2.equals(fm3), msg);
    }
}