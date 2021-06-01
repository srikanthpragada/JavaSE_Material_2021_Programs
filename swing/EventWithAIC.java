package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class EventWithAIC extends JFrame {
	JButton b1;
	JLabel lbl;

	public EventWithAIC() {
		super("Event with Anonymous Inner Class");
		lbl = new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);
		b1 = new JButton("Click Here");

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				lbl.setText(new Date().toString());
			}
		});
		Container c = getContentPane();
		c.add(lbl, BorderLayout.PAGE_START);
		c.add(b1, BorderLayout.PAGE_END);

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300, 200);
	}

	public static void main(String args[]) {
		new EventWithAIC().setVisible(true);
	}
}