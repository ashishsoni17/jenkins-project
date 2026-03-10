package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
	void testAddition() {
		Calculator cal = new Calculator();
		int result = cal.add(2, 3);
		assertEquals(5,result);
	}

}
