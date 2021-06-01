package swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.*;

public class FileViewer extends JFrame {
	private JTextField tfFilename;
	private JTextArea taContents; // Multi-line textbox
	private JButton btnBrowse, btnOpen;

	public FileViewer() {
		super("File Viewer 1.0");
		tfFilename = new JTextField(20);
		taContents = new JTextArea(); // Multi-line textbox
		taContents.setEditable(false); // readonly

		JScrollPane sp = new JScrollPane(taContents, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		btnOpen = new JButton("Open");
		btnOpen.addActionListener(e -> openFile());

		btnBrowse = new JButton("...");
		btnBrowse.addActionListener(e -> {
			JFileChooser jfc = new JFileChooser();
			int status = jfc.showOpenDialog(this);
			if (status == JFileChooser.APPROVE_OPTION) {
				tfFilename.setText(jfc.getSelectedFile().getAbsolutePath());
				openFile();
			}
		} // Lambda block
		);
		// Arrange layout
		JPanel p1 = new JPanel();
		p1.add(new JLabel("Enter Filename :"));
		p1.add(tfFilename);
		p1.add(btnBrowse);
		p1.add(btnOpen);

		Container c = getContentPane();
		c.add(p1, BorderLayout.PAGE_START);
		c.add(sp); // center
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		FileViewer f = new FileViewer();
		f.setSize(500, 400);
		f.setVisible(true);
	}

	private void openFile() {
		try {
			Path path = Path.of(tfFilename.getText());
			// Java 12 readString(Path) of Files
			taContents.setText(Files.readString(path));
		} catch (Exception ex) {
			taContents.setText("Error ->" + ex.getMessage());
		}
	}
}