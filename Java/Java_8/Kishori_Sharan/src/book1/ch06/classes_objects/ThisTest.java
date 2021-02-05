package book1.ch06.classes_objects;

public class ThisTest {
	int num = 1982;
	
	void printNum() {
		System.out.println("Instance variable num: " + num);
	}
	
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.printNum();
	}
}
