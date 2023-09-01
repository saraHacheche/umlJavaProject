package sarapackage;
import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
// SARA HACHECHE 
public class Rony3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] headers = {"Number", "Square", "Cube"};
        Object[][] data = new Object[11][3];
        
        for (int i = 0; i <= 10; i++) {
            data[i][0] = i;
            data[i][1] = i * i;
            data[i][2] = i * i * i;
        }
        JTable table=new JTable(data, headers);
        table.setShowGrid(false);
        table.setShowHorizontalLines(false);
        table.setShowVerticalLines(false);
        table.setIntercellSpacing(new Dimension(0, 0));
        JTableHeader header = table.getTableHeader();
        header.setBorder(null);
        
        JOptionPane.showMessageDialog(null, new JScrollPane(table), "Message", JOptionPane.INFORMATION_MESSAGE);        


	}

}
