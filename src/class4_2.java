import java.util.Scanner;
public class class4_2 {
public static void main(String []args)
{
	int i,j,k,n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of Square Matrix-");
	n = sc.nextInt();
	int a[][]= new int [n][n];
	int b[][]= new int [n][n];
	int c[][]= new int [n][n];
	System.out.println("For 1st Matrix- ");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			System.out.println("Enter value at " + (i+1) +" row " + (j+1) +" column");
			a[i][j]=sc.nextInt();
		}
	}
	System.out.println("For 2nd Matrix- ");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			System.out.println("Enter value at " + (i+1) +" row " + (j+1) +" column");
			b[i][j]=sc.nextInt();
		}
	}
	System.out.println("After Multiplication");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			for (k=0;k<n;k++)
			c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
		}
	}
	System.out.println("For final Matrix -");
	for (i=0;i<n;i++)
	{
		for (j=0;j<n;j++)
		{
			System.out.print(" "+c[i][j]);
		}
		System.out.println("");
	}
	
}
}
