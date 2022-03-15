package turnoB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class viendoTest {
	viendo instancia;
	
	@BeforeEach
	void beforeEach() {
		instancia=new viendo();
	}

	@Test
	void testPillo_peli() {
		assertNull(instancia.getMomentazo());
		instancia.pillo_peli("La cosa");
		assertNotNull(instancia.getMomentazo());
		String[] diaComienzo= {"15","03"};
		assertArrayEquals(instancia.getMomentazo(), diaComienzo);
	}

	@Test
	void testPeli33Tuu() {
		String[] diaComienzo= {"1","1"},diaSalida= {"2","1"};
		float tarifa=10f;
		float expected=10;
		instancia.setMomentazo(diaComienzo);
		//SUT
		float peli33Tuu = instancia.peli33Tuu(diaSalida);
		//asercion
		assertEquals(expected, peli33Tuu);
	}

}
