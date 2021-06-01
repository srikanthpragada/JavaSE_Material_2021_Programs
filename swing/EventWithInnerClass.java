package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class EventWithInnerClass extends JFrame {
	JButton b1;
	JLabel lbl;

	public EventWithInnerClass() {
		super("Event With Inner Class");
		lbl = new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);
		b1 = new JButton("Click Here");
		b1.addActionListener(new ActionEventHandler());

		Container c = getContentPane();
		c.add(lbl, BorderLayout.PAGE_START);
		c.add(b1, BorderLayout.PAGE_END);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300, 200);
	}

	// inner class
	class ActionEventHandler implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			lbl.setText(new Date().toString());
		}
	}

	public static void main(String args[]) {
		new EventWithInnerClass().setVisible(true);
	}
}