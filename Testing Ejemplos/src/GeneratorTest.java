import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GeneratorTest {

	@Test
	void test() {
		Generator generator = new Generator();
		int minimo = 0;
		int maximo = 100;
		int[] elementos = generator.getElementos();
		// prueba
		for (int i = 0; i < elementos.length; i++) {
			assertTrue(elementos[i]>minimo
					&&elementos[i]<maximo
					&&elementos[i]%2!=0);
		}
	}
	@Test
	void testDos() {
		Generator generator = new Generator();
		int[] elementos = generator.getElementos();
		int[] duplicate = generator.duplicate();
		//son el mismo array o lo ha duplicado?
		
		assertNotEquals(elementos, duplicate);
//		for (int i = 0; i < duplicate.length; i++) {
//			assertEquals(elementos[i], duplicate[i]);
//		}
		assertArrayEquals(elementos, duplicate);
	}

}
