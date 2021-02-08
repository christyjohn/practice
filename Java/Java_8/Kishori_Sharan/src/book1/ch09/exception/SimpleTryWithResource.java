package book1.ch09.exception;

public class SimpleTryWithResource {
	public static void main(String[] args) {
		// Create and use a resource of MyResource type.
		// Its close() method will be called automatically */
		try (MyResource mr = new MyResource(2, true)) {
			mr.use();
			mr.use();
			mr.use();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			
			// Display messages of supressed exceptions
			System.out.println("Suppressed exception messages are...");
			for (Throwable t : e.getSuppressed()) {
				System.out.println(t.getMessage());
			}
		}
	}
}
