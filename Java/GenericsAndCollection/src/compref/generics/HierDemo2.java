package compref.generics;

class NonGen {
	int num;
	
	NonGen(int i) {
		num = i;
	}
	
	int getnum() {
		return num;
	}
}

class Gen5<T> extends NonGen {
	T ob;
	
	Gen5(T o, int i) {
		super(i);
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

public class HierDemo2 {
	public static void main(String[] args) {
		Gen5<String> w = new Gen5<String>("Hello", 47);
		
		System.out.print(w.getob() + " ");
		System.out.println(w.getnum());
	}
}
