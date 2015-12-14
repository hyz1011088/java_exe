import java.awt.*;
import java.net.*;

import javax.swing.*;

public class MyImageIcon extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyImageIcon() {
		Container container = getContentPane();
		// ŽŽœšÒ»žö±êÇ©
		JLabel jl = new JLabel("ÕâÊÇÒ»žöJFrameŽ°Ìå", JLabel.CENTER);
		// »ñÈ¡ÍŒÆ¬ËùÔÚµÄURL
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		System.out.print(url);
		Icon icon = new ImageIcon(url);
		//Icon icon = new ImageIcon("imageButton.jpg"); // ÊµÀý»¯Icon¶ÔÏó
		jl.setIcon(icon); // Îª±êÇ©ÉèÖÃÍŒÆ¬
		// ÉèÖÃÎÄ×Ö·ÅÖÃÔÚ±êÇ©ÖÐŒä
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true); // ÉèÖÃ±êÇ©Îª²»ÍžÃ÷×ŽÌ¬
		container.add(jl); // œ«±êÇ©ÌíŒÓµœÈÝÆ÷ÖÐ
		setSize(250, 100); // ÉèÖÃŽ°ÌåŽóÐ¡
		setVisible(true); // Ê¹Ž°Ìå¿ÉŒû
		// ÉèÖÃŽ°Ìå¹Ø±ÕÄ£Êœ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	

	public static void main(String args[]) {
		new MyImageIcon(); // ÊµÀý»¯MyImageIcon¶ÔÏó
	}
}