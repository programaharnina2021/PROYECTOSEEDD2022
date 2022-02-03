package futbol;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmparejamientoTest {

	@Test
	void testEmparejamiento() {
		Emparejamiento emparejamiento=new Emparejamiento(
				new Equipo("tomelloso"), 
				new Equipo("socuellamos"));
		emparejamiento.
			setResultado(new Resultado(3, 4));
		System.out.println("el emparejamiento del "
		+emparejamiento.getPrimero().getNombre()
		+" contra "+emparejamiento.getSegundo().getNombre()
		+" tuvieron un resultado de "
		+emparejamiento.getResultado().getGolesA()
		+":"
		+emparejamiento.getResultado().getGolesB());
	}

}
