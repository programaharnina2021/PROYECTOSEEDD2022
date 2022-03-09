package v2;

import java.util.Random;

public class Utiles {

	public static int getRandom(int min, int max) {
		return new Random().nextInt(max-min)+min;
	}

}
