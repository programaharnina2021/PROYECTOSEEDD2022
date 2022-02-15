package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import mastermind.dominio.ColorCombinacion;

class MasterMind5Test {

	@Testz
	void testSortearEnigma() {
		//comndicion inicial
		MasterMind5 masterMind5=new MasterMind5();
		int expected=4;
		masterMind5.sortearEnigma();
		//primera prueba longitud correcta
		assertEquals(expected, masterMind5.getEnigma().size());
		for (int i = 0; i < expected; i++) {
			assertTrue(
					ColorCombinacion.isValid(
							masterMind5.getEnigma().getAt(i)));
		}
		
	}

}
