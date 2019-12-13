import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		double[] a = { 23.0, 45.34, 78.09, 16.9, 9.0, 56.0, 32.45, 445.3, 234.98, 11.08, 7.00 };
		
		// print the array
		System.out.print("Array a ==> ");
		System.out.println(Arrays.toString(a));
		
		// find the max value in the array
		double max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		
		System.out.println("The max value in the array is : " + max);
		
		// compute the average of the array values
		int n = a.length;
		double sum = 0.0;
		for (int i = 0; i < n; i++)
			sum += a[i];
		double average = sum / n;
		
		System.out.println("The average of the values in the array is : " + average);
		
		// copy to another array
		double[] b = new double[n];
		for (int i = 0; i < n; i++)
			b[i] = a[i];
		
		System.out.print("Array b ==> ");
		System.out.println(Arrays.toString(b));
		
		// reverse the elements within an array
		System.out.print("Array a ==> ");
		System.out.println(Arrays.toString(a));
		
		for (int i = 0; i < n/2; i++) {
			double temp = a[i];
			a[i] = a[n - 1 - i];
			a[n - i - 1] = temp;
		}
		
		System.out.print("Array a after reversing ==> ");
		System.out.println(Arrays.toString(a));
		
		// matrix-matrix multiplication - dot product
		int[][] p = { 
			{1, 2, 3}, 
			{4, 5, 6} 
		};	
		int[][] q ={ 
			{7,8}, 
			{9,10}, 
			{11,12} 
		};
		
		int newRowLen = q[0].length;
		int newColLen = p.length;
		
		int[][] r = new int[newRowLen][newColLen];
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < q[0].length; j++) {
				for (int k = 0; k < p[0].length; k++) 
					r[i][j] += p[i][k]*q[k][j];
			}
		}
		
		System.out.print("Dot product of p and q ==> ");
		System.out.println(Arrays.deepToString(r));
	}
}
