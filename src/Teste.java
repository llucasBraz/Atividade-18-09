import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContribuinteTest {

    @Test
    public void testPodeAposentarMulher() {
        Contribuinte contribuinte = new Contribuinte(62, 'F', 15, 0);
        assertTrue(contribuinte.podeAposentar());

        contribuinte = new Contribuinte(    61, 'F', 15, 0);
        assertFalse(contribuinte.podeAposentar());

        contribuinte = new Contribuinte(62, 'F', 14, 1);
        assertTrue(contribuinte.podeAposentar());
    }

    @Test
    public void testPodeAposentarHomem() {
        Contribuinte contribuinte = new Contribuinte(65, 'M', 20, 0);
        assertTrue(contribuinte.podeAposentar());

        contribuinte = new Contribuinte(64, 'M', 20, 0);
        assertFalse(contribuinte.podeAposentar());

        contribuinte = new Contribuinte(65, 'M', 18, 2);
        assertTrue(contribuinte.podeAposentar());
    }
}
