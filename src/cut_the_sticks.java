import java.util.Scanner;
public class cut_the_sticks {
	public static void main(String args[])
	{
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		int i, min=500, count = 0;
		for (i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
            min=arr[i];
			if (min>=arr[i])
			{
				min=arr[i];
			}
		}
		do
		{
        count =0;
		for (i=0;i<n;i++)
		{
			arr[i]=arr[i]-min;
			if (arr[i]>0)
			{
				count++;
			}
			
		}
		if (count>0)
		System.out.println(count);
		}while (count!=0);		
	}
}
