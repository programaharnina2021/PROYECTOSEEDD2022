package orquestav8;

public class Oboe extends Instrumento implements Playable,Limpiable,Preparable {

	public Oboe(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		System.out.println("aqui Obedando");
	}

	public void limpiar() {
		System.out.println("limpiando el oboe");
	}

	@Override
	public void prepare() {
		limpiar();
		
	}
}
