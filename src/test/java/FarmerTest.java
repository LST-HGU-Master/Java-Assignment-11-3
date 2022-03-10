import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.io.*;

public class FarmerTest {

    @Test
    public void testToString() {
        // action
        Farmer fm1 = new Farmer("農民「佐々木」", 20);
        Farmer fm2 = new Farmer("農民「小林」", 80);

        // assertion
        assertEquals("Name：農民「佐々木」/HP:20", fm1.toString());
        assertEquals("Name：農民「小林」/HP:80", fm2.toString());
    }

    @Test
    public void testEquals() {
        // action
        Farmer fm1 = new Farmer("農民「佐々木」", 20);
        Farmer fm2 = new Farmer("農民「小林」", 80);
        Farmer fm3 = new Farmer("農民「小林」", 80);

        // assertion
        assertEquals(false, fm1.equals(fm2));
        assertEquals(false, fm1.equals(fm3));
        assertEquals(true, fm2.equals(fm3));
    }
}