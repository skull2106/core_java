import java.util.Scanner;
public class Find_digit {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,a[],b[],i,j,count=0,temp=0;
		n=sc.nextInt();
		a = new int[n];
		b = new int[15];
		for (i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for (i=0;i<n;i++)
		{
				count = 0;
				temp=a[i];
			for(j=0;j<15;j++)
			{
				b[j]=temp%10;
				temp=temp/10;
				if (b[j]==0)
					continue;
				if (a[i]%b[j]==0)
					count++;
				if (temp<=0)
					break;
				
			}
				
			System.out.println(count);
				
		}
		
	}

}
