package ejemplos;

public class PrivateYPublic {

	public int soyPublico(int algo) {
		return soyPrivado(algo/2);
	}

	private int soyPrivado(int i) {
		return 0;
	}
}
