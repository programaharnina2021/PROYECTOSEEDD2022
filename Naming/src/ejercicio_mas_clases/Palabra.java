package ejercicio_mas_clases;

public class Palabra {
	private char[] cadenaLetrasAcertadas;
	String palabraSecreta;
	
	public Palabra(String palabraSecreta) {
		super();
		this.palabraSecreta = palabraSecreta;
	}

	private void generaCadenaAciertos() {
		cadenaLetrasAcertadas = new char[palabraSecreta.length()];
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
			cadenaLetrasAcertadas[i] = '_';
		}
	}

	public boolean anotarAciertos(char caracterDeUsuario) {
		boolean resultadoLocal = true;
		// si la letra está en la palabra secreta la escribo en la de los aciertos
		for (int i = 0; i < cadenaLetrasAcertadas.length; i++) {
			if (palabraSecreta.charAt(i) == caracterDeUsuario) {
				cadenaLetrasAcertadas[i] = caracterDeUsuario;
				resultadoLocal = false;
			}
		}
		return resultadoLocal;
	}
	public boolean comprobarResolucionPalabra() {
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
}
