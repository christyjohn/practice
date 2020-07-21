package ch01.fundamentals.sec1.basic_programming_model.exercises;

public class Ex_1_1_15 {

	public static void main(String[] args) {
		int[] a = {1, 2, 2, 4, 4, 4, 4, 8, 8, 8, 8, 8, 8, 8, 8, 8, 1};
		int m = 8;
		
		int[] histogram = getHistogram(a, m);
		
		System.out.print("{ " + histogram[0]);
		for (int i = 1; i < m; i++)
			System.out.print(", " + histogram[i]);
		System.out.println(" }");

	}
	
	private static int[] getHistogram(int[] a, int m) {
		int[] histogram = new int[m];
		
		for (int i = 0; i < m; i++) {
			int occurs = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[j] == i + 1)
					occurs++;
			}
			histogram[i] = occurs;
		}
		
		return histogram;
	}

}
