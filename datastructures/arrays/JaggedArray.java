public class JaggedArray
{
	public static void main(String[] args)
	{
		int i, j, k = 0;
		int jArr[][] = new int[4][];

		jArr[0] = new int[3];
		jArr[1] = new int[5];
		jArr[2] = new int[1];
		jArr[3] = new int[2];

		for(i = 0; i < jArr.length; i++)
		{
			for(j = 0; j < jArr[i].length; j++)
			{
				jArr[i][j] = k++;
			}
		}

		for(i = 0; i < jArr.length; i++)
		{
			for(j = 0; j < jArr[i].length; j++)
			{
				System.out.print(jArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}