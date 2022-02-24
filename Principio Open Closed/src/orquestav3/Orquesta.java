package orquestav3;

import java.util.ArrayList;

public class Orquesta {
	ArrayList<Instrumento> instrumentos;

	public Orquesta(ArrayList<Instrumento> instrumentos) {
		super();
		this.instrumentos = instrumentos;
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
		for (Instrumento instrumento : instrumentos) {
			if (instrumento instanceof Violin) {
				((Violin) instrumento).afinar();
			} else if (instrumento instanceof Bombo) {
				((Bombo) instrumento).estirar();
			} else if (instrumento instanceof Clarinete) {
				((Clarinete) instrumento).limpiar();
			}
		}
	}

	private void play() {
		for (Instrumento instrumento : instrumentos) {
			instrumento.play();
		}
	}
}
