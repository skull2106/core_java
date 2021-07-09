import java.util.Scanner;

public class THe_hurdle_race {
public static void main(String[] args){
	int n,k,i,ans,big=0;
	
	int[] arr= new int[100];
	Scanner sc = new Scanner(System.in);
	n= sc.nextInt();
	k= sc.nextInt();
	for (i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		if (arr[i]>big)
			big=arr[i];
	}
	ans=big-k;
	if (ans>0)
		System.out.println(ans);
	else
	{
		ans=0;
		System.out.println(ans);
	}
			
	}
}
