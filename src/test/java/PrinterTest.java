import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void setUp() {
        printer = new Printer();
    }

    @Test
    public void hasPaper() {
        assertEquals(100, printer.getPaper());
    }

    @Test
    public void canPrint(){
        printer.print(5, 10);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void reducesTonerVolume(){
        printer.print(5, 10);
        assertEquals(50, printer.getToner());
    }

}
