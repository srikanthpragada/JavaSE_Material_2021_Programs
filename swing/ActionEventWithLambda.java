package swing;

import java.awt.*;
import java.util.Date;
import javax.swing.*;

public class ActionEventWithLambda extends JFrame {
	JButton b1;
	JLabel lbl;

	public ActionEventWithLambda() {
		super("ActionEvent with Lambda");
		lbl = new JLabel();
		lbl.setHorizontalAlignment(JLabel.CENTER);
		b1 = new JButton("Show Date and Time");
		b1.addActionListener(e -> lbl.setText(new Date().toString()));
		Container c = getContentPane();
		c.add(lbl, BorderLayout.PAGE_START);
		c.add(b1, BorderLayout.PAGE_END);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(300, 200);
	}

	public static void main(String args[]) {
		new ActionEventWithLambda().setVisible(true);
	}
}