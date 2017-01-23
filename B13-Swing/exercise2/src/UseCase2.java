import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class UseCase2 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] contents={"select1","select2","select3","select4","select5"};
	private JComboBox jc=new JComboBox();
	private JButton jb=new JButton("add");
	int count=0;
	public UseCase2() {
		setSize(200, 100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jc);
		cp.add(jb);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if(count<contents.length){
					jc.addItem(contents[count++]);
				}
			}
		});
		
	}
	public static void main(String[] args) {
		new UseCase2();

	}

}