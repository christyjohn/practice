package book1.ch06.classes_objects;

public class FieldAccessTest {
	public static void main(String[] args) {
		Human jack = new Human();
		
		Human.count++;
		
		jack.name = "Jack parker";
		jack.gender = "Male";
		
		String jackName = jack.name;
		String jackGender = jack.gender;
		long population = Human.count;
		
		System.out.println("Name: " + jackName);
		System.out.println("Gender: " + jackGender);
		System.out.println("Population: " + population);
		
		jack.name = "Jackie Parker";
		
		String changedName = jack.name;
		System.out.println("Changed Name: " + changedName);
	}
}
