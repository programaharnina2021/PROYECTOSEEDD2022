package v1;

public class Policia extends Habitante implements Terciaria {
	@Override
	public void realizaActividad(int ambito) {
		System.out.println("realizando actividad de ambito " + ambito);
	}
}
