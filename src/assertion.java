import java.util.Scanner;
import java.io.*;
public class assertion {
public static void main(String []args) throws IOException
{
	Scanner sc= new Scanner(System.in);
	int i;
	FileInputStream fin;
	FileOutputStream fout;
	try {
		try {
		String s = sc.nextLine();
		assert s!=null :"Something should have been entered";
		fin = new FileInputStream(s);
	
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not Found");
			return;
		}
		try {
			String a = sc.nextLine();
			assert a!=null : "Something should have been entered";
			fout= new FileOutputStream(a);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not Found");
			return;
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("File Error");
		return;
	}
	try
	{
	do
	{
		i = fin.read();
		if(i!=-1)
		{
			fout.write(i);
		}
	}while(i!=-1);
	}
	catch(IOException e)
	{
		System.out.println("Error in the file copying.");
	}
}
}
