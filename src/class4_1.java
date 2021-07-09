import java.util.Scanner;
public class class4_1 {
public static void main(String [] args)
{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[]= new int[n];
	int pos[]= new int[n];
	int neg[]=new int [n];
	int j=0,k=0,z=0;
	for (int i = 0; i<n;i++)
	{
		arr[i]=sc.nextInt();
		if (arr[i]>0)
		{
			pos[j]=arr[i];
			j++;
		}
		else if (arr[i]<0)
		{
			neg[k]=arr[i];
			k++;
		}
		else if(arr[i]==0)
		{
			z++;
		}
	}
	System.out.print("POS- ");
	for (int i =0;i<j;i++)
	{
		System.out.print(pos[i]);
	}
	System.out.println("");
	System.out.print("NEG- ");
	for (int i =0;i<k;i++)
	{
		System.out.print(neg[i]);
	}
	System.out.println("");
	System.out.print("ZERO's- ");
	System.out.println(z);
}
}
