package v2;

import java.util.ArrayList;

public class Pueblo {
	private final int cantidadHabitantesMaximo=10;
	private ArrayList<Habitante> habitantes;

	public Pueblo() {
		super();
		habitantes=new ArrayList<Habitante>();
		int min=1,max=4;
		for (int i = 0; i < cantidadHabitantesMaximo; i++) {
			habitantes.add(GeneradorHabitantes.getHabitante(Utiles.getRandom(min,max)));
		}
	}
	
	
}
