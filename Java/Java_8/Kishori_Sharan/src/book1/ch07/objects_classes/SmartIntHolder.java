package book1.ch07.objects_classes;

public class SmartIntHolder {
	private int value;
	
	public SmartIntHolder(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	/* Reimplement toString() method of the Object class */
	public String toString() {
		// return the stored value as a string
		String str = String.valueOf(this.value);
		return str;
	}
}
