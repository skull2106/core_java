import java.util.Scanner;
public class Save_the_prisoner {
	public static void main(String[] args)
	{
		int k,m,n,s,d,i;
		Scanner sc = new Scanner(System.in);
		k=sc.nextInt();
		for (i=1;i<=k;i++)
		{
			n=sc.nextInt();
			m=sc.nextInt();
			s=sc.nextInt();
			for (int j=1;j<m;j++)
			{
				s++;
				if (s>n)
				{
					s=0;
				}
			}
			System.out.println(s);
		}
	}

}
