package efre;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class elient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		Socket a=new Socket(InetAddress.getByName("192.168.10.248"), 9000);
		OutputStream b=a.getOutputStream();
		InputStream c=a.getInputStream();
		System.out.println("WRITE:");
		Scanner sc=new Scanner(System.in);
		String data;
		while(true){
			data=sc.next();
			b.write(data.getBytes());
			b.flush();
			if(data.equals("exit")){
				break;
			}
			byte[]ff=new byte[1024];
			int len=c.read(ff);
			String mm=new String(ff,0,len);
			System.out.println(mm);
			
		}
		b.close();
		c.close();
		a.close();
		
		
	}

}
