package book1.ch06.classes_and_objects;

public class AccessLevelTest1 {

	public static void main(String[] args) {
		AccessLevel al = new AccessLevel();
		
		// The field AccessLevel.v1 is not visible
		//int a = a1.v1;
		int b = al.v2;
		int c = al.v3;
		int d = al.v4;
		
		System.out.println("b = " + b + ",c = " + c + ", d = " + d);
		
		// The method m1() from the type AccessLevel is not visible
		//a1.m1();
		al.m2();
		al.m3();
		al.m4();
		
		/* Modify the values of instance variables */
		al.v2 = 20;
		al.v3 = 30;
		al.v4 = 40;
		
		System.out.println("\nAfter modifying v2, v3 and v4");
		
		al.m2();
		al.m3();
		al.m4();
	}

}
