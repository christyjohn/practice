package compref.generics;

class TwoGen<T, V> {
	T ob1;
	V ob2;
	
	public TwoGen(T o1, V o2) {
		ob1 = o1;
		ob2 = o2;
	}
	
	public void showTypes() {
		System.out.println("Type of T is " +
			ob1.getClass().getName());
		System.out.println("Type of V is " +
			ob2.getClass().getName());
	}
	
	T getOb1() {
		return ob1;
	}
	
	V getOb2() {
		return ob2;
	}
}

public class TwoGenDemo {
	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj =
				new TwoGen<>(88, "Generics");
		
		tgObj.showTypes();
		
		int v = tgObj.getOb1();
		System.out.println("value: " + v);
		
		String str = tgObj.getOb2();
		System.out.println("value: " + str);
	}
}
