package turnoB;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesCalendarioTest {

	@Test
	void testCalculateBill() {
		String[] diaComienzo= {"1","1"},diaSalida= {"2","1"};
		float tarifa=10f;
		float expected=10;
		UtilesCalendario instancia=new UtilesCalendario();
		instancia.setPayPerMinute(tarifa);
		float calculateBill = instancia.calculateBill(diaComienzo, diaSalida);
		assertEquals(expected, calculateBill);
	}

}
