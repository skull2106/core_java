import java.util.Scanner;
import java.math.*;
interface 	calc{
	double calcarea();
	double circumference();
}
class circle implements calc{
	double pi=3.14;
	double r;
	circle(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius-");
		r=sc.nextDouble();
	}
	public double calcarea() {
		return (pi*r*r);
	}
	public double circumference() {
		return(2*pi*r);
	}
}
class rec implements calc{
	double a;
	double b;
	rec()
	{
		System.out.println("Enter the Length-");
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		System.out.println("Enter the Breadth-");
		b=sc.nextDouble();
	}
	public double calcarea() {
		return (a*b);}
	public double circumference(){
		return (2*(a+b));
	}
}
class triangle implements calc{
	double a,b,c,s;
	triangle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first side of the triangle-");
		a=sc.nextDouble();
		System.out.println("Enter the second side of the triangle-");
		b=sc.nextDouble();
		System.out.println("Enter the third side of the trianle-");
		c=sc.nextDouble();
		s=(a+b+c)/2;
	}
	public double circumference()
	{
		return (a+b+c);
	}
	public double calcarea() {
		return(Math.sqrt(s*(s-a)+s*(s-b)+s*(s-c)));
	}
}
public class implement_function {
	public static void main(String args[])
	{
		circle c = new circle();
		System.out.println("For circle-");
		System.out.println("Area-"+c.calcarea()+" Perimeter-"+c.circumference());
		rec r = new rec();
		System.out.println("For Rectangle-");
		System.out.println("Area-"+r.calcarea()+" Perimeter-"+r.circumference());
		triangle t = new triangle();
		System.out.println("For triangle-");
		System.out.println("Area-"+t.calcarea()+" Perimeter-"+t.circumference());
	}
}
