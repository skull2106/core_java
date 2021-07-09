import java.util.Scanner;
public class class3_2 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [30];
		int i;
		for (i=0;i<30;i++)
		{
			arr[i]=n%10;
			n=arr[i]/10;
			if (n==0)
				break;
		}
		int arm=0;
		for (int j=0;j<i;j++)
		{
			arm=arm+(arr[j]*arr[j]*arr[j]);
		}
		if (arm==n)
			System.out.println("This is a armstrong no.");
		else 
			System.out.println("Not a Armstrong no.");
}

}
