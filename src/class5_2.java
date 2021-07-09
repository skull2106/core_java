public class class5_2 {
	public static void main(String args[])
	{
		char a[]= {'s','a','u','r','a','b','h',' ','d','a','d','h','i','c','h'};
		char b[] =new char[10];
		System.arraycopy(a, 8, b, 0, 7);
		System.out.println(a);
		System.out.println(b);
	}

}
