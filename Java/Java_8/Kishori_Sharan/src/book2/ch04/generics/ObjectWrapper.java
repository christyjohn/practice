package book2.ch04.generics;

public class ObjectWrapper {
	private Object ref;
	
	public ObjectWrapper(Object ref) {
		this.ref = ref;
	}
	
	public Object get() {
		return ref;
	}
	
	public void set(Object ref) {
		this.ref = ref;
	}
}
