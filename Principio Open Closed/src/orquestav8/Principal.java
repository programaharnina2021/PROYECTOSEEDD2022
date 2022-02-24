package orquestav8;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		//el cliente tiene que trabajar mas pero
		//mi software no cambia
		//intentemos meter un nuevo instrumento no conocido
		ArrayList<Playable> instrumentos = new ArrayList<>();
		ArrayList<Preparable> preparables= new ArrayList<>();
		Bombo bombo = new Bombo("lolo");
		instrumentos.add(bombo);
		preparables.add(bombo);
		Violin violin = new Violin("juan");
		instrumentos.add(violin);
		preparables.add(violin);
		Clarinete clarinete = new Clarinete("luis");
		instrumentos.add(clarinete);
		preparables.add(clarinete);
		Contrabajo contrabajo = new Contrabajo("Celia");
		instrumentos.add(contrabajo);
		preparables.add(contrabajo);
		// La soprano si es playable
		Soprano soprano = new Soprano(2);
		instrumentos.add(soprano);
		preparables.add(soprano);
		Timbal timbal = new Timbal("Amalia");
		instrumentos.add(timbal);
		preparables.add(timbal);
		new Orquesta(instrumentos,preparables).darConcierto();
		;
	}
}
