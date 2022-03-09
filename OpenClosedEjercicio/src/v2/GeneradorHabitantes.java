package v2;

public class GeneradorHabitantes {
	//metodo de factoria malo
	public static Habitante getHabitante(int tipo) {
		switch (tipo) {
		case 1:
			return new Alfarero();
		case 2:
			return new Pescadero();
		case 3:
			return new Pescador();
		case 4:
			return new Policia();
		default:
			return null;
		}
	}
}
