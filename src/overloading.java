import java.util.Scanner;
class Box
{
	int ar(int l)
	{
		int area = l*l;
		return area;
	}
	int ar(int l, int b)
	{
		int area = l*b;
		return area;
	}
}
public class overloading {
	public static void main(String args[])
	{
		Box n1 = new Box();
		System.out.println("Area if passing one parameter = "+ n1.ar(5));
		System.out.println("Area if passing multiple parameter - "+ n1.ar(2, 3));
	}
}
