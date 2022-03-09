package v2;

public abstract class Habitante {

	private String nombre;
	private int esperanzaVida;
	private int edad = 0;

	public Habitante() {
		super();
	}

	public void cumplirAnno() {
		if(isVivo())edad++;
	}

	public boolean isVivo() {
		return edad<esperanzaVida;
	}

}