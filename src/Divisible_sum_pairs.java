import java.util.Scanner;
public class Divisible_sum_pairs {
		public static void main(String[] args){
			int n,k,i,j,temp,count=0;
			Scanner sc= new Scanner (System.in);
			n=sc.nextInt();
			k=sc.nextInt();
			int arr[]= new int [n];
			for (i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			for (i=0; i<n;i++)
			{
                for (j=0;j<n;j++)
                {
				temp=arr[i]+arr[j];
				if (temp%k==0)
					count++;
                }
			}
				System.out.println(count);
		}
	}

