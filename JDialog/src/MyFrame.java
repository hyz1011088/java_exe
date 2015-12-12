import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyJDialog extends JDialog { // ŽŽœšÐÂÀàŒÌ³ÐJDialogÀà

	private static final long serialVersionUID = 1L;

	public MyJDialog(MyFrame frame) {
		// ÊµÀý»¯Ò»žöJDialogÀà¶ÔÏó£¬Öž¶š¶Ô»°¿òµÄžžŽ°Ìå¡¢Ž°Ìå±êÌâºÍÀàÐÍ
		super(frame, "µÚÒ»žöJDialogŽ°Ìå", true);
		Container container = getContentPane(); // ŽŽœšÒ»žöÈÝÆ÷
		container.add(new JLabel("ÕâÊÇÒ»žö¶Ô»°¿ò")); // ÔÚÈÝÆ÷ÖÐÌíŒÓ±êÇ©
		setBounds(120, 120, 100, 100); // ÉèÖÃ¶Ô»°¿òŽ°ÌåŽóÐ¡
	}
}

public class MyFrame extends JFrame { // ŽŽœšÐÂÀà

	private static final long serialVersionUID = 1L;

	public static void main(String args[]) {
		new MyFrame(); // ÊµÀý»¯MyJDialogÀà¶ÔÏó
	}
	
	public MyFrame() {
		Container container = getContentPane(); // ŽŽœšÒ»žöÈÝÆ÷
		container.setLayout(null);
		JLabel jl = new JLabel("ÕâÊÇÒ»žöJFrameŽ°Ìå"); // ÔÚŽ°ÌåÖÐÉèÖÃ±êÇ©
		// œ«±êÇ©µÄÎÄ×ÖÖÃÓÚ±êÇ©ÖÐŒäÎ»ÖÃ
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("µ¯³ö¶Ô»°¿ò"); // ¶šÒåÒ»žö°ŽÅ¥
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener() { // Îª°ŽÅ¥ÌíŒÓÊó±êµ¥»÷ÊÂŒþ
					public void actionPerformed(ActionEvent e) {
						// Ê¹MyJDialogŽ°Ìå¿ÉŒû
						new MyJDialog(MyFrame.this).setVisible(true);
					}
				});
		container.add(bl); // œ«°ŽÅ¥ÌíŒÓµœÈÝÆ÷ÖÐ
		
		container.add(bl);
		container.setBackground(Color.white);
		setSize(200, 200);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}