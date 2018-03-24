import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort
{
	private static List<Integer> randArray = new ArrayList();
	public static void main(String[] args)
	{
		System.out.println("Enter the numbers to be sorted\n" +
			"Enter Q to finish entering.");
		Scanner scanner = new Scanner(System.in);
		String token = scanner.nextLine();

		while(!token.equalsIgnoreCase("q"))
		{
			randArray.add(Integer.parseInt(token));
			token = scanner.nextLine();
		}

		// Implementing bubble sort
		int in, out;
		
		for(out = randArray.size() - 1; out > 1; out--) {
			for(in = 0; in < out; in++) {
				if(randArray.get(in) > randArray.get(in +1)) {
					swap(in, in+1);
				}
			}
		}
	
		// Printing the sorted list.
		for(int i : randArray)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
	}
		
	public static void swap(int one, int two) {
		int temp = randArray.get(one);
		randArray.set(one, randArray.get(two));
		randArray.set(two, temp);
	}
}
