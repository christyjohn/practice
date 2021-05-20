package book1.ch06.classes_objects;

import java.util.Arrays;

public class MultipleMainMethods {
	public static void main(String[] args) {
		System.out.println("The main main()");
		
		String[] arr ={"1","2","abc"};		
		MultipleMainMethods.main(arr, "Christy");
		
		MultipleMainMethods mmm = new MultipleMainMethods();
		mmm.main();
	}
	
	public static void main(String[] args, String a) {
		System.out.println("main(String[] args, String a ->" + 
				Arrays.toString(args) + ", " + a);
	}
	
	public int main() {
		System.out.println("main()");
		return 0;
	}
}
