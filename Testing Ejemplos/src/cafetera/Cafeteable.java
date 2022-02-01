package cafetera;

public interface Cafeteable {
	/**
	 * Incrementar la cantidadACtual hasta el valor de la capacidadMAxima
	 */
	public void llenarCafetera();
	/**
	 * decremeta en una cantidad la cantidadACtual de la cafetera
	 * la cantidad nunca puede sobrepasar la cantidadActual
	 * @param capacidad la cantidad que debe decrementar la cantidadActual.
	 * Debe ser un valor positivo
	 * @return el valor en que ha podido decrementar la cantidadACtual
	 */
	public int servirTaza(int capacidad);
	/**
	 * Pone a cero la capacidadActual
	 */
	public void vaciarCafetera();
	/**
	 * Incrementa la cantidadActual en la cantidad que diga el parametro
	 * capacidad sin que sobrepase la capacidadMaxima
	 * @param capacidad cantidad que quiero incrementar la cantidadActual 
	 */
	public void agregarCafe(int capacidad);
}
