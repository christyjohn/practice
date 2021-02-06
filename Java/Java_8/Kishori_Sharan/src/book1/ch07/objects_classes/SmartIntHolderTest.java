package book1.ch07.objects_classes;

public class SmartIntHolderTest {
	public static void main(String[] args) {
		// Create an object of the SmartIntHolder class
		SmartIntHolder intHolder = new SmartIntHolder(234);
		String intHolderStr = intHolder.toString();
		System.out.println(intHolderStr);
		
		// Change the value in SmartIntHolder object
		intHolder.setValue(8967);
		intHolderStr = intHolder.toString();
		System.out.println(intHolderStr);
	}
}
