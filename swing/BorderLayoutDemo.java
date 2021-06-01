package swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends javax.swing.JFrame {
	public BorderLayoutDemo() {
		super("BorderLayout Demo");
		Container c = getContentPane();
		c.add(new JButton("Top Button"), BorderLayout.PAGE_START);
		c.add(new JButton("Bottom Button"), BorderLayout.PAGE_END);
		c.add(new JButton("Left Button"), BorderLayout.LINE_START);
		c.add(new JButton("Right Button"), BorderLayout.LINE_END);
		// place multiple components at the center using JPanel
		JPanel p = new JPanel(); // default FlowLayout
		p.add(new JLabel("Label"));
		p.add(new JTextField(20));
		c.add(p); // placed at center
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String args[]) {
		new BorderLayoutDemo();
	}
}