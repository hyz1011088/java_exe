<<<<<<< HEAD
public class ThreadTest extends Thread { // ָ����̳�Thread��
	private int count = 10;
	
	public void run() { // ��дrun()����
		while (true) {
			System.out.print(count+" "); // ��ӡcount����
			if (--count == 0) { // ʹcount�����Լ������Լ�Ϊ0ʱ���˳�ѭ��
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new ThreadTest().start();
	}
}
=======
public class ThreadTest extends Thread { // ָ����̳�Thread��
	private int count = 10;
	
	public void run() { // ��дrun()����
		while (true) {
			System.out.print(count+" "); // ��ӡcount����
			if (--count == 0) { // ʹcount�����Լ������Լ�Ϊ0ʱ���˳�ѭ��
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		new ThreadTest().start();
	}
}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
