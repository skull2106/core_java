import java.util.Scanner;
public class climbing_leaderboard {	
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a,b;
		b= scanner.nextInt();
		int[] c = new int [b];
		for (int i=0; i<b;i++)
		{
			c[i] = scanner.nextInt();
		}
		int low =0;
		quicksort(c,low, b-1);
		for (int i=0;i<b;i++)
		{
			System.out.println(c[i]);
		}
		a = scanner.nextInt();
		int ans[] = new int[a];
		int d[] = new int[a];
		for (int i=0; i<a;i++)
		{
			d[i] = scanner.nextInt();
			for (int j = 0; j<b;j++)
			{
				if (d[i]>=c[j])
				{
				ans[i]=j+1;
				break;
				}
			}
		}
		for (int i=0;i<a;i++)
		{
			System.out.println(b-ans[i]+1);
		}
	}
	private static void quicksort(int c[],int low, int high) {
		if (high>low)
		{
		int index = partition(c,low, high);
		quicksort(c,low, index -1);
		quicksort(c, index+1, high);
		
		}
	}
	private static int partition(int c[],int low, int high) {
		int pivot = c[high];
		int index = low;
		int temp;
		for (int i =low; i<high;i++)
		{
			if (pivot>=c[i])
			{
				 temp = c[i];
				 c[i]=c[index];
				 c[index]=temp;
				 index++;
			}
		}
		temp=c[high];
		c[high]=c[index];
		c[index]=temp;
		return index;
	}
}