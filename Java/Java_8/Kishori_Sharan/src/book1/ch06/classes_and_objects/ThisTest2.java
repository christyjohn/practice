package book1.ch06.classes_and_objects;

public class ThisTest2 {
	int num = 1982;		// An instance variable	

	public static void main(String[] args) {
		ThisTest2 tt2 = new ThisTest2();
		tt2.printNum();
	}	

	void printNum() {
		System.out.println("Instance variable num: " + num);
	}

}
