<<<<<<< HEAD
import java.io.*;

import javax.swing.*;

public class Student {
	public static void main(String[] temp) {
		byte b[] = new byte[2];
		try{
			FileInputStream fis = new FileInputStream("word.txt");
			ProgressMonitorInputStream in = 
				new ProgressMonitorInputStream(null,"reading",fis);
		   while(in.read(b)!=-1){
			   String s = new String(b);
			   System.out.print(s);
			   Thread.sleep(100);
		   }
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
=======
import java.io.*;

import javax.swing.*;

public class Student {
	public static void main(String[] temp) {
		byte b[] = new byte[2];
		try{
			FileInputStream fis = new FileInputStream("word.txt");
			ProgressMonitorInputStream in = 
				new ProgressMonitorInputStream(null,"reading",fis);
		   while(in.read(b)!=-1){
			   String s = new String(b);
			   System.out.print(s);
			   Thread.sleep(100);
		   }
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
