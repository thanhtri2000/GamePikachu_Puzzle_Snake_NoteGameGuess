import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhom;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static HomePage f = new HomePage();
	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 51, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to HTTL Gaming");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.PINK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(35, 10, 370, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(35, 104, 85, 31);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(35, 179, 128, 31);
		contentPane.add(lblNewLabel_1_1);
		
		txtNhom = new JTextField();
		txtNhom.setText("nhom6");
		txtNhom.setBounds(183, 104, 222, 31);
		contentPane.add(txtNhom);
		txtNhom.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setBounds(183, 179, 222, 31);
		contentPane.add(passwordField);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Container frame = btnExit.getParent();
		            do 
		                frame = frame.getParent(); 
		            while (!(frame instanceof JFrame));                                      
		            ((JFrame) frame).dispose();		
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExit.setBounds(278, 312, 127, 31);
		contentPane.add(btnExit);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname= txtNhom.getText();
				String pass=passwordField.getText();
				if(uname.equals("nhom6")&& pass.equals("123")   )
				{
				
				JOptionPane.showMessageDialog(contentPane, "Logged in successfully!!!");
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Ivalid username or passwoed");
					
					
				}
				
				Login.f.setVisible(true);// Goi form homepage xuat hien
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(278, 254, 127, 31);
		contentPane.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\images.png"));
		lblNewLabel_2.setBounds(35, 249, 233, 164);
		contentPane.add(lblNewLabel_2);
	}
}
