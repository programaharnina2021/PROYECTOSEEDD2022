package orquestav1;

public class Clarinete {
	String name;

	public Clarinete(String name) {
		super();
		this.name = name;
	}
	
	public void play() {
		System.out.println("estamos soplando");
	}
	
	public void limpiar() {
		System.out.println("preparando el elemento");
	}

}
