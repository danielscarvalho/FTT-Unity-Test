package ftt.ec.test;

import static org.junit.jupiter.api.Assertions.*;

/*
 * 
 * Reference: https://www.devmedia.com.br/testes-unitarios-em-java/1549
 * Reference: https://junit.org/junit5/docs/current/user-guide/
 * 
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ftt.ec.beans.Calc;

@DisplayName("Test Calc")
class TestCalc {
	
	Calc c = new Calc();

	//Assert reference: https://junit.org/junit5/docs/current/api/org/junit/jupiter/api/Assertions.html
	
	@Test
	@DisplayName("add - int")
	void testInt() {
		assertEquals(2, c.add(1, 1));
	}
	
	@Test
	@DisplayName("add - float")
	void testFloat() {
		assertEquals(2.5f, c.add(1.f, 1.5f));
	}

	@Test
	@DisplayName("add - float 3")
	void testFloat3() {
		assertTrue(115f == c.add(10f, 105f));
	}
	
	/*
	@Test
	@DisplayName("add - float 2")
	void testFloat2() {
		assertEquals(1f, c.add(1f, -100f));
	}
	*/
}
