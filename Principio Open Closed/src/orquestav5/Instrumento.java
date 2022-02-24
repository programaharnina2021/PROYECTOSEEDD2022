package orquestav5;

public abstract class Instrumento {
	String name;
	
	public Instrumento(String name) {
		super();
		this.name = name;
	}

	public abstract void play();
}
