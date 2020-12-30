package book1.ch06.classes_objects;

public class ThisTest2 {
	static int varU = 555;
	static int varV = varU;
	// static int varW = this.varU;		// Cannot use this in a static context
}
