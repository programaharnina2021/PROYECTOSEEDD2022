package futbol;

public class EmparejamientoPrimitivo {
	private String equipoA, equipoB;
	private int golesA, golesB;

	public EmparejamientoPrimitivo(String equipoA, String equipoB, int golesA, int golesB) {
		super();
		this.equipoA = equipoA;
		this.equipoB = equipoB;
		this.golesA = golesA;
		this.golesB = golesB;
	}

	public String getEquipoA() {
		return equipoA;
	}

	public String getEquipoB() {
		return equipoB;
	}

	public int getGolesA() {
		return golesA;
	}

	public int getGolesB() {
		return golesB;
	}

}
