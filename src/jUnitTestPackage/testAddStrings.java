package jUnitTestPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTestFunctions junitstring = new jUnitTestFunctions();
		String result = junitstring.addStrings("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
