package mastermind;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import mastermind.dominio.ColorCombinacion;
import mastermind.dominio.ColorResultado;
import mastermind.dominio.Combinacion;

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
			//Este metodo para asegurar si un color de la combinacion enigma
			//sirve para cualquier otra combinacion
			boolean containsTeo = Arrays
					.asList(ColorCombinacion.values())
					.contains(masterMind5.getEnigma().getAt(i));
			assertTrue(
					ColorCombinacion.isValid(
							masterMind5.getEnigma().getAt(i)));
		}
		
	}
	@Test
	void testPedirCombinacion() {
		//lo que necesito para validar este metodo es que
//		me entregue una combinacion de colores de tamano 4 
		//donde todos los colores sean validos
		//primera prueba comporbar longitud
		//comndicion inicial
		MasterMind5 masterMind5=new MasterMind5();
		int expected=4;
		//prueba del SUT
		Combinacion actualCombination = masterMind5.pedirCombinacion();
		//Comprobacion
		assertEquals(expected, actualCombination.size());
		//segunda prueba
		for (int i = 0; i < expected; i++) {
			assertTrue(
					ColorCombinacion.isValid(
							actualCombination.getAt(i)));
		}
	}

	@Test
	void testComprobarColor() {
		//condiciones iniciales
		int size=4;
		Combinacion secreta=new Combinacion(size);
		ColorCombinacion[] mia= {
				ColorCombinacion.amarillo,
				ColorCombinacion.verde,
				ColorCombinacion.rojo,
				ColorCombinacion.rosa};
		for (int i = 0; i < mia.length; i++) {
			secreta.setColorCombinacionAt(i, mia[i]);
		}
		MasterMind5 masterMind5=new MasterMind5();
		masterMind5.setEnigma(secreta);
		//la prueba del SUT
		//primera prueba
		Combinacion usuario=new Combinacion(size);
		ColorCombinacion[] combinacionUsuario= {
				ColorCombinacion.amarillo,
				ColorCombinacion.verde,
				ColorCombinacion.rojo,
				ColorCombinacion.rosa};
		for (int i = 0; i < combinacionUsuario.length; i++) {
			usuario.setColorCombinacionAt(i, combinacionUsuario[i]);
		}
		ColorResultado[] expected= {ColorResultado.blanco,ColorResultado.blanco,ColorResultado.blanco,ColorResultado.blanco};
		// probar el SUT
		ColorResultado[] comprobarColor = masterMind5.comprobarColor(usuario);
		//comprobacion resultado
		assertArrayEquals(expected, comprobarColor);
		
		//segunda prueba
		Combinacion usuarioDos=new Combinacion(size);
		ColorCombinacion[] combinacionUsuarioDos= {
				ColorCombinacion.amarillo,
				ColorCombinacion.amarillo,
				ColorCombinacion.rosa,
				ColorCombinacion.amarillo
				};
		for (int i = 0; i < combinacionUsuario.length; i++) {
			usuario.setColorCombinacionAt(i, combinacionUsuario[i]);
		}
		ColorResultado[] expectedDos= {ColorResultado.blanco,ColorResultado.blanco,ColorResultado.vacio,ColorResultado.vacio};
		// probar el SUT
		ColorResultado[] comprobarColorDos = masterMind5.comprobarColor(usuarioDos);
		//comprobacion resultado
		assertArrayEquals(expectedDos, comprobarColorDos);
	}
}
