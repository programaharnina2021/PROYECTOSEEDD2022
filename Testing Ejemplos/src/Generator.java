
public class Generator {

	private int elementos[]=new int[10];

	public Generator() {
		super();
		//Relleno el array de numeros impares postivos diferentes menores que 100
		for (int i = 0; i < elementos.length; i++) {
			elementos[i]=9;
		}
	}

	public int[] getElementos() {
		return elementos;
	}
	
	public int[] duplicate() {
		int[] arra = new int[10];
		for (int i = 0; i < arra.length; i++) {
			arra[i]=9;
		}
		return arra;
	}
	
}
