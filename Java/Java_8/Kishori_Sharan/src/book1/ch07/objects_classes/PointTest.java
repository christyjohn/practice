package book1.ch07.objects_classes;

public class PointTest {
	public static void main(String[] args) {
		Point pt = new Point(10, 12);
		String str1 = "Test " + pt;
		String str2 = "Test " + pt.toString();
		
		// str1 and str 2 will have the same content
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(str1);
		System.out.println(str2);
		
		// Set pt to null
		pt = null;
		String str3 = "Test " + pt;
		System.out.println(pt);
		System.out.println(str3);
		//System.out.println(pt.toString()); /* Will generate a runtime exception */
	}
}
