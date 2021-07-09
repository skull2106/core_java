import static java.lang.Math.pow;
import java.util.Scanner;
public class shknum {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int ansr[] = new int [t];
		for (int i=0;i<t;i++)
		{
			int x=0,j;
			double N = sc.nextInt();
			for (j =0;j<1000;j++)
			{
				
				if (pow(2, j)>=N)
				{
					x = j-1;
					break;
				}
			}
			double key, key2;
			double ans[]=new double [t];
					int k;
			for (k=0;k<j;k++)
			{
				key = pow(2, x) + pow(2, k);
				if (key>=N)
				{
					key2 = (pow(2, x) + pow(2, k-1));
					if (k==x)
					{
						ans[i] =(long) N - key2;
						break;
					}
					
					if ((key-N)>(N-key2))
					{
						ans[i] = N - key2;
							break;
					}
					else if ((N-key2)>(key-N))
					{
						ans[i] = key - N;
						break;

					}
					else 
					{
						ans[i] = (N-key2);
						break;
					}
					
				}
			}
			ansr[i] = (int) ans[i];
		}
		for (int i =0;i<t;i++)
		{
			System.out.println(ansr[i]);
		}
	}

}
