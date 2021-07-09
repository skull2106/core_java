import java.util.Scanner;
import java.math.BigInteger;
public class Ectrs_long_factorials {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int n;
	BigInteger fact=1;
	int i;
	n=sc.nextInt();
	for (i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
		
}
}
