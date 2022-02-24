package orquestav8;

public class Soprano implements Playable,Aclarable,Preparable{
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

	@Override
	public void prepare() {
		aclarar();
		
	}
}
