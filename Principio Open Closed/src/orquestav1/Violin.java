package orquestav1;

public class Violin {
	String name;
	

	public Violin(String name) {
		super();
		this.name = name;
	}


	public void play() {
		System.out.println("estoy tocando un violin");
	}
	
	public void afinar() {
		System.err.println("estoy afinando el violin");
	}
	
}
