package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisionTest {

	@Test
	public void testDivision() {
		Main test = new Main();
		int result = test.division(75,25);
		assertEquals(3,result);
	}

}
