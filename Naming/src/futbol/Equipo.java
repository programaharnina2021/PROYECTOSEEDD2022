package futbol;

public class Equipo {
	private final String nombre;
	private int puntuacion=0;

	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		if (puntuacion == 1 || puntuacion == 3)
			this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

}
