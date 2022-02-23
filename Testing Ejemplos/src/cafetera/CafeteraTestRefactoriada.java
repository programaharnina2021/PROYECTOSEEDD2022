package cafetera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CafeteraTestRefactoriada {
	Cafetera cafetera;
	final short CAPACIDAD_MAXIMA = 100;

	@BeforeEach
	void beforeEach() {
		this.cafetera = new Cafetera(CAPACIDAD_MAXIMA);
	}

	@Test
	void testLlenarCafetera() {
		cafetera.llenarCafetera();
		if (cafetera.getCapacidadMaxima() == 0) {
			fail("capacidad maxima a cero");
		}
		assertEquals(cafetera.getCantidadActual(), cafetera.getCapacidadMaxima());
	}

	@Test
	void testServirTaza() {
		cafetera.llenarCafetera();
		short taza = 60;
		// ejecutar el SUT
		int tazaUno = cafetera.servirTaza(taza);
		int tazaDos = cafetera.servirTaza(taza);
		// comprobar resultado
		assertEquals(taza, tazaUno);
		assertEquals(cafetera.getCapacidadMaxima() - taza, tazaDos);
	}

	@Test
	void testServirTazaDos() {
		cafetera.llenarCafetera();
		short taza = 160;
		int tazaUno = cafetera.servirTaza(taza);
		assertEquals(cafetera.getCapacidadMaxima(), tazaUno);

	}

	@Test
	void testVaciarCafetera() {
		cafetera.llenarCafetera();
		cafetera.vaciarCafetera();
		assertEquals(0, cafetera.getCantidadActual());
	}

	@Test
	void testAgregarCafe() {
		int relleno = 110;
		cafetera.agregarCafe(relleno);
		assertEquals(CAPACIDAD_MAXIMA, cafetera.getCantidadActual());
		// segundo caso (cantidad actual+relleno>capacidadMAxima)
		relleno = 60;
		cafetera.agregarCafe(relleno);
		assertEquals(CAPACIDAD_MAXIMA, cafetera.getCantidadActual());
		
	}
	@Test
	void testAgregarCafeDos() {
		// tercer caso
		int relleno = 30;
		cafetera.agregarCafe(relleno);
		assertEquals(relleno, cafetera.getCantidadActual());
		cafetera.agregarCafe(relleno);
		relleno += relleno;
		assertEquals(relleno, cafetera.getCantidadActual());
	}

}
