package futbol;

public class Emparejamiento {
	private Equipo primero;
	private Equipo segundo;
	private Resultado resultado;
	
	public Emparejamiento(Equipo primero, Equipo segundo) {
		super();
		this.primero = primero;
		this.segundo = segundo;
	}
	
	public void setResultado(int golesa,int golesB) {
		resultado=new Resultado(golesa,golesB);
	}
	public void setResultado(Resultado resultado) {
		this.resultado=resultado;
	}

	public Equipo getPrimero() {
		return primero;
	}

	public Equipo getSegundo() {
		return segundo;
	}

	public Resultado getResultado() {
		return resultado;
	}
	
	
}
