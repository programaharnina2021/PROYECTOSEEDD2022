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
		//Condiciones iniciales
		short capacidadMaxima=100;
		//SUT Subject Under Test
		Cafetera cafetera=new Cafetera(capacidadMaxima);
		cafetera.llenarCafetera();
		cafetera.vaciarCafetera();
		assertEquals(0, cafetera.getCantidadActual());
	}

	@Test
	void testAgregarCafe() {
		short capacidadMaxima=100;
		Cafetera cafetera=new Cafetera(capacidadMaxima);
		//primer caso
		int relleno=110;
		cafetera.agregarCafe(relleno);
		assertEquals(capacidadMaxima, cafetera.getCantidadActual());
		//segundo caso (cantidad actual+relleno>capacidadMAxima)
		relleno=60;
		cafetera.agregarCafe(relleno);
		assertEquals(capacidadMaxima, cafetera.getCantidadActual());
		//tercer caso
		relleno=30;
		cafetera=new Cafetera(capacidadMaxima);
		cafetera.agregarCafe(relleno);
		assertEquals(relleno, cafetera.getCantidadActual());
		cafetera.agregarCafe(relleno);
		relleno+=relleno;
		assertEquals(relleno, cafetera.getCantidadActual());
		
	}

}
