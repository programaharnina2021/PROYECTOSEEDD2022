package orquestav7;

public class Violin extends Instrumento implements Playable,Afinable{

	public Violin(String name) {
		super(name);
	}

	@Override
	public void play() {
		System.out.println("estoy tocando un violin");
	}

	public void afinar() {
		System.err.println("estoy afinando el violin");
	}

}
