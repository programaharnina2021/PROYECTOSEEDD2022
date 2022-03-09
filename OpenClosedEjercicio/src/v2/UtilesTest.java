package v2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	void testGetRandom() {
		int min=6,max=9;
		int cantidad=300;
		for (int i = 0; i < cantidad; i++) {
			int random = Utiles.getRandom(min, max);
			System.out.println(random);
			assertTrue(random>=min&&random<=max);
		}
		
	}

}
