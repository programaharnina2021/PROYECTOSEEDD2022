package orquestav2;

public class Orquesta {
	Violin violin;
	Bombo bombo;
	Clarinete clarinete;
	Soprano soprano;

	public Orquesta(Violin violin, Bombo bombo, Clarinete clarinete, Soprano soprano) {
		super();
		this.violin = violin;
		this.bombo = bombo;
		this.clarinete = clarinete;
		this.soprano = soprano;
	}

	/**
	 * Hay que programar pensando en clases
	 * En la siguiente vamos a usar la herencia 
	 */
	public void darConcierto() {
		violin.afinar();
		bombo.estirar();
		clarinete.limpiar();
		soprano.aclarar();
		violin.play();
		bombo.play();
		clarinete.play();
		soprano.play();
		
	}
}
