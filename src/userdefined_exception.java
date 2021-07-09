
class exception extends Exception
{
	public exception(String exp)
	{
		super(exp);
	}
}

public class userdefined_exception  {
	public static void main(String args[]) throws exception
	{
		int i;
		i=-2;
		if(i<=0)
		{
			exception e = new exception("this is a userdefined exception");
			throw e;
		}
		System.out.println("something");
	}

}
