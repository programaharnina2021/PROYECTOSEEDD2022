package futbol;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class CompeticionTest {

	@Test
	void testEmparejamientoEquipos() {
		int emparejamientos = 6;
		Equipo[] equipos = { new Equipo("0"), new Equipo("1"), new Equipo("2"), new Equipo("3") };
		Competicion competicion = new Competicion(equipos);
		Emparejamiento[] emparejamientoEquipos = competicion.getEmparejamientos();
		assertEquals(emparejamientos, emparejamientoEquipos.length);
	}

	@Test
	void testIniciarGuia() {
		int cantidadEquipos = 4;
		int[] guiaEmparejamiento = new int[cantidadEquipos];
		int[] resultado = { 0, 1, 2, 3 };
		new Competicion().iniciarGuiaEmparejamiento(guiaEmparejamiento);
		assertArrayEquals(resultado, guiaEmparejamiento);

	}

	@Test
	void testCalculaCantidadEnfremtamientos() {
		int equipo[] = { 4, 20 };
		int expected[] = { 6, 190 };
		for (int i = 0; i < expected.length; i++) {
			int actual = 
					new Competicion().calculaCantidadEmparejamientos(equipo[i]);
			assertEquals(expected[i], actual);
		}
		
	}

	@Test
	void testModificarGuia() {
		int cantidadEquipos = 4;
		int[] guiaEmparejamiento = new int[cantidadEquipos];
		new Competicion().iniciarGuiaEmparejamiento(guiaEmparejamiento);
		new Competicion().modificarGuiaEmparejamiento(guiaEmparejamiento);
		int[] resultado = { 0, 2, 3, 1 };
		assertArrayEquals(resultado, guiaEmparejamiento);
		new Competicion().modificarGuiaEmparejamiento(guiaEmparejamiento);
		int[] resultadoDos = { 0, 3, 1, 2 };
		assertArrayEquals(resultadoDos, guiaEmparejamiento);

	}

}
