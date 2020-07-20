package ch01.fundamentals.sec1.basic_programming_model;

public class ArrayOpeartions {

	public static void main(String[] args) {
		
		double[] a = { 3.5, 6.1, 1.3, 4.3, 7.0, 9.2, 4.1, 6.1, 5.5};
		int n = a.length;
		System.out.print("The array : ");
		printArray(a);
		
		// Find the maximum of array values
		double max = a[0];
		for (int i =1; i < n; i ++)
			if (a[i] > max)
				max = a[i];
		
		System.out.println("The max element in array is: " + max);
		
		// Compute the average of the array values
		double sum = 0.0;
		for (int i = 0; i < n; i ++)
			sum += a[i];
		double average = sum / n;

		System.out.println("The average of th elements in the array is: " 
				+ average);
		
		// Copy the elements to another array
		double[] b = new double[n];
		for (int i = 0; i < n; i ++)
			b[i] = a[i];
		
		System.out.print("The elements in array b is: ");
		printArray(b);
		
		// reverse the elements of the array
		for (int i = 0; i < n/2; i ++) {
			double temp = a[i];
			a[i] = a[n-1-i];
			a[n-1-i] = temp;
		}
		
		System.out.print("The array after reversing: ");
		printArray(a);
		
		// matrix-matrix multiplication
		double[][] d = { {2.2, 3.3}, {4.4, 5.5} };
		double[][] e = { {6.6, 7.7}, {8.8, 9.9} };
		n = e.length;
				
		double[][] c = new double[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
			{ // Compute dot product of row i and column j.
				for (int k = 0; k < n; k++)
					c[i][j] += d[i][k] * e[k][j];
			}
		
		System.out.println("Matric multiplication result");
		print2dAraay(c);
			
	}

	public static void  printArray(double[] a) {
		System.out.print("{ " + a[0]);
		for (int i = 1; i < a.length; i ++)
			System.out.print(", " + a[i]);
		System.out.println(" }");
	}
	
	public static void print2dAraay(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) 
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
}
