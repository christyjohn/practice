package book1.ch07.objects_classes;

public class Finalize {
	private int x;
	
	public Finalize(int x) {
		this.x = x;
	}
	
	public void finalize() {
		System.out.println("Finalizing " + this.x);;
	}
}
