package futbol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	void testGenerarEquipos() {
		//establecen los valores
		String primero="Tomelloso", ultimo="Fargon";
		int size=10;
		Equipo[] equipos=new Equipo[size];
		//se ejecuta el SUT
		Utiles.generarEquipos(equipos);
		//la comprobacion
		assertTrue(equipos[0].getNombre().equals(primero));
		assertTrue(equipos[equipos.length-1].getNombre().equals(ultimo));
	}

}
