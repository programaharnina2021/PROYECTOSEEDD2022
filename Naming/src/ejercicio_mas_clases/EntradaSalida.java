package ejercicio_mas_clases;
import java.util.Scanner;

public class EntradaSalida {
	public String solicitarPalabraSecreta() {
		Scanner lectorTeclado = new Scanner(System.in);
		System.out.println("Introduce la palabra secreta");
		String cadena = lectorTeclado.nextLine();
		cadena=cadena.toUpperCase();
		return cadena;
	}
	public char pedirLetraUsuario() {
		Scanner lectorTeclado = new Scanner(System.in);
		System.out.println("Introduce la letra");
		char caracterDeUsuario = lectorTeclado.nextLine().charAt(0);
		caracterDeUsuario = Character.toUpperCase(caracterDeUsuario);
		return caracterDeUsuario;
	}
}
