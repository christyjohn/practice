package book1.ch08.wrapper_classes;

public class OverloadedBoxing {
	public static void main(String[] args) {
		test(101);
		test(new Integer(101));
	}
	
//	public static void test(Integer iObject) {
//		System.out.println("Integer=" + iObject);
//	}
	
//	public static void test(int iValue) {
//		System.out.println("int=" + iValue);
//	}
	
//	public static void test(long iValue) {
//		System.out.println("long=" +iValue);
//	}
	
	public static void test(Long lObject) {
		System.out.println("Long=" + lObject);
	}
	
	public static void test(Object obj) {
		System.out.println("Object=" + obj);
	}
}
