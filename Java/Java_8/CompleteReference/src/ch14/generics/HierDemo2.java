package ch14.generics;

// A non-generic class can be the superclass
// of a generic subclass.

// A non-generic class.
class NonGen {
	int num;
	
	NonGen(int i) {
		num = i;
	}
	
	int getNum() {
		return num;
	}
}

// A generic subclass.
class Gen3<T> extends NonGen {
	T ob;
	
	Gen3(T o, int i) {
		super(i);
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

public class HierDemo2 {
	public static void main(String[] args) {
		Gen3<String> w = new Gen3<>("Hello" , 47);
		
		System.out.println(w.getob() + " ");
		System.out.println(w.getNum());
	}
}
