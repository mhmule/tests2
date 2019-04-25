package tests;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host;
		String host2;
		String host3;
		try {
			host = InetAddress.getLocalHost().getCanonicalHostName();
			System.out.println("host :" + host);
			host2 = InetAddress.getLocalHost().getHostName();
			System.out.println("host2 :" + host2);			
			host3 = InetAddress.getLocalHost().toString();
			System.out.println("host3 :" + host3);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
