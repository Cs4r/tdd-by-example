package cs4r.labs.currency;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {

	@Test
	public void testIdentityRate() {
		assertEquals(1, new Bank().rate("USD", "USD"));
	}

}
