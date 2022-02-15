package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import mastermind.dominio.ColorCombinacion;

class MasterMind5Test {

	@Test
	void testSortearEnigma() {
		boolean contains = Arrays.asList(ColorCombinacion.values()).contains("verde");
		//comndicion inicial
		MasterMind5 masterMind5=new MasterMind5();
		int expected=4;
		masterMind5.sortearEnigma();
		//primera prueba longitud correcta
		assertEquals(expected, masterMind5.getEnigma().size());
		for (int i = 0; i < expected; i++) {
			boolean containsTeo = Arrays
					.asList(ColorCombinacion.values())
					.contains(masterMind5.getEnigma().getAt(i));
			assertTrue(
					ColorCombinacion.isValid(
							masterMind5.getEnigma().getAt(i)));
		}
		
	}

}
