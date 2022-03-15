package turnoA;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class aparcandoTest {
	aparcando instancia;
	
	@BeforeEach
	void beforeEach() {
		instancia=new aparcando();
	}
	
	@Test
	void testTikect01pami() {
		//condiciones iniciales
		assertNull(instancia.getEntrando());
		//prueba del SUT
		instancia.tikect01pami();
		//asercion
		assertNotNull(instancia.getEntrando());
	}

	@Test
	void testMePiro() {
		//condiciones iniciales
		String[] horaComienzo= {"0","0"},horaSalida= {"0","1"};
		float tarifa=1f;
		float expected=1;
		//La prueba
		instancia.setEntrando(horaComienzo);
		instancia.setLadolorosa(tarifa);
		//metodo SUT
		float mePiro = instancia.mePiro(horaSalida);
		//asercion
		assertEquals(expected, mePiro);		
	}

}
