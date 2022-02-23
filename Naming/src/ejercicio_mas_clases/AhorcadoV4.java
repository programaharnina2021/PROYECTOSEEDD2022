package ejercicio_mas_clases;


import java.util.Scanner;

import javax.xml.transform.SourceLocator;

//Una clase tiene propiedades
public class AhorcadoV4
{
	private String palabraSecreta;

	
	public void play() {
				//se crea la palabra con los aciertos
				palabraSecreta = solicitarPalabraSecreta();
				generaCadenaAciertos();

				boolean palabraAcertada=false;
				int cantidadDeFallos=0;

				do {
					char caracterDeUsuario = pedirLetraUsuario();
					boolean letraNoEstaEnPalabra = anotarAciertos(caracterDeUsuario);
					System.out.println("ha fallao " + letraNoEstaEnPalabra);
					palabraAcertada = comprobarResolucionPalabra();
					//me pregunto si he alcanzado el numero maximo de fallos
					if(letraNoEstaEnPalabra) {
						cantidadDeFallos++;
					}
				} while (cantidadDeFallos<5&&!palabraAcertada);
				System.out.println("terminado");
	}
}
