package withNonStaticMethids;

public class ClassWithPropertiesModified06 {
	private int amount=0;
	
	public void incrementAmount(int amount) {
		this.amount+=amount;
	}

	public int getAmount() {
		return this.amount;
	}
}
