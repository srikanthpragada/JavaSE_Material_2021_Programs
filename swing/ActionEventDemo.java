package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class ActionEventDemo extends JFrame implements ActionListener {
	JButton b1;
	JLabel lbl;

	public ActionEventDemo() {
		super("ActionEvent Demo");
		b1 = new JButton("Click Here");
		b1.addActionListener(this);

		lbl = new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);
		Container c = getContentPane();
		c.add(lbl, BorderLayout.PAGE_START);
		c.add(b1, BorderLayout.PAGE_END);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300, 200);
	}

	public void actionPerformed(ActionEvent evt) {
		lbl.setText(new Date().toString());
	}

	public static void main(String args[]) {
		new ActionEventDemo().setVisible(true);
	}
}