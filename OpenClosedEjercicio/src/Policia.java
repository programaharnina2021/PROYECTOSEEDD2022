
public class Policia {
	String nombre;
	int esperanzaVida;
	int edad=0;
	
	public void cumplirAnno() {
		if(isVivo())edad++;
	};
	
	public boolean isVivo() {
		return edad<esperanzaVida;
	}
	
	public void realizaActividadTerciaria(int ambito) {
		System.out.println("realizando actividad de ambito "+ambito);
	}
}
