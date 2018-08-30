public class BinarySearch 
{
	public static void main(String[] args)
	{
		int[] numbers = {23, 34, 67, 78, 79, 80, 92, 95, 97, 100};
		int key = 34;

		binSearch(numbers,key);
	}	

	static void binSearch(int[] arr, int key)
	{
		int low = 0;
		int high = arr.length - 1;
		int mid;

		while(low <= high) 
		{
			mid = low + high / 2;

			if(key == arr[mid]){
				System.out.println("The key found at position " + mid);
				break;
			}
			else if(key > arr[mid])
				low = mid + 1;
			else if(key < arr[mid])
				high = mid - 1;
			else
				System.out.println("The key is not present in the array.");
		}
	}
}
