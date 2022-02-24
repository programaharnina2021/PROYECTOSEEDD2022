package orquestav7;

public class Timbal extends Instrumento implements Playable, Estirable {

	public Timbal(String name) {
		super(name);
	}

	@Override
	public void estirar() {
		System.out.println("estirando el timbal");

	}

	@Override
	public void play() {
		System.out.println("tocando el timbal");

	}

}
