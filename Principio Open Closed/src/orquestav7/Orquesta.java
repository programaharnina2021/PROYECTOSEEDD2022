package orquestav7;

import java.util.ArrayList;

public class Orquesta {
	ArrayList<Playable> instrumentos;
	ArrayList<Aclarable> aclarables;
	ArrayList<Afinable> afinables;
	ArrayList<Limpiable> limpiables;
	ArrayList<Estirable> estirables;

	public Orquesta(ArrayList<Playable> instrumentos, ArrayList<Aclarable> aclarables, ArrayList<Afinable> afinables,
			ArrayList<Limpiable> limpiables, ArrayList<Estirable> estirables) {
		super();
		this.instrumentos = instrumentos;
		this.aclarables = aclarables;
		this.afinables = afinables;
		this.limpiables = limpiables;
		this.estirables = estirables;
	}


	/**
	 * Hay que programar pensando en clases
	 * En la siguiente vamos a usar la herencia 
	 */
	public void darConcierto() {
		preparar();
		play();
	}

	private void preparar() {
		for (Aclarable aclarable : aclarables) {
			aclarable.aclarar();
		}
		for (Estirable estirable : estirables) {
			estirable.estirar();
		}
		
		for (Afinable afinable : afinables) {
			afinable.afinar();
		}
		for (Limpiable limpiable : limpiables) {
			limpiable.limpiar();
		}
	}

	private void play() {
		for (Playable instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
