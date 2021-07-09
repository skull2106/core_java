import java.util.Scanner;

public class cat_and_mouse {
	public static void main(String[] args)
	{
		int n;
		int a,b,c,d,e,i;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for (i=0;i<=n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			if (c>a)
			d=c-a;
			else 
				d=a-c;
			if (c>b)
				e=c-b;
			else e=b-c;
			
			if (d>e)
				System.out.println("Cat B");
			else if(d<e)
				System.out.println("Cat A");
			else if (d==e)
				System.out.println("Mouse C");
		}
	}

}
