package ahorcado;

import java.util.Scanner;

public class AhorcadoV0
{
	public static void main(String[] args) {
		//Leer la palabra secreta
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String secr = leer.nextLine();
		secr=secr.toUpperCase();
		//se crea la palabra con los aciertos
		boolean fal = true;
		boolean acertado=false;
		int fallo=0;
		char[] parc = new char[secr.length()];
		for (int i = 0; i < parc.length; i++) {
				parc[i] = '_';
		}
		//el bucle del juego
		do {
			System.out.println("Introduce la letra");
			char le = leer.nextLine().charAt(0);
			le = Character.toUpperCase(le);
			
			//si la letra está en la palabra secreta la escribo en la de los aciertos
			for (int i = 0; i < parc.length; i++) {
				if (secr.charAt(i) == le) {
					parc[i] = le;
					fal = false;
				}
			}
			
			System.out.println("ha fallao " + fal);
			acertado=true;
			//me pregunto si alguna letra de parc esta con '_' significa que no
			//esta todavia acertada la palabra
			for (int i = 0; i < parc.length; i++) {
				System.out.print(" " + parc[i]);
				if(parc[i]=='_') {
					acertado=false;
				}
			}
			//me pregunto si he alcanzado el numero maximo de fallos
			if(fal==true) {
				fallo++;
				fal=true;
			}
		} while (fallo<5&&!acertado);
		System.out.println("terminado");
	}
}
