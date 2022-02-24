package orquestav8;

public class Clarinete extends Instrumento implements Playable,Limpiable,Preparable {

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

	@Override
	public void prepare() {
		limpiar();
		
	}

}
