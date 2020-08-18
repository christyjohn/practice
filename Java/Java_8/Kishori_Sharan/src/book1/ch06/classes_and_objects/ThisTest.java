package book1.ch06.classes_and_objects;

public class ThisTest {
	int varA = 555;
	int varB = varA;		// Assign value of varA to varB
	int varC = this.varA;	// Assign value of varA to varC
	

	static int varU = 555;
	static int varV = varU;
	
	//Cannot use this in a static context
	// non-static variable this cannot be referenced from a static context
	//static int varW = this.varU;
	
	// correct usage
	static int varW = varU;
	
	// You can also use like this
	static int varX = ThisTest.varU;
	
	// the following is incorrect - compile-time error
	// non-static variable varA cannot be referenced from a static context
	//varX = varA;
	
	// whatever existing in the class context can be used in the instance context
	// but not vice-versa
}
