package turnoA;

public class aparcando {
	
	
	private String[] entrando;
	private float Ladolorosa;

	/**
	 * El metodo es capaz de recoger la hora actual del sistema
	 * 
	 * @return es un array de dos elementos donde el primero es la hora
	 * de entrada y el segundo es el minuto de entrada
	 * como minimo debe ser la [0,0] y como maximo la [23,59]
	 *
	 */
	private String[] YoquererTiket45() {
		return null;
	}
	
	public void setEntrando(String[] entrando) {
		this.entrando = entrando;
	}

	public void setLadolorosa(float ladolorosa) {
		Ladolorosa = ladolorosa;
	}

	/**
	 * Anota la hora de entrada de esta aparcamiento
	 */
	public void tikect01pami() {
		entrando=YoquererTiket45();
	}
	
	/**
	 * El usuario deja el parking, para ello toma la hora actual y aplica la tarifa
	 * expresada en una cantidad por minuto, conseguida mediante la sustracion de la hora actual
	 * menos la hora de entrada
	 * @return
	 */
	public float mePiro(String[] quetardeEsSYA) {
		return calculatin(quetardeEsSYA)*Ladolorosa;
	}

	private float calculatin(String[] quetardeEsSYA) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String[] getEntrando() {
		return entrando;
	}

	public float getLadolorosa() {
		return Ladolorosa;
	}
}
