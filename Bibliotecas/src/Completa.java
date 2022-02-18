
public class Completa {
public static void main(String[] args) {
	String saludo="hola";
	//Un string modificable
	StringBuilder saludoModificable=new StringBuilder("hola");
	System.out.println(saludoModificable);
	saludoModificable.append(" capullos");
	System.out.println(saludoModificable);
	//un string modifcable para ,muchos hilos
	StringBuffer saludoModifcableParaMuchosHilos=new StringBuffer();
	String otr=saludoModificable.toString();
}
}
