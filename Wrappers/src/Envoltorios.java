
public class Envoltorios {
public static void main(String[] args) {
	//tipos primitivos
	String primi="hola";
	int entero=1;
	byte bite;
	short cortito;
	long larguito;
	++entero;
	Integer intgg=9;
	++intgg;
	System.out.println(intgg.toString());
	//Conversion a string
	String string = intgg.toString();
	//conversion desde String
	//Necesitamos seleccionar el tipo de conversion;
	float recogida;
	primi="89";
	try {
		recogida=Float.valueOf(primi);
	} catch (NumberFormatException e) {
		System.out.println(e.getMessage());
		recogida=-1;
	}
	System.out.println(recogida);
}
}
