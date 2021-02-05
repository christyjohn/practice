package book1.ch06.classes_objects;

public class AccessLevelTest1 {
	public static void main(String[] args) {
		AccessLevel al = new AccessLevel();
		
		//int a = al.v1; //The field AccessLevel.v1 is not visible
		int b = al.v2;
		int c = al.v3;
		int d = al.v4;
		
		System.out.println("b = " + b + ", c = " + c + ", d = " + d);
		
		//al.m1(); //The method m1() from the type AccessLevel is not visible
		al.m2();
		al.m3();
		al.m4();
		
		al.v2 = 20;
		al.v3 = 30;
		al.v4 = 40;
		
		System.out.println("\nAfter modifying v2, v3 and v4");
		
		al.m2();
		al.m3();
		al.m4();
		
	}
}
