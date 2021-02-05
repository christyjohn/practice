package book1.ch06.classes_objects.p1;

import book1.ch06.classes_objects.AccessLevel;

public class AccessLevelTest2 {
	public static void main(String[] args) {
		AccessLevel al = new AccessLevel();
		
		// int a = al.v1; // The field AccessLevel.v1 is not visible
		// int b = al.v2; // The field AccessLevel.v2 is not visible
		// int c = al.v3; // The field AccessLevel.v3 is not visible
		int d = al.v4;
		
		System.out.println("d = " + d);
		
		// al.m1();  // The method m1() from the type AccessLevel is not visible
		// al.m2();  // The method m2() from the type AccessLevel is not visible
		// al.m3(); // The method m3() from the type AccessLevel is not visible
		al.m4();
		
		// al.v2 = 20;
		// al.v3 = 30;
		al.v4 = 40;
		
		al.m4();
		
		
	}
}
