package ch01.fundamentals.sec1.basic_programming_model.exercises;

public class Ex_1_1_11 {

	public static void main(String[] args) {
		boolean[][] boolArr = { { true, false}, {false, true }, 
				{ false, false }, {true, true} };
		
		for (int i = 0; i < boolArr.length; i++) {
			for (int j = 0; j < boolArr[i].length; j++) {
				if (boolArr[i][j] == true)
					System.out.print("[" + i + "][" + j + "]" + "*" + ", ");
				else

					System.out.print("[" + i + "][" + j + "]" + " " + ", ");
			}
			System.out.println();
		}
	}
}
