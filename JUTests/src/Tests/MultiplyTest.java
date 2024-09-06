package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiplyTest {

	@Test
	public void testMultiply() {
		Main test = new Main();
		int result = test.multiply(10,2);
		assertEquals(20,result);
	}

}
