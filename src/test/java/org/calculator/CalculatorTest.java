package org.calculator;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(6,calc.add(3,4));
    }

    @Test
    public void testSubtract() {
        assertEquals(3,calc.subtract(5,2));
    }

    @Test
    public void testDivide() {
        assertEquals(10,calc.divide(60,6));
    }

    @Test
    public void testMultiply() {
        assertEquals(12,calc.multiply(3,4));
    }
}
