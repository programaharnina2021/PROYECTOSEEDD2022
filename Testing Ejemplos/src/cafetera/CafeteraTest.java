package cafetera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CafeteraTest {

	@Test
	void testLlenarCafetera() {
		short capacidadMaxima=100;
		Cafetera cafetera=new Cafetera(capacidadMaxima);
		cafetera.llenarCafetera();
		if(cafetera.getCapacidadMaxima()==0) {
			fail("capacidad maxima a cero");
		}
		assertEquals(cafetera.getCantidadActual(), cafetera.getCapacidadMaxima());
	}

	@Test
	void testServirTaza() {
		//condiciones iniciales de la prueba
		short capacidadMaxima=100;
		Cafetera cafetera=new Cafetera(capacidadMaxima);
		cafetera.llenarCafetera();
		short taza=60;
		//ejecutar el SUT
		int tazaUno=cafetera.servirTaza(taza);
		int tazaDos=cafetera.servirTaza(taza);
		//comprobar resultado
		assertEquals(taza, tazaUno);
		assertEquals(cafetera.getCapacidadMaxima()-taza, tazaDos);
	}
	@Test
	void testServirTazaDos() {
		short capacidadMaxima=100;
		Cafetera cafetera=new Cafetera(capacidadMaxima);
		cafetera.llenarCafetera();
		short taza=160;
		int tazaUno=cafetera.servirTaza(taza);
		assertEquals(cafetera.getCapacidadMaxima(), tazaUno);
	}
	@Test
	void testVaciarCafetera() {
		fail("Not yet implemented");
	}

	@Test
	void testAgregarCafe() {
		fail("Not yet implemented");
	}

}
