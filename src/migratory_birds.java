import java.util.Scanner;

public class migratory_birds {
	public static void main(String[] args)
	{
		int i,n,big=0;
		Scanner sc = new Scanner (System.in);
		n=sc.nextInt();
		int arr[]= new int[n];
		int freq[]= new int [6];
		for (int j=0;j<5;j++)
		{
			freq[j]=0;
		}
		for (i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			for (int j = 0;j<5;j++)
			{
				if ((j+1)==arr[i])
				{
					freq[j]++;
				}
				
			}
		}
		for(int j=0;j<5;j++)
		{
			if (big<=freq[j])
				big=freq[j];
		}
		for (i=0;i<5;i++)
		{
			if(freq[i]==big)
				break;
		}
		System.out.println(i+1);
	
	}

}
