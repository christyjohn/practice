package ch03.fundamental_data_structures;

public class InsertionSort {

	public static void main(String[] args) {
		char[] toSort = {'c', 'x', 'r', 's', 'f', 'a', 'n', 'b'};
		
		System.out.print("Before sorting the array is: ");
		
		System.out.print("[ ");
		for (char c : toSort)
			System.out.print(c +" ");

		System.out.print("]");
		System.out.println();
		
		insertionSort(toSort);
		
		System.out.print("The sorted array is: ");
		
		System.out.print("[ ");
		for (char c : toSort)
			System.out.print(c +" ");

		System.out.print("]");
		System.out.println();
	}
	
	public static void insertionSort(char[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) {
			char curr = data[k];
			int j = k;
			while (j > 0 && data[j-1] > curr) {
				data[j] = data[j - 1];
				j--;
			}
			data[j] = curr;
		}
	}

}
