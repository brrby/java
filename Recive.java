package i0p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Recive {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		DatagramSocket a=new DatagramSocket(60000,InetAddress.getLocalHost());
		byte[]b=new byte[1024];
		DatagramPacket c=new DatagramPacket(b,1024);
		System.out.println("waitting   >>>>>>>>>>>>>");
		for(int i=0;i<10;i++){
			a.receive(c);
			System.out.println(new String(c.getData()));
		}
		
	}

}
