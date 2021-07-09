import java.io.*;
import java.util.Scanner;
public class file_copy {
public static void main(String []args) throws IOException
{
	Scanner sc = new Scanner(System.in);
	int i;
	FileInputStream fin;
	FileOutputStream fout;
	try
	{
		try {
			String s = sc.nextLine();
			fin = new FileInputStream(s);
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}
		try {
			String o=sc.nextLine();
			fout= new FileOutputStream(o);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			return;
		}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
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
		}
		while(i!=-1);
	}
	catch(IOException e)
	{
		System.out.println("File Error");
	}
	fin.close();
	fout.close();
}
}
