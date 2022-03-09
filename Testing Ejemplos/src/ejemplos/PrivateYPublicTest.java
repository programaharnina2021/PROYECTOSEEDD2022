package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrivateYPublicTest {

	@Test
	void testSoyPublico() {
		PrivateYPublic instance=new PrivateYPublic();
		int algo,expected;
		int soyPublico = instance.soyPublico(algo);
		assertEquals(expected, soyPublico);
	}

}
