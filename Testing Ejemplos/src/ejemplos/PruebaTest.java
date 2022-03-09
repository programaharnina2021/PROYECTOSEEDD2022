package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class PruebaTest {

	@Test
	void testEncontrarMultiplos() {
		// condiciones iniciales
		Prueba prueba = new Prueba();
		int min = 1, max = 10, divisor = 2;
		int[] resultado = { 2, 4, 6, 8, 10 };
		List expected = Arrays.asList(resultado);
		// probando
		List<Integer> encontrarMultiplos = prueba.encontrarMultiplos(min, max, divisor);
		// comprobar
		assertArrayEquals(encontrarMultiplos.toArray(), expected.toArray());
	}

}
