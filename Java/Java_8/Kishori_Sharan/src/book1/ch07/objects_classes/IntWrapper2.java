package book1.ch07.objects_classes;

public class IntWrapper2 {
	private final int value;
	private int halfValue = Integer.MAX_VALUE;
	
	public IntWrapper2(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int gethalfValue() {
		// Compute half value if it is not already computed
		if (this.halfValue == Integer.MAX_VALUE) {
			// Cache the half value for future use
			this.halfValue = this.value / 2;
		}
		return halfValue;
	}
}
