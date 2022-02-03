package futbol;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class CompeticionTest {
	Equipo[] equipos = { new Equipo("0"), new Equipo("1"), new Equipo("2"), new Equipo("3") };
	
	@Test
	void testDisputarEnfrentamientos() {
		Competicion competicion = new Competicion(equipos);
		competicion.disputarEnfrentamientos();
		Emparejamiento[] emparejamientos = competicion.getEmparejamientos();
		boolean golesA=false,golesB=false;
		for (int i = 0; i < emparejamientos.length; i++) {
			if(emparejamientos[i].getResultado().getGolesA()!=0) golesA=true;
			if(emparejamientos[i].getResultado().getGolesB()!=0) golesB=true;
		}
		assertTrue(golesA);
		assertTrue(golesB);
	}
	@Test
	void testEmparejamientoEquipos() {
		int emparejamientos = 6;		
		Competicion competicion = new Competicion(equipos);
		Emparejamiento[] emparejamientoEquipos = competicion.getEmparejamientos();
		assertEquals(emparejamientos, emparejamientoEquipos.length);
	}

	@Test
	void testIniciarGuia() {
		int cantidadEquipos = 4;
		int[] guiaEmparejamiento = new int[cantidadEquipos];
		int[] resultado = { 0, 1, 2, 3 };
		new Competicion(equipos).iniciarGuiaEmparejamiento(guiaEmparejamiento);
		assertArrayEquals(resultado, guiaEmparejamiento);

	}

	@Test
	void testCalculaCantidadEnfremtamientos() {
		int equipo[] = { 4, 20 };
		int expected[] = { 6, 190 };
		for (int i = 0; i < expected.length; i++) {
			int actual = 
					new Competicion(equipos).calculaCantidadEmparejamientos(equipo[i]);
			assertEquals(expected[i], actual);
		}
		
	}

	@Test
	void testModificarGuia() {
		int cantidadEquipos = 4;
		int[] guiaEmparejamiento = new int[cantidadEquipos];
		new Competicion(equipos).iniciarGuiaEmparejamiento(guiaEmparejamiento);
		new Competicion(equipos).modificarGuiaEmparejamiento(guiaEmparejamiento);
		int[] resultado = { 0, 2, 3, 1 };
		assertArrayEquals(resultado, guiaEmparejamiento);
		new Competicion(equipos).modificarGuiaEmparejamiento(guiaEmparejamiento);
		int[] resultadoDos = { 0, 3, 1, 2 };
		assertArrayEquals(resultadoDos, guiaEmparejamiento);

	}

}
