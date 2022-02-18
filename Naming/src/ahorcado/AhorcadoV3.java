package ahorcado;

import java.util.Scanner;

import javax.xml.transform.SourceLocator;

//Una clase tiene propiedades
public class AhorcadoV3
{
	private String palabraSecreta;
	private char[] cadenaLetrasAcertadas;

	String solicitarPalabraSecreta() {
		Scanner lectorTeclado = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String cadena = lectorTeclado.nextLine();
		cadena=cadena.toUpperCase();
		return cadena;
	}
	
	boolean comprobarResolucionPalabra() {
		//me pregunto si alguna letra de parc esta con '_' significa que no
		//esta todavia acertada la palabra
		boolean resultadoLocal=true;
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
			System.out.print(" " + cadenaLetrasAcertadas[i]);
			if(cadenaLetrasAcertadas[i]=='_') {
				resultadoLocal=false;
			}
		}
		return resultadoLocal;
	}

	boolean anotarAciertos(char caracterDeUsuario) {
		boolean resultadoLocal=true;
		//si la letra está en la palabra secreta la escribo en la de los aciertos
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
			if (palabraSecreta.charAt(i) == caracterDeUsuario) {
				cadenaLetrasAcertadas[i] = caracterDeUsuario;
				resultadoLocal = false;
			}
		}
		return resultadoLocal;
	}

	char pedirLetraUsuario() {
		Scanner lectorTeclado = new Scanner(System.in);
		System.out.println("Introduce la letra");
		char caracterDeUsuario = lectorTeclado.nextLine().charAt(0);
		caracterDeUsuario = Character.toUpperCase(caracterDeUsuario);
		return caracterDeUsuario;
	}

	void generaCadenaAciertos() {
		cadenaLetrasAcertadas = new char[palabraSecreta.length()];
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
				cadenaLetrasAcertadas[i] = '_';
		}
	}

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
