package book1.ch11.strings;

public class StringInSwitch {
	public static void main(String[] args) {
		String status = "on";
		
		switch(status) {
			case "on":
				System.out.println("Turn on"); // Will execute this
				break;
			case "off":
				System.out.println("Turn off");
				break;
			default:
				System.out.println("Unknown command");
				break;
		}
	}
}	
