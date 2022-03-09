package v2;

public class Pescadero extends Habitante implements Secundaria{
	
	@Override
	public void realizarActividad(String licencia) {
		System.out.println("realziar actividad con licencia "+licencia);
	}
}
