import java.util.Scanner;
public class Angry_proffesor {
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int n,a,b=0,arr[],count=0;
		int i,j;
		n=sc.nextInt();
		for (i=0;i<n;i++)
		{
			count =0;
			a=sc.nextInt();
			b=sc.nextInt();
			arr = new int [a];
			for (j=0;j<a;j++)
			{
				arr[j]=sc.nextInt();
				if (arr[j]<=0)
					
				{
					count++;
				}
			}
			System.out.println(count);
			if (count>=b)
			{
				System.out.println("NO");
			}
			else System.out.println("YES");
		}
		
	}

}
