import java.awt.*;

import javax.swing.*;

public class Example1 extends JFrame {
	private static final long serialVersionUID = 1L;

// ¶šÒåÒ»žöÀàŒÌ³ÐJFrameÀà
	public void CreateJFrame(String title) { // ¶šÒåÒ»žöCreateJFrame()·œ·š
		JFrame jf = new JFrame(title); // ÊµÀý»¯Ò»žöJFrame¶ÔÏó
		Container container = jf.getContentPane(); // »ñÈ¡Ò»žöÈÝÆ÷
		JLabel jl = new JLabel("ÕâÊÇÒ»žöJFrameŽ°Ìå"); // ŽŽœšÒ»žöJLabel±êÇ©
		// Ê¹±êÇ©ÉÏµÄÎÄ×ÖŸÓÖÐ
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl); // œ«±êÇ©ÌíŒÓµœÈÝÆ÷ÖÐ
		container.setBackground(Color.white);//ÉèÖÃÈÝÆ÷µÄ±³Ÿ°ÑÕÉ«
		jf.setVisible(true); // Ê¹Ž°Ìå¿ÉÊÓ
		jf.setSize(200, 150); // ÉèÖÃŽ°ÌåŽóÐ¡
		// ÉèÖÃŽ°Ìå¹Ø±Õ·œÊœ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){//ÔÚÖ÷·œ·šÖÐµ÷ÓÃcreateJFrame()·œ·š
		new Example1().CreateJFrame("ŽŽœšÒ»žöJFrameŽ°Ìå");
	}
}