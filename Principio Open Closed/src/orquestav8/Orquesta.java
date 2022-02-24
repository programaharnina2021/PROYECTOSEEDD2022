package orquestav8;

import java.util.ArrayList;

public class Orquesta {
	ArrayList<Playable> instrumentos;
	ArrayList<Preparable> preparables;

	public Orquesta(ArrayList<Playable> instrumentos, ArrayList<Preparable> preparables) {
		super();
		this.instrumentos = instrumentos;
		this.preparables = preparables;
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
		for (Preparable preparable : preparables) {
			preparable.prepare();
		}
	}

	private void play() {
		for (Playable instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
