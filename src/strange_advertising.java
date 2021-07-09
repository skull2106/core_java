import java.util.Scanner;

public class strange_advertising {
	public static void main (String[] args)
	{
		int d,i,n,sum=0,j;
		j=5;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			d=j/2;
			sum=sum+d;
			j=d*3;
		}
		System.out.println(sum);
	}

}