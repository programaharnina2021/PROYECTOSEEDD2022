package futbol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmparejamientoPrimitivoTest {

	@Test
	void testEmparejamientoPrimitivo() {
		EmparejamientoPrimitivo emparejamiento=new EmparejamientoPrimitivo
				("Coria", "Moraleja", 4	, 3);
		System.out.println("el emparejamiento del "
				+emparejamiento.getEquipoA()
				+" contra "+emparejamiento.getEquipoB()
				+" tuvieron un resultado de "
				+emparejamiento.getGolesA()
				+":"
				+emparejamiento.getGolesB());
	}

}
