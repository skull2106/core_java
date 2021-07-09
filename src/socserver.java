import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class socserver {
	public static void main(String args[]) throws Exception
	{
		System.out.println("Server starting...");
		ServerSocket ss=new ServerSocket(9999);
		System.out.println("Server waiting for client request..");
		Socket s=ss.accept();
		System.out.println("Client Connected");
		
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str=br.readLine();
		System.out.println("Client Data:"+str);
		String str1="data_client";
		OutputStreamWriter os= new OutputStreamWriter(s.getOutputStream());
		PrintWriter out =new PrintWriter(os);
		out.println(str1);
		out.flush();
		System.out.println("Data sent from server");
		
		
	}
}
