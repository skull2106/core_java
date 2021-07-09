import java.util.Scanner;
public class class2_1 {
	private static void Relational(int a, int b){
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		if (a ==b)
			
		{
			System.out.println("a is equal to b");
		}
		if(a<b)
		{
			System.out.println("b is greater than a");
		}
		
	}
	private static void Conditional(int a , int b)
	{
		System.out.println((a>b?"a is greater":"b is greater"));
	}
	private static void Bitwise(int a , int b)
	{
		int c = a&b;
		System.out.println("Bitwise and is " + c);
	}
	public static void main(String []args)
	{
		Scanner sc  = new Scanner (System.in);
		System.out.println("Enter the two digits-");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Select which operator u want to use-");
		System.out.println("1. Conditional Operator");
		System.out.println("2.Relational Operator(greater than)");
		System.out.println("3.BitWise Operator");
		System.out.println("Chose ur option-");
		int c = sc.nextInt();
		switch(c)
		{
		case 1:
			Conditional(a,b);
			break;
		case 2:
			Relational(a,b);
			break;
		case 3:
			Bitwise(a,b);
			break;
		default:
			System.out.println("Wrong input try again");
		break;
		}
	}

}
