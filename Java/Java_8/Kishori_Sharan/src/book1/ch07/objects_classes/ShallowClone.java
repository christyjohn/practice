package book1.ch07.objects_classes;

public class ShallowClone implements Cloneable {
	private DoubleHolder holder = new DoubleHolder(0.0);
	
	public ShallowClone(double value) {
		this.holder.setValue(value);
	}

	public double getValue() {
		return this.holder.getValue();
	}

	public void setValue(double value) {
		this.holder.setValue(value);;
	}
	
	public ShallowClone clone() {
		ShallowClone copy = null;
		try {
			copy = (ShallowClone) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return copy;
	}
}
