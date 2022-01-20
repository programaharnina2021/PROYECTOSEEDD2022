package futbol;

public class Utiles {

	public static void generarEquipos(Equipo[] equipos) {
		String nombres[]= {"Tomelloso","Mismonose","Pepe","Chanchaina",
				"Elber","Fitipaldi","Obreros cansinos","Er Betis","Fito","Fargon"};
		for (int i = 0; i < equipos.length; i++) {
			equipos[i]=new Equipo(nombres[i]);
		}
		
	}

}
