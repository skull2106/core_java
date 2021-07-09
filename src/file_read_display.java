import java.io.*;
import java.util.Scanner;
public class file_read_display {
	public static void main(String []args) throws IOException
	{
		Scanner sc= new Scanner(System.in);
		String a;
		int i;
		FileInputStream fil;
		try
		{
			try {
				a=sc.nextLine();
				fil = new FileInputStream(a);
			}
			catch(FileNotFoundException e)
			{
				System.out.println("File not found");
				return;
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Usage:ShowFile File");
			return;
		}
		do
		{
			i=fil.read();
			if(i!=1)
			{
				System.out.print((char) i);
			}
		}
			while (i!=-1);
			
		fil.close();
	}

}
