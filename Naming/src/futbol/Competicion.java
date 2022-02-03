package futbol;

import java.util.Random;

public class Competicion {
	private Equipo[] equipos;
	private Emparejamiento[] emparejamientos;

	public Competicion(Equipo[] equipos) {
		super();
		this.equipos = equipos;
		emparejamientos = emparejamientoEquipos();
		disputarEnfrentamientos();
	}

	/**
	 * recorre los enfrentamientos ya creados y aletoriamente le da un valor a los goles de cada equipo 
	 */
	public void disputarEnfrentamientos() {
		for (int i = 0; i < emparejamientos.length; i++) {
			emparejamientos[i].setResultado(generarNumeroAleatorio(),generarNumeroAleatorio());
		}
	}
	
	private int generarNumeroAleatorio() {
		int max=10;
		return 0;
//		return new Random().nextInt(max);
	}

	public Emparejamiento[] emparejamientoEquipos() {
		int[] guiaEmparejamiento = new int[equipos.length];
		iniciarGuiaEmparejamiento(guiaEmparejamiento);
		//Voy a crear un vector de enfrentamientos
		Emparejamiento[] emparejamientos
		=new Emparejamiento[calculaCantidadEmparejamientos(equipos.length)];
		for (int i = 0; i < emparejamientos.length; i++) {
			emparejamientos[i]=new Emparejamiento
					(seleccionaEquipo(guiaEmparejamiento,0), seleccionaEquipo(guiaEmparejamiento,1));
			emparejamientos[++i]=new Emparejamiento
					(seleccionaEquipo(guiaEmparejamiento,2), seleccionaEquipo(guiaEmparejamiento,3));
			modificarGuiaEmparejamiento(guiaEmparejamiento);
		}
		return emparejamientos;
	}

	private Equipo seleccionaEquipo(int[] guiaEmparejamiento,int posicion) {
		return equipos[guiaEmparejamiento[posicion]];
	}

	public int calculaCantidadEmparejamientos(int length) {
		int resultado=0;
		for (int i = --length; i >=1; i--) {
			resultado+=i;
		}
		return resultado;
	}

	public void modificarGuiaEmparejamiento(int[] guiaEmparejamiento) {
		for (int i = 1; i < guiaEmparejamiento.length; i++) {
			int valor = ++guiaEmparejamiento[i];
			guiaEmparejamiento[i] = valor % guiaEmparejamiento.length;
			if(guiaEmparejamiento[i]==0) guiaEmparejamiento[i]++;
		}
		
	}

	public void iniciarGuiaEmparejamiento(int[] guiaEmparejamiento) {
		for (int i = 0; i < guiaEmparejamiento.length; i++) {
			guiaEmparejamiento[i]=i;
		}
		
	}

	public Emparejamiento[] getEmparejamientos() {
		return emparejamientos;
	}

	public void play() {
		// TODO Auto-generated method stub
	}
}
