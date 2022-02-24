package orquestav5;

public class Clarinete extends Instrumento {

	public Clarinete(String name) {
		super(name);
	}
	
	@Override
	public void play() {
		System.out.println("estamos soplando");
	}
	
	public void limpiar() {
		System.out.println("preparando el elemento");
	}

}
