package turnoB;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class UtilesCalendario {
	private float payPerDay;

	public float calculateBill(String[] entrada, String[] salida) {
		return Period.between(convertToDays(entrada), convertToDays(salida)).get(ChronoUnit.DAYS) * payPerDay;
	}

	private LocalDate convertToDays(String[] today) {
		Integer day = Integer.valueOf(today[0]);
		Integer month = Integer.valueOf(today[1]);
		if (day >= 1 && day <= 30 && month >= 1 && month <= 12)
			return LocalDate.of(2022,day, month);
		return null;
	}

	public float getPayPerMinute() {
		return payPerDay;
	}

	public void setPayPerMinute(float payPerMinute) {
		this.payPerDay = payPerMinute;
	}
}
