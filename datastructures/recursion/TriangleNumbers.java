import java.util.Scanner;

public class TriangleNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number :");		
		int n = in.nextInt();
		System.out.println("Triangle number for" + n + " is : " + getTriangleNumber(n));
	}
	
	public static int getTriangleNumber(int n) {
		if(n == 1)
			return 1;
		else
			return(n + getTriangleNumber(n - 1));
	}
}
