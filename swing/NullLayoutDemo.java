package swing;

import javax.swing.*;
import java.awt.*;

public class NullLayoutDemo extends JFrame {
	public NullLayoutDemo() {
		super("NullLayout Demo");
		Container c = getContentPane();
		c.setLayout(null);
		JButton b1 = new JButton("First");
		JButton b2 = new JButton("Second");
		JButton b3 = new JButton("Third");
		b1.setBounds(10, 20, 100, 20);
		c.add(b1);
		b2.setBounds(120, 30, 100, 20);
		c.add(b2);
		b3.setBounds(230, 40, 100, 20);
		c.add(b3);
		setSize(350, 150);
	}

	public static void main(String args[]) {
		new NullLayoutDemo().setVisible(true);
	}
}