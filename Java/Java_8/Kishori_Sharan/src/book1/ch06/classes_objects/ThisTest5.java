package book1.ch06.classes_objects;

public class ThisTest5 {
	int num = 1982;
	
	void printNum(int num) {
		System.out.println("Parameter num: " + num);
		System.out.println("Instance variable num: " + num);
	}

	public static void main(String[] args) {
		ThisTest5 tt5 = new ThisTest5();
		tt5.printNum(1969);
	}
	
}
