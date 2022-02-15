package tresmetodos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPersona {

	@Test
	void test() {
		Persona uno = new Persona(1, "Luis");
//		System.err.println(uno.toString());
		Persona dos = new Persona(1, "Luis");
//		System.err.println(dos.toString());
		assertFalse(uno==dos);
		uno.print();
		System.out.println(uno.toString());
		assertTrue(uno.equals(dos));
		String unoS="hola";
		System.err.println(unoS.hashCode());
		String dosS="hola";
		System.err.println(dosS.hashCode());
		assertTrue(unoS==dosS);
		String tresS=new String("hola");
		System.err.println(tresS.hashCode());
		assertFalse(unoS==tresS);
	}

}
