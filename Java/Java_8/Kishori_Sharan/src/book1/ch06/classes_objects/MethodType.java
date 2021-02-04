package book1.ch06.classes_objects;

public class MethodType {
	static int m = 100;
	int n = 200;

	static void printM() {
		System.out.println("printM() - m = " + m);

		// System.out.println("printM() - n = " + n); //Cannot make a static reference
		// to the non-static field n
	}

	void printMN() {
		/* We can refer to both static and instance variables m and n in this method */
		System.out.println("printMN() - m = " + m);
		System.out.println("printMN() - n = " + n);
	}
}
