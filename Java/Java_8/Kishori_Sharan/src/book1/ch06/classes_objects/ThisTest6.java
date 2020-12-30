package book1.ch06.classes_objects;

public class ThisTest6 {
	int num = 1982;
	
	void printNum(int num) {
		System.out.println("Parameter num: " + num);
		System.out.println("Instance variable num: " + this.num);
	}

	public static void main(String[] args) {
		ThisTest6 tt6 = new ThisTest6();
		tt6.printNum(1969);
	}
}
