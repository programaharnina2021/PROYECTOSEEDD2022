package turnoB;



public class viendo {
	
	private String peli3;
	private String[] momentazo;
	private float TEcOBROtEcOBRO22;
	
	/**
	 * Con este método estoy alquilando una pelicula, dicho evento 
	 * ocurre en un momento de inicio del alquiler
	 * @param cosa
	 */
	public void pillo_peli(String cosa) {
		//TODO
		peli();
	}

	/**
	 * Aqui vamos a conseguir la fecha actual. Este metodo pone el valor
	 * del momento de inicio del alquiler.
	 * el momento es un array de dos posiciones donde la primera es el dia
	 * del mes y la segunda el mes del anno
	 */
	void peli() {
		momentazo=hoy();
	}

	private String[] hoy() {
		return null;
	}
	
	/**
	 * Este metodo sirve para finalizar el alquiler, obtiene la fecha actual
	 * y calcula el coste del alquiler, basado en una tarifa que cobra por dias
	 * @return
	 */
	public float peli33Tuu(String[] saliendo) {
		return total(saliendo);
	}

	private float total(String[] saliendo) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getPeli3() {
		return peli3;
	}

	public String[] getMomentazo() {
		return momentazo;
	}

	public float getTEcOBROtEcOBRO22() {
		return TEcOBROtEcOBRO22;
	}

	public void setPeli3(String peli3) {
		this.peli3 = peli3;
	}

	public void setMomentazo(String[] momentazo) {
		this.momentazo = momentazo;
	}

	public void setTEcOBROtEcOBRO22(float tEcOBROtEcOBRO22) {
		TEcOBROtEcOBRO22 = tEcOBROtEcOBRO22;
	}
}
