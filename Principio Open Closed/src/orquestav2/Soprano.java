package orquestav2;

public class Soprano {
	String name;

	public Soprano(String name) {
		super();
		this.name = name;
	}
	
	public void play() {
		System.out.println("estoy cantando como soprano");
	}
	
	public void aclarar() {
		System.out.println("estoy aclarando la voz");
	}
}
