package book1.ch07.objects_classes;

public class SmartPoint {
	private int x;
	private int y;
	
	public SmartPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/* Reimplement the equals() method */
	public boolean equals(Object otherObject) {
		// Are they same?
		if (this == otherObject) {
			return true;
		}
		
		// Is the otherObject a null reference?
		if (otherObject == null ) {
			return false;
		}
		
		// Do they belong to the same class?
		if (this.getClass() != otherObject.getClass()) {
			return false;
		}
		
		// Get the reference of otherObject in a SmartPoint variable
		SmartPoint otherPoint = (SmartPoint) otherObject;
		
		// Do they have the same x and y co-ordinates
		boolean isSamePoint = (this.x == otherPoint.x && this.y == otherPoint.y);
		
		return isSamePoint;
	}
	
	/* Reimplement hashCode() method of the Object class,
	which is a requirement when you reimplement equals() method */
	public int hashCode() {
		return (this.x + this.y);
	}
}
