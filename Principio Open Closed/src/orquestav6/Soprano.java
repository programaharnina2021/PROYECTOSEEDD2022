package orquestav6;

public class Soprano implements Playable,Aclarable{
	int carneID;

	public Soprano(int carneID) {
		super();
		this.carneID = carneID;
	}

	@Override
	public void play() {
		System.out.println("estoy cantando como soprano");
	}
	
	public void aclarar() {
		System.out.println("estoy aclarando la voz");
	}
}
