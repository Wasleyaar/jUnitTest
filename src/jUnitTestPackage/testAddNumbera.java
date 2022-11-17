package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbera {

	@Test
	void test() {
		jUnitTestFunctions junit = new jUnitTestFunctions();
		int result = junit.addNumbers(52, 38);
		assertEquals(90, result);
		
	}

}
