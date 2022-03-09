package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testCumpleAnnos() {
		Persona persona=new Persona();
		persona.cumpleAnnos();
		int expected=1;
		assertEquals(expected, persona.getEdad());
	}

}
