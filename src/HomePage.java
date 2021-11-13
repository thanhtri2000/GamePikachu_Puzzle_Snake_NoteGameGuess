import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import File.ReadFile;
import GamePikachu.MyMain;
import GamePuzzle.Puzzle;
import GameSnake.SnakeMain;
import jdk.dynalink.linker.support.Guards;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 888, 784);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HTTL GAMING");
		lblNewLabel.setBounds(350, 20, 217, 50);
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NotePuzzlee frame = new NotePuzzlee();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			}
		});
		btnNewButton.setBounds(59, 91, 328, 283);
		btnNewButton.setIcon(new ImageIcon("T:\\java\\Demo\\DoAnLogin\\57dc695c383af1aaf38798eaccceb4e5.jpg"));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NoteSnake frame = new NoteSnake();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
				
			}
		});
		btnNewButton_1.setBounds(491, 441, 310, 238);
		btnNewButton_1.setIcon(new ImageIcon("T:\\java\\Demo\\DoAnLogin\\1.png"));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go !!!");
		btnNewButton_2.setBounds(77, 384, 84, 21);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					new Puzzle();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Go !!!");
		btnNewButton_2_1.setBounds(510, 689, 84, 21);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    new SnakeMain();
			}
			
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Puzzle with Doremon");
		lblNewLabel_1.setBounds(182, 384, 216, 21);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Snake !!!");
		lblNewLabel_2.setBounds(604, 694, 107, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NotePokemon frame = new NotePokemon();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_3.setBounds(59, 441, 328, 238);
		btnNewButton_3.setIcon(new ImageIcon("T:\\java\\Demo\\DoAnLogin\\pikachu-08-169.jpg"));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_2_1_1 = new JButton("Go !!!");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyMain();
			}
		});
		btnNewButton_2_1_1.setBounds(92, 689, 84, 21);
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_2_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pokemon");
		lblNewLabel_2_1.setBounds(182, 694, 107, 13);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel_2_1);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							NoteGameGuess frame = new NoteGameGuess();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			}
		});
		btnNewButton_4.setBounds(479, 91, 328, 283);
		btnNewButton_4.setIcon(new ImageIcon("T:\\java\\DoAnNhom6\\unnamed.jpg"));
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2_2 = new JButton("Go !!!");
		btnNewButton_2_2.setBounds(510, 384, 84, 21);
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        new Guess();      
			}
		});
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(btnNewButton_2_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Guess The Number");
		lblNewLabel_1_1.setBounds(604, 384, 188, 21);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_5 = new JButton("Show Score");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ReadFile frame = new ReadFile();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
				
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_5.setBounds(682, 32, 122, 38);
		contentPane.add(btnNewButton_5);
	}
}
