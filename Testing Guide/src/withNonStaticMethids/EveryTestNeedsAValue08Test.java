package withNonStaticMethids;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EveryTestNeedsAValue08Test {
	int size=4;
	int value=9;
	EveryTestNeedsAValue08 instance;
	
	@BeforeEach
	void beforeEach() {
		 instance=new EveryTestNeedsAValue08(size);
	}

	@Test
	void testAddValue() {		
		for (int i = 0; i <size; i++) {
			System.out.println("iteracion "+i);
			assertTrue(instance.addValue(value));
		}
		assertFalse(instance.addValue(value));
	}

	@Test
	void testGetValue() {
		int insert=2;
		int invalid=-1;
		for (int i = 0; i <insert; i++) {
			assertTrue(instance.addValue(value));
		}
		assertEquals(value,instance.getValue(insert-1));
		assertEquals(invalid, instance.getValue(insert));
	}

}
