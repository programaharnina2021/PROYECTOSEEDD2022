package orquestav3;

import java.util.ArrayList;

public class Principal {
public static void main(String[] args) {
	ArrayList<Instrumento> instrumentos=new ArrayList<>();
	instrumentos.add(new Bombo("lolo"));
	instrumentos.add(new Violin("juan"));
	instrumentos.add(new Clarinete("luis"));
	new Orquesta(instrumentos).darConcierto();;
}
}
