package book1.ch07.objects_classes;

public class Book {
	private String title;
	private String author;
	private int pageCount;
	private boolean hardCover;
	private double price;
	
	/* Must implement the equals() method too. */
	
	public int hasCode() {
		int hash = 37;
		int code = 0;
		
		// use title
		code = (title == null ? 0 : title.hashCode());
		hash = hash * 59 + code;
		
		// use author
		code = (author == null ? 0 : author.hashCode());
		hash = hash * 59 + code;
		
		// use pageCount
		code = pageCount;
		hash = hash * 59 + code;
		
		// use hardCover
		code = (hardCover ? 1 : 0);
		hash = hash * 59 + code;
		
		// use price
		long priceBits = Double.doubleToLongBits(price);
		code = (int)(priceBits ^ (priceBits >>> 32));
		hash = hash * 59 + code;
		
		return hash;
	}
}
