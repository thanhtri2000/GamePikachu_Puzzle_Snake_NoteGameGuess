package File;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ReadFile extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ReadFile() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 668, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 134, 634, 201);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Game Score");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filePath = "T:\\java\\DoAnNhom6\\table.txt";
		        File file = new File(filePath);
		        
		        try {
		            BufferedReader br = new BufferedReader(new FileReader(file));
		            // get the first line
		            // get the columns name from the first line
		            // set columns name to the jtable model
		            String firstLine = br.readLine().trim();
		            String[] columnsName = firstLine.split(",");
		            DefaultTableModel model = (DefaultTableModel)table.getModel();
		            model.setColumnIdentifiers(columnsName);
		            
		            // get lines from txt file
		            Object[] tableLines = br.lines().toArray();
		            
		            // extratct data from lines
		            // set data to jtable model
		            for(int i = 0; i < tableLines.length; i++)
		            {
		                String line = tableLines[i].toString().trim();
		                String[] dataRow = line.split("/");
		                model.addRow(dataRow);
		            }
		            
		            
		        } catch (Exception ex) {
		            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
		        }
				
				
			}
		});
		btnNewButton.setBounds(227, 42, 207, 37);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\background.jpg"));
		lblNewLabel.setBounds(10, 10, 634, 114);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img3.PNG"));
		lblNewLabel_1.setBounds(10, 345, 61, 53);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img1.PNG"));
		lblNewLabel_1_1.setBounds(98, 345, 67, 53);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img2.PNG"));
		lblNewLabel_1_1_1.setBounds(207, 345, 67, 53);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img5.PNG"));
		lblNewLabel_1_1_1_1.setBounds(302, 345, 67, 53);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("");
		lblNewLabel_1_1_1_2.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img4.PNG"));
		lblNewLabel_1_1_1_2.setBounds(402, 345, 67, 53);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("");
		lblNewLabel_1_1_1_2_1.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img7.PNG"));
		lblNewLabel_1_1_1_2_1.setBounds(494, 345, 67, 53);
		contentPane.add(lblNewLabel_1_1_1_2_1);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("");
		lblNewLabel_1_1_1_2_2.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\img6.PNG"));
		lblNewLabel_1_1_1_2_2.setBounds(577, 345, 67, 53);
		contentPane.add(lblNewLabel_1_1_1_2_2);
	}
}
