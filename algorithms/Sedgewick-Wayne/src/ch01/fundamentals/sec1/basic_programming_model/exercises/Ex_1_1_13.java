package ch01.fundamentals.sec1.basic_programming_model.exercises;

public class Ex_1_1_13 {

	public static void main(String[] args) {
		int[][] a = { {1, 2}, {3, 4}, {5, 6} };
		int[][] b = new int[2][3];
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				b[i][j] = a[j][i];
			}
		}
		
		System.out.println("--------Original matrix --------");
		// printing original matrix
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + ", ");
			}
			System.out.println();
		}
		
		System.out.println("--------Trasposed matrix --------");
		
		// printing transposed mmatrix
		for(int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length;j ++) {
				System.out.print(b[i][j] + ", ");
			}
			System.out.println();
		}
		
	}

}
