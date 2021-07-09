import java.util.Scanner;
public class Beautiful_days_at_the_movies {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int i,j,k,n,a,b,r=0,c,count=0;
	i=sc.nextInt();
	j=sc.nextInt();
	k=sc.nextInt();
	for(n=i;n<=j;n++)
	{
		b=n;
		while(b>0)
		{
		a=b%10;
		b=b/10;
		r=r*10+a;
		}
		c=n-r;
		if (c%k==0)
		{
			count++;
		}
		r=0;
	}
	System.out.println(count);
}
}
