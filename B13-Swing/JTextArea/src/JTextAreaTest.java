<<<<<<< HEAD

import java.awt.*;

import javax.swing.*;

public class JTextAreaTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextAreaTest(){
		setSize(200,100);
		setTitle("�����Զ����е��ı���");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		JTextArea jt=new JTextArea("�ı���",6,6);
		jt.setLineWrap(true);//�����Զ�����
		cp.add(jt);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
=======

import java.awt.*;

import javax.swing.*;

public class JTextAreaTest extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JTextAreaTest(){
		setSize(200,100);
		setTitle("�����Զ����е��ı���");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		JTextArea jt=new JTextArea("�ı���",6,6);
		jt.setLineWrap(true);//�����Զ�����
		cp.add(jt);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTextAreaTest();
	}
}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
