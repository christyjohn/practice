package book1.ch06.classes_objects;

public class ThisTest2 {
	int num = 1982;
	
	void printNum(int num) {
		System.out.println("Parameter num: " + num);
		System.out.println("Instance variable num: " + num); // not the intended result
	}
	
	public static void main(String[] args) {
		ThisTest2 tt2 = new ThisTest2();
		tt2.printNum(1969);
	}
}
