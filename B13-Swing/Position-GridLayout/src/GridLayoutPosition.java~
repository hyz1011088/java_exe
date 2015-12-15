import java.awt.*;

import javax.swing.*;

public class GridLayoutPosition extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GridLayoutPosition() {
		Container c = getContentPane();
		// ÉèÖÃÈÝÆ÷Ê¹ÓÃÍøžñ²ŒŸÖ¹ÜÀíÆ÷£¬ÉèÖÃ7ÐÐ3ÁÐµÄÍøžñ
		setLayout(new GridLayout(7, 3, 5, 5));
		for (int i = 0; i < 20; i++) {
			c.add(new JButton("button" + i)); // Ñ­»·ÌíŒÓ°ŽÅ¥
		}
		setSize(300, 300);
		setTitle("ÕâÊÇÒ»žöÊ¹ÓÃÍøžñ²ŒŸÖ¹ÜÀíÆ÷µÄŽ°Ìå");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridLayoutPosition();
	}
}