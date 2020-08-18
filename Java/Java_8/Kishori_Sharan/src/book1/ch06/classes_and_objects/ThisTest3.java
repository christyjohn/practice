package book1.ch06.classes_and_objects;

public class ThisTest3 {
	int num = 1982;		// An instance variable
	
	void printNum(int num) {
		System.out.println("Parameter num: " + num);
		System.out.println("Instance variable num: " + num); // not instance variable
	}

	public static void main(String[] args) {
		ThisTest3 tt3 = new ThisTest3();
		tt3.printNum(1969);
	}

}
