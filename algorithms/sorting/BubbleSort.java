import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort
{
	public static void main(String[] args)
	{
		List<Integer> randArray = new ArrayList();
		System.out.println("Enter the numbers to be sorted\n" +
			"Enter Q to finish entering.");
		Scanner scanner = new Scanner(System.in);
		String token = scanner.nextLine();

		while(!token.equalsIgnoreCase("q"))
		{
			randArray.add(Integer.parseInt(token));
			token = scanner.nextLine();
		}

		// to do 
		// implement the rest
	}
}