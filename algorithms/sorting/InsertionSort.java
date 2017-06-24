import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort
{
	public static void main(String[] args)
	{
		// Get the numbers to be sorted.
		List<Integer> randArray = new ArrayList<>();
		System.out.println("Enter the numbers to be sorted\n" +
			"Enter Q to finish entering.");
		Scanner scanner = new Scanner(System.in);
		String token = scanner.nextLine();

		while(!token.equalsIgnoreCase("q"))
		{
			randArray.add(Integer.parseInt(token));
			token = scanner.nextLine();
		}

		// Implementing Insertion Sort
		for(int j = 1; j < randArray.size(); j++)
		{
			int key = randArray.get(j);
			int i = j - 1;

			while(i >= 0 && randArray.get(i) > key)
			{
				randArray.set(i + 1, randArray.get(i));
				--i;
			}

			randArray.set(i + 1, key);
		}

		// Printing the sorted list.
		for(int i : randArray)
		{
			System.out.print(i + " ");
		}
	}
}