package book1.ch07.objects_classes;

public class DeepClone implements Cloneable {
private DoubleHolder holder = new DoubleHolder(0.0);
	
	public DeepClone(double value) {
		this.holder.setValue(value);
	}

	public double getValue() {
		return this.holder.getValue();
	}

	public void setValue(double value) {
		this.holder.setValue(value);;
	}
	
	public DeepClone clone() {
		DeepClone copy = null;
		try {
			copy = (DeepClone) super.clone();
			
			// Need to clone the holder reference variable too
			copy.holder = (DoubleHolder)this.holder.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return copy;
	}
}
