package orquestav1;

public class Orquesta {
	Violin violin;
	Bombo bombo;
	Clarinete clarinete;

	public Orquesta(Violin violin, Bombo bombo, Clarinete clarinete) {
		super();
		this.violin = violin;
		this.bombo = bombo;
		this.clarinete = clarinete;
	}

	/**
 * 	Aqui nos encontramos con el problema de que hay que trabajar especificamente
 * con cada instrumento
 * VAmos a modificarlo añadiendo un nuevo instrumento
	 */
	public void darConcierto() {
		violin.afinar();
		bombo.estirar();
		clarinete.limpiar();
		violin.play();
		bombo.play();
		clarinete.play();
		
	}
}
