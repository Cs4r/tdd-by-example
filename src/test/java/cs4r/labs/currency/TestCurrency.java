package cs4r.labs.currency;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCurrency {

	@Test
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}

}
