package sarapackage;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.*;

// SARA HACHECHE 
public class Rony4 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("JAVA Application");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		String[] columnNames = { "Number", "Square", "Cube" };
		Object[][] data = new Object[11][3];

		for (int i = 0; i <= 10; i++) {
			data[i][0] = i;
			data[i][1] = i * i;
			data[i][2] = i * i * i;
		}

		JTable table = new JTable(data, columnNames);
		JScrollPane tableContainer = new JScrollPane(table);
		panel.add(tableContainer, BorderLayout.CENTER);
		frame.getContentPane().add(panel);
		frame.setSize(new Dimension(400, 400));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);

	}

}
