import java.util.Scanner;
public class he_anagram {
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	int t;
	t = sc.nextInt();
	for (int k=0;k<t;k++)
	{
	String s1 = sc.next();
	String s2 = sc.next();
	int common=0;
	for (int i=0;i<s1.length();i++)
	{
		for (int j=0;j<s2.length();j++)
		{
			if (s1.charAt(i)==s2.charAt(j))
					{
						common++;
					}
		}
	}
	int output = 0;
	output = s1.length()+s2.length()-(2*common);
	System.out.println(output);
	}
}
}
