package TestOne;

import java.net.Inet4Address;
import java.net.InetAddress;

public class testIP {
	public static void test()
	{
		test1();
		testIP();
		testIPEqual();
	}
	
	private static void test1 () {
		try{
			InetAddress ind=Inet4Address.getLocalHost();
			System.out.println(ind);
		}
		catch(Exception e){
			System.out.println("没有找到主机地址");
		}
	}
	
	private static void testIP() {
		try{
			InetAddress ind=Inet4Address.getByName("192.168.1.100");
			System.out.println(ind.getHostName());
			
			InetAddress ind1=Inet4Address.getByName("www.sina.com");
			System.out.println(ind1.getHostAddress()+ind1);
		}
		catch(Exception e){
			System.out.println("没有找到主机地址");
		}
	}
	
	private static void testIPEqual () {
		try{
			InetAddress ind=Inet4Address.getByName("sohu.com");
			System.out.println(ind);
			
			InetAddress ind1=Inet4Address.getByName("www.sohu.com");
			System.out.println(ind1);
			if(ind==ind1)
			{	
				System.out.println("相等");
			}
		}
		catch(Exception e){
			System.out.println("没有找到主机地址");
		}
	}
}
