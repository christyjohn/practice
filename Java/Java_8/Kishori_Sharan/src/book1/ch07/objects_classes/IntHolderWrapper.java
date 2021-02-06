package book1.ch07.objects_classes;

public class IntHolderWrapper {
	private final IntHolder valueHolder;
	
	public IntHolderWrapper(int value) {
		this.valueHolder = new IntHolder(value);
	}
	
	public IntHolder getIntHolder() {
		return this.valueHolder;
	}
	
	public int getValue() {
		return this.valueHolder.getValue();
	}
}
