import java.util.Scanner;
public class Sherlock_squares {
	public static void main(String[] args)
	{
		int n,i,a,count=0,b;
		float k;
		double sq;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			count=0;
			a=sc.nextInt();
			b=sc.nextInt();
			for(k=a;k<=b;k++)
			{
				sq= Math.sqrt(k);
				if (sq%1.0==0)
				{
					count++;
				}
			}
		System.out.println(count);	
		}
		
	}

}
