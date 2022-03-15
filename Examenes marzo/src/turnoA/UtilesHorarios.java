package turnoA;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class UtilesHorarios {

	private float payPerMinute;

	public float calculateBill(String[] entrada, String[] salida) {
		return Duration.between(convertToTime(entrada), convertToTime(salida)).get(ChronoUnit.MINUTES) * payPerMinute;
	}

	private LocalTime convertToTime(String[] hora) {
		Integer hour = Integer.valueOf(hora[0]);
		Integer minute = Integer.valueOf(hora[1]);
		if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59)
			return LocalTime.of(hour, minute);
		return null;
	}

	public float getPayPerMinute() {
		return payPerMinute;
	}

	public void setPayPerMinute(float payPerMinute) {
		this.payPerMinute = payPerMinute;
	}
}
