
public class Pescadero {
	String nombre;
	int esperanzaVida;
	int edad=0;
	
	public void cumplirAnno() {
		if(isVivo())edad++;
	};
	
	public boolean isVivo() {
		return edad<esperanzaVida;
	}
	
	public void realizarActividadSecundaria(String licencia) {
		System.out.println("realziar actividad con licencia "+licencia);
	}
}
