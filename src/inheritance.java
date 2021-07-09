class shape
{
	int l=10;
	int b=5;
}
class area extends shape {
	int ar()
	{
		int area = l*b;
		return area;
	}
}
public class inheritance {
	public static void main(String []args) {
	area obj1 = new area();
	System.out.println("Area of the given shape is "+ obj1.ar());
}
}
