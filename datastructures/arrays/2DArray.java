public class 2DArray
{
	public static void main(String[] args)
	{
		int i, j, k = 0;
		int twoD[][] = new int[4][5];

		for(i = 0; i < 4; i++)
		{
			for(j = 0; j < 5; j++)
			{
				twoD[i][j] = k;
				k++;
			}
		}

		for(i = 0; i < 4; i++)
		{
			for(j = 0; j < 5; j++)
			{
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
	}
}