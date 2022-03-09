package ejemplos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ModifiedPrpertiesTest {

	@Test
	void testModifyingPropertie() {
		ModifiedPrperties instance=new ModifiedPrperties();
		int modifier = 4;
		instance.modifyingPropertie(modifier);
		int expected=instance.getAlgo()+modifier;
		assertEquals(expected, instance.getAlgo());
		instance.modifyingPropertie(modifier);
		expected+=modifier;
		assertEquals(expected, instance.getAlgo());
		
	}

}
