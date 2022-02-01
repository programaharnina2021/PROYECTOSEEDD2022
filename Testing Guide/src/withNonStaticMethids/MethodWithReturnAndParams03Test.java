package withNonStaticMethids;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MethodWithReturnAndParams03Test {

	@Test
	void testIsOdd() {
		//preparacion de situacion inicial
		MethodWithReturnAndParams03 methodWithReturnAndParams03
		=new MethodWithReturnAndParams03();
		int value=3;
		//esto una mezcla de prueba y comprobacion
		assertTrue(methodWithReturnAndParams03.isOdd(value));
	}

}
