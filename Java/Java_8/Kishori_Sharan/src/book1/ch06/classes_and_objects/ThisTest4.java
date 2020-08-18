package book1.ch06.classes_and_objects;

public class ThisTest4 {
	int num = 1982;		// An instance variable
	
	void printNum(int num) {
		System.out.println("Parameter num: " + num);
		System.out.println("Instance variable num: " + this.num);
	}

	public static void main(String[] args) {
		ThisTest4 tt4 = new ThisTest4();
		tt4.printNum(1969);
	}

}
