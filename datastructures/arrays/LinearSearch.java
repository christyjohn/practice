public class LinearSearch
{
	public static void main(String[] args)
	{
		int[] numbers = {8, 23, 45, 1, 67, 8, 94, 34, 8};
		int key = 8;
		int i, count = 0;

		for(i = 0; i < numbers.length; i ++)
		{
			if(numbers[i] == key)
				count++;
		}

		if(count > 0)
		{
			int[] apps = new int[count];
			int j = 0;
			for(i = 0; i < numbers.length; i ++)
			{
				if(numbers[i] == key)
					apps[j++] = i;
			}

			System.out.print("The key is found at position: ");

			for(int pos : apps)
				System.out.print(pos + " ");

			System.out.println();
		}
		else
		{
			System.out.println("The key is not present in the array.");
		}
	}
}