package withNonStaticMethids;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Rectangle;

import org.junit.jupiter.api.Test;

import model.Coordinate;
import model.Rectangulo;

class MethodWithReturn02Test {
	
	@Test
	void testGiveMe() {
		//parte nueva crear el objeto de la prueba
		MethodWithReturn02 methodWithReturn02=new MethodWithReturn02();
		assertTrue(methodWithReturn02.giveMe());
		//pruebas sobre un objeto anonimo
		assertTrue(new MethodWithReturn02().giveMe());	
		//muchos objetos anonimos
		Coordinate leftUp = new Coordinate(0, 0);
		Coordinate rigthDown = new Coordinate(1, 1);
		Rectangulo miRectangulo=new MethodWithReturn02()
				.creadorRectangulos(new Coordinate(0, 0), new Coordinate(1, 1));
		assertEquals(miRectangulo.leftUp,leftUp);
		assertEquals(miRectangulo.rightDown, rigthDown);
	}

	
	
	
	
	
	
	
	
	
	
}
