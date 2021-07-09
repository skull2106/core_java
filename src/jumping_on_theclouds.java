import java.util.Scanner;
public class jumping_on_theclouds {
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	int n,k,arr[],e=100;
	n=sc.nextInt();
	k=sc.nextInt();
	arr= new int [n];
	for (int i=0; i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for (int i=0;i<n;i++)
	{
		e=e-1;
		if (arr[i]==1)
			e=e-2;
		if(i>=n)
		{
			break;
		}
		i=i+k;
	}
	System.out.println(e);
}
}
