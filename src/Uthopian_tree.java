import java.util.Scanner;
public class Uthopian_tree {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n,k=1,i,c,j,p;
	n=sc.nextInt();
	for (i=0;i<n;i++) {
		c=sc.nextInt();
		p=c-(c/2);
		for (j=1;j<=p;j++)
		{
			k=k*2;
		}
		for (j=0;j<c/2;j++)
		{
			k=k+1;
		}
		System.out.println(k);
	}
	
}
}
