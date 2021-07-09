public class class3_3 {
	public static void main(String args[])
	{
		int i, j;
		
		for (j=1;j<5;j++)
		{
			a1:
			for (i=1;i<=5;i++)
			{
				System.out.print(i);
				if (i>j)
					break a1;
			}
			System.out.println("");
		}
	}
}
