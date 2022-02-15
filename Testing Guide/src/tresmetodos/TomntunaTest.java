package tresmetodos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TomntunaTest {

	@Test
	void test() {
		Tomntuna uno=new Tomntuna(1, 31);
		Tomntuna dos=new Tomntuna(31, 1);
		assertTrue(uno.hashCode()==dos.hashCode());
		assertTrue(uno.equals(dos));
	}

}
