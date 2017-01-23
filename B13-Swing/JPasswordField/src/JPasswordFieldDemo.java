<<<<<<< HEAD
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class JPasswordFieldDemo extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField passwordField;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JPasswordFieldDemo frame = new JPasswordFieldDemo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public JPasswordFieldDemo() {
        setTitle("密码框使用");// 设置窗体的标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体退出时操作
        setBounds(100, 100, 250, 100);// 设置窗体位置和大小
        contentPane = new JPanel();// 创建内容面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置面板的边框
        contentPane.setLayout(new BorderLayout(0, 0));// 设置内容面板为边界布局
        setContentPane(contentPane);// 应用内容面板
        JLabel label = new JLabel("密码：");// 创建标签
        contentPane.add(label, BorderLayout.WEST);// 将标签增加到面板西部
        passwordField = new JPasswordField(10);// 创建密码框
        contentPane.add(passwordField, BorderLayout.CENTER);// 将密码框增加的面板中央
    }
}


=======
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class JPasswordFieldDemo extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPasswordField passwordField;
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JPasswordFieldDemo frame = new JPasswordFieldDemo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public JPasswordFieldDemo() {
        setTitle("密码框使用");// 设置窗体的标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 设置窗体退出时操作
        setBounds(100, 100, 250, 100);// 设置窗体位置和大小
        contentPane = new JPanel();// 创建内容面板
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));// 设置面板的边框
        contentPane.setLayout(new BorderLayout(0, 0));// 设置内容面板为边界布局
        setContentPane(contentPane);// 应用内容面板
        JLabel label = new JLabel("密码：");// 创建标签
        contentPane.add(label, BorderLayout.WEST);// 将标签增加到面板西部
        passwordField = new JPasswordField(10);// 创建密码框
        contentPane.add(passwordField, BorderLayout.CENTER);// 将密码框增加的面板中央
    }
}


>>>>>>> 08dd2a5121d3323eff426b22ec55739b59548ed6
