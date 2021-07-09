import java.util.Scanner;
public class Second_maximum {
	public static void main(String [] args)
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int arr[] = new int[n];
		int max1=0,max2=0,i;
		for (i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if (arr[i]>max2&&arr[i]>max1)
				max2=max1;
				max1=arr[i];
		}
		System.out.println(max1);
		System.out.println(max2);
	}

} 