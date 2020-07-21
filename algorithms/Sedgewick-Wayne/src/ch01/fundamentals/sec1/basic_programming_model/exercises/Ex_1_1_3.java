package ch01.fundamentals.sec1.basic_programming_model.exercises;

public class Ex_1_1_3 {

	public static void main(String[] args) {
		if((Integer.parseInt(args[0]) == Integer.parseInt(args[1]))
				&& (Integer.parseInt(args[0]) == Integer.parseInt(args[2])))
			System.out.println("They are equal");
		else
			System.out.println("They are different");
	}

}
