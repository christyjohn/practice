package innerclasses.telusko;

public class InnerClassTest {
	public static void main(String[] args) {
		A obj = new A();
		System.out.println("A.rollno: " + obj.rollno);
		System.out.println("A.sname: " + obj.sname);
		
		A.B b = obj.new B();
		b.show();
		
		A.C obj2 = new A.C();
		obj2.show();
	}
}

class A {
	
	int rollno = 13;
	String sname = "Christy";
	static String school = "JNV";
	
	class B {
		int a = 17;
		
		public void show() {
			System.out.println("Inside B");
			System.out.println("Student: " + sname + ", rollno: " + rollno);
			System.out.println("a: " + a);
		}		
	}
	
	static class C {
		int a = 34;
		
		public void show() {
			System.out.println("Inside static class C");
			System.out.println("School: " + school);
			System.out.println("a: " + a);
		}
	}
}
