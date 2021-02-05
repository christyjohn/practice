package book1.ch06.classes_objects;

public class ThisTest3 {
int num = 1982;
	
	void printNum(int num) {
		System.out.println("Parameter num: " + num);
		System.out.println("Instance variable num: " + this.num); 
	}
	
	public static void main(String[] args) {
		ThisTest3 tt3 = new ThisTest3();
		tt3.printNum(1969);
	}
}
