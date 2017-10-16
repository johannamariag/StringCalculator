package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testMultipleNumbers() {
		assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
    public void testLineSplit(){
    	assertEquals(6, Calculator.add("1\n2,3"));
    }
    @Test
    public void testUnknownAmountOfNumbers(){
    	assertEquals(3 + 6 + 1 + 20, Calculator.add("3, 6, 1, 20"));
    }
}


