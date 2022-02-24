package orquestav6;

public class Bombo extends Instrumento implements Playable,Estirable {

	public Bombo(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("dandole golpes a esto");
	}

	public void estirar() {
		System.out.println("tensando la superficie del bombo");
	}
}
