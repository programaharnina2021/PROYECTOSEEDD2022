package ejercicio_mas_clases;


import java.util.Scanner;

import javax.xml.transform.SourceLocator;

//Una clase tiene propiedades
public class AhorcadoV5
{
	private String palabraSecreta;
	EntradaSalida entradaSalida=new EntradaSalida();
	Palabra palabra;
	
	public void play() {
				//se crea la palabra con los aciertos
				palabraSecreta = entradaSalida.solicitarPalabraSecreta();
				palabra=new Palabra(palabraSecreta);

				boolean palabraAcertada=false;
				int cantidadDeFallos=0;

				do {
					char caracterDeUsuario = entradaSalida.pedirLetraUsuario();
					boolean letraNoEstaEnPalabra = palabra.anotarAciertos(caracterDeUsuario);
					System.out.println("ha fallao " + letraNoEstaEnPalabra);
					palabraAcertada = palabra.comprobarResolucionPalabra();
					//me pregunto si he alcanzado el numero maximo de fallos
					if(letraNoEstaEnPalabra) {
						cantidadDeFallos++;
					}
				} while (cantidadDeFallos<5&&!palabraAcertada);
				System.out.println("terminado");
	}
}
