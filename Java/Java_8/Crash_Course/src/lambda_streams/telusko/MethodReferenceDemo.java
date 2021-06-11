package lambda_streams.telusko;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList( 1, 2, 3,4, 5, 6);
		
		values.forEach(System.out::println);
		System.out.println();
		values.forEach(i -> doubleit(i));
		System.out.println();
		// another way to call doubleit
		values.forEach(MethodReferenceDemo::doubleit);
	}
	
	public static void doubleit(int i) {
		System.out.println(i * 2);
	}
}
