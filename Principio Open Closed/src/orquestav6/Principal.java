package orquestav6;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		//el cliente tiene que trabajar mas pero
		//mi software no cambia
		//intentemos meter un nuevo instrumento no conocido
		ArrayList<Playable> instrumentos = new ArrayList<>();
		ArrayList<Aclarable> aclarables= new ArrayList<>();
		ArrayList<Afinable> afinables= new ArrayList<>();
		ArrayList<Limpiable> limpiables= new ArrayList<>();
		ArrayList<Estirable> estirables= new ArrayList<>();
		Bombo bombo = new Bombo("lolo");
		instrumentos.add(bombo);
		estirables.add(bombo);
		Violin violin = new Violin("juan");
		instrumentos.add(violin);
		afinables.add(violin);
		Clarinete clarinete = new Clarinete("luis");
		instrumentos.add(clarinete);
		limpiables.add(clarinete);
		Contrabajo contrabajo = new Contrabajo("Celia");
		instrumentos.add(contrabajo);
		afinables.add(contrabajo);
		// La soprano si es playable
		Soprano soprano = new Soprano(2);
		instrumentos.add(soprano);
		aclarables.add(soprano);
		new Orquesta(instrumentos,aclarables,afinables,limpiables,estirables).darConcierto();
		;
	}
}
