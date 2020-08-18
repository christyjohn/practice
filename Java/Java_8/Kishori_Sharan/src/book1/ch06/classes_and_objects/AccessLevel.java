package book1.ch06.classes_and_objects;

public class AccessLevel {
	private int v1 = 100;
	int v2 = 200;
	protected int v3 = 300;
	public int v4 = 400;
	
	public int getV1() {
		return this.v1;
	}
	
	public void setV1(int v1) {
		this.v1 = v1;
	}
	
	private void m1() {
		System.out.println("Inside m1():");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 + 
				", v3 = " + v3 + ", v4 = " + v4);	
	}
	
	void m2() {
		System.out.println("Inside m2():");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 + 
				", v3 = " + v3 + ", v4 = " + v4);
	}
	
	protected void m3() {
		System.out.println("Inside m3():");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 + 
				", v3 = " + v3 + ", v4 = " + v4);
	}
	
	public void m4() {
		System.out.println("Inside m4():");
		System.out.println("v1 = " + v1 + ", v2 = " + v2 + 
				", v3 = " + v3 + ", v4 = " + v4);
	}
}
