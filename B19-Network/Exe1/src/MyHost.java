<<<<<<< HEAD
import java.net.*;

public class MyHost {
	public static void main(String args[]) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("localhost");// �޸�Ϊָ������������
			System.out.println("��������" + ip.getHostName());
			System.out.println("����IP��ַ��" + ip.getHostAddress());
			System.out.println("����IP��ַ��"
					+ InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
=======
import java.net.*;

public class MyHost {
	public static void main(String args[]) {
		InetAddress ip = null;
		
		try {
			ip = InetAddress.getByName("localhost");// �޸�Ϊָ������������
			System.out.println("��������" + ip.getHostName());
			System.out.println("����IP��ַ��" + ip.getHostAddress());
			System.out.println("����IP��ַ��"
					+ InetAddress.getLocalHost().getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
