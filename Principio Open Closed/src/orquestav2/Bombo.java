package orquestav2;

public class Bombo {
	String name;
	
	public Bombo(String name) {
		super();
		this.name = name;
	}

	public void play() {
		System.out.println("dandole golpes a esto");
	}
	
	public void estirar() {
		System.out.println("tensando la superficie del bombo");
	}
}
