package book1.ch07.objects_classes;

public class FinalizeTest {
	public static void main(String[] args) {
		for (int i = 0; i < 20000; i++) {
			new Finalize(i);
		}
	}
}
