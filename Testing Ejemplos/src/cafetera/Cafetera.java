package cafetera;

public class Cafetera implements Cafeteable {
	private short capacidadMaxima, cantidadActual;

	public Cafetera(short capacidadMaxima) {
		super();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = 0;
	}

	public short getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public short getCantidadActual() {
		return cantidadActual;
	}

	@Override
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}

	@Override
	public int servirTaza(int capacidad) {
		if (cantidadActual >= capacidad) {
			cantidadActual -= capacidad;
			return capacidad;
		}
		int servir = cantidadActual;
		cantidadActual = 0;
		return servir;
	}

	@Override
	public void vaciarCafetera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregarCafe(int capacidad) {
		// TODO Auto-generated method stub

	}

}
