package swing;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class SimpleFrame extends JFrame {
	public SimpleFrame() {
		super("Date & Time"); // title
		Container c = getContentPane();
		JLabel lbl = new JLabel();
		// center message horizontally
		lbl.setHorizontalAlignment(JLabel.CENTER);
		lbl.setText(new Date().toString());
		c.add(lbl);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		SimpleFrame f = new SimpleFrame();
		f.setSize(300, 200);
		f.setVisible(true);
	}
}