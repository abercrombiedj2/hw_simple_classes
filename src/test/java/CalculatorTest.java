import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }


    @Test
    public void canAdd(){
        assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    public void canMultiply(){
        assertEquals(4, calculator.multiply(2, 2));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(4, 2), 0.0);
    }


}
