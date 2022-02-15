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
		this.cantidadActual = 0;
	}

	@Override
	public void agregarCafe(int cantidad) {
		int cantidadTotal = this.cantidadActual + cantidad;
		if (cantidadTotal > capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		}else {
			this.cantidadActual=(short) cantidadTotal;
		}
	}

}
