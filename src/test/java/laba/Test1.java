package laba;

import static org.junit.jupiter.api.Assertions.*;

public class Test1 {

	@org.junit.jupiter.api.Test
	public void test() {
		int a = 2;
		int b = 2;
		int testValue = 4;
		int testingValue = 0;
		testingValue = a * b;
		assertEquals(testValue,  testingValue);
		assertTrue(testValue == testingValue);
	}

}
