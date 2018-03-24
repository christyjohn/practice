import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows of the matrix (odd number below 20.)");
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		int num = 1;
		
		int[][] matrix = new int[len][len];
		
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				matrix[i][j] = 0;
			}
		}
		
		/*
		* Logic for calculating the  contents of magic square
		*/
		
		int left = 0;
		int right = len / 2;
		matrix[left][right] = num++;
		--left;
		++right;
		
		for(int i = 0; i < (len * len); i++) {
			//System.out.println("1: left, right, num : " + left +", " + right + ", " + num);
			if(left < 0) {
				left = len - 1;
				
				if(right == len) {
					left = 1;
					right = len - 1;
				}
					
			} else if(right == len) {
				right = 0;
			}	
			
			if(matrix[left][right] != 0){
				//2, 0 change
				if(left < len) {
					left += 2;
					--right;					
				}
				if(left < len) {
					matrix[left][right] = num++;
					--left;
					++right;
				} else {
					left -= 2;
				    ++right;
				}
			} else {
				matrix[left][right] = num++;
				--left;
				++right;
			} 
		}
		
		/*
		* Printing the magic square and magic number
		*/
		int sum = 0;
		for(int i = 0; i < len; i++) {
			sum += matrix[0][i];
			System.out.print("+----");
		}
		System.out.println("+");
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print("| " );
				System.out.format("%02d" , matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println("|");
			for(int j = 0; j < len; j++) {
				System.out.print("+----");
			}
			System.out.println("+");
		}
		
		System.out.println("\nThe magic number  = " + sum);
	}
}
