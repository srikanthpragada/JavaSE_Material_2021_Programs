package swing;

import java.awt.Font;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;

public class DigitalClock extends JFrame {
	JLabel l1;
	Timer t;

	public DigitalClock() {
		super("Clock");
		l1 = new JLabel(getTime());
		l1.setFont(new Font("Verdana", Font.BOLD, 30));
		l1.setHorizontalAlignment(JLabel.CENTER);
		t = new Timer(1000, e -> l1.setText(getTime()));
		t.start();
		getContentPane().add(l1);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	private String getTime() {
		LocalTime now = LocalTime.now();
		return now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
	}

	public static void main(String args[]) {
		DigitalClock clock = new DigitalClock();
		clock.setSize(300, 200);
		clock.setVisible(true);
	}
}