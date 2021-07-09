import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class socclient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String ip="localhost";
		int port=9999;
		Socket s = new Socket(ip, port);
		String str="Data_client";
		OutputStreamWriter os=new OutputStreamWriter(s.getOutputStream());
		PrintWriter out= new PrintWriter(os);
		out.println(str);
		os.flush();
		BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str1=br.readLine();
		
		System.out.println("C: Data from Server"+str1);
	}

}
