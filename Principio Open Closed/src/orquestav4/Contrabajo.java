package orquestav4;

public class Contrabajo extends Instrumento {

	public Contrabajo(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("buscar apoyo para todo esto");
	}
	
	public void afinar() {
		System.out.println("me pongo a afinar esta cosa grande de forma concreta");
	}

}
