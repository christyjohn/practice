package book2.ch04.generics;

public class GenericsRuntmeClassTest {
	public static void main(String[] args) {
		Wrapper<Object> objectWrapper = new Wrapper<>(new Object());
		WrapperUtil.printDetails(objectWrapper);
		
		Wrapper<String> stringWrapper = new Wrapper<>("Hello");
		// WrapperUtil.printDetails(stringWrapper);  // The method 
					// printDetails(Wrapper<Object>) in the type WrapperUtil is 
					// not applicable for the arguments (Wrapper<String>)
		Wrapper<?> unknownWrapper = stringWrapper;
		
		Wrapper<Integer> intWrapper = new Wrapper<Integer> (new Integer(10));
		Wrapper<? extends Number> numberWrapper = intWrapper;
		// numberWrapper.set(new Integer(1220));
		// numberWrapper.set(new Double(12.20));
		/*
		 * The method set(capture#1-of ? extends Number) in the type 
		 * Wrapper<capture#1-of ? extends Number> is not applicable for 
		 * the arguments (Integer)/(Double)
		*/
		
		
		WrapperUtil.copy(stringWrapper, objectWrapper);
	}
}
