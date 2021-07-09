import java.util.Scanner;
class employee
{
	int empid;
	String empname,desg;
	double basic, hra,da,pf,gross, netpay;
	Scanner read = new Scanner(System.in);
	void get_details()
	{
		System.out.println("Enter employee id:");
		empid=read.nextInt();
		System.out.println("Enter employee name:");
		read.nextLine();
		empname=read.nextLine();
		System.out.println("Enter basicpay-");
		basic=read.nextDouble();
	}
		void calc_pay()
		{
			gross=basic+hra+da;
			netpay= gross-pf;
		}
		void display()
		{
			System.out.println("\n"+desg+"details:"+"\nEmployee ID"+empid+"\nEmployee name:"+empname+"\nhra"+hra+"\nda"+da+"\npf"+pf+"netpay"+netpay);
		}
}
class manager extends employee
{void manager()
	{
	desg="Manager";
	hra=0.1*basic;
	da=0.05*basic;
	pf=0.07*basic;
	}
}
class supervisor extends employee
{
	void supervisor()
	{
		desg="Supervisor";
		hra=0.07*basic;
		da=0.03*basic;
		pf=0.06*basic;
	}
}
class labour extends employee
{
	void labour()
	{
		desg="Labour";
		hra=0.05*basic;
		da=0.07*basic;
		pf=0.04*basic;
	}
}
public class hierchal_inheritance
{
	public static void main(String args[])
	{
		manager m =new manager();
		m.get_details();
		m.manager();
		m.calc_pay();
		m.display();
		supervisor s = new supervisor();
		s.get_details();
		s.supervisor();
		s.calc_pay();
		s.display();
		labour l = new labour();
		l.get_details();
		l.labour();
		l.calc_pay();
		l.display();
	}
}