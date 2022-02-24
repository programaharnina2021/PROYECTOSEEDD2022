package orquestav5;

public class Soprano {
	int carneID;

	public Soprano(int carneID) {
		super();
		this.carneID = carneID;
	}

	public void play() {
		System.out.println("estoy cantando como soprano");
	}
	
	public void aclarar() {
		System.out.println("estoy aclarando la voz");
	}
}
