package withNonStaticMethids;


import model.Coordinate;
import model.Rectangulo;

public class MethodWithReturn02 {

	//non static
	public boolean giveMe() {
		return true;
	}
	
	public Rectangulo creadorRectangulos(Coordinate leftUp,Coordinate rigthDown) {
		return new Rectangulo(leftUp,rigthDown);
	}
}
