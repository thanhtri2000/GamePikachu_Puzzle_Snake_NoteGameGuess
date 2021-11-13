package GamePuzzle;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.Random;
import java.util.Vector;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
public class Puzzle extends JFrame implements ActionListener {
	 JTextField t1; int count=0;
	private JPanel centerPanel;
    private JButton button;
    private JLabel label;
    private Image source;
    private Vector<Image> image = new Vector<Image>();// vector la khoi tao 1 danh sach mang, mac dinh la 10
    private boolean [] check = new boolean[12];
    int[][] pos;
    int width, height;
 
    public Puzzle() {
        pos = new int[][] {
                            {0, 1, 2}, 
                            {3, 4, 5}, 
                            {6, 7, 8}, 
                            {9, 10, 11}
                          };
        centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 4, 0, 0));

        ImageIcon sid = new ImageIcon("doraemon.jpg");
        source = sid.getImage();

        width = sid.getIconWidth();
        height = sid.getIconHeight();
        
        
      
        t1=new JTextField(10);
        t1.setSize(40,20);
        t1.setLocation(10,10); 
        
        add(Box.createRigidArea(new Dimension(0, 5)), BorderLayout.NORTH);    
        add(centerPanel, BorderLayout.CENTER);


        for ( int i = 0; i < 4; i++) {
            for ( int j = 0; j < 3; j++) {
                  Image imgTemp = createImage(new FilteredImageSource(source.getSource(),
                        new CropImageFilter(j*width/3, i*height/4, (width/3)+1, height/4)));
                  image.add(imgTemp);
            }
        }
        
        for(int i = 0; i < 12; i++)
        {
        	check[i] = false;
        }
        
        for(int i = 0; i < 4; i++){
        	for( int j = 0; j < 3; j++){
                if ( j == 2 && i == 3) {
                    label = new JLabel("");
                    centerPanel.add(label);
                } 
                else
                {
                    button = new JButton();
                    button.addActionListener(this);
                    Random rnd = new Random();
                    int index = Math.abs(rnd.nextInt()%11);
                    while(check[index])
                    	index = Math.abs(rnd.nextInt()%11);
                    button.setIcon(new ImageIcon(image.get(index)));
                    check[index] = true;
                    centerPanel.add(button);
                }
        	}
        }

        setSize(600, 550);
        setTitle("Puzzle_Nhom6");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
        int bestScore=100;
        count=count+1;
        if(count<bestScore)
        {    
            bestScore=count;
            t1.setText(bestScore+"");
        }
        else
            t1.setText(""+bestScore);
        	t1.setEditable(false);
        JButton button = (JButton) e.getSource();
        Dimension size = button.getSize();
        int labelX = label.getX();
        int labelY = label.getY();
        int buttonX = button.getX();
        int buttonY = button.getY();
        int buttonPosX = buttonX / size.width;
        int buttonPosY = buttonY / size.height;
        int buttonIndex = pos[buttonPosY][buttonPosX];
        if (labelX == buttonX && (labelY - buttonY) == size.height ) {
             int labelIndex = buttonIndex + 3;
             centerPanel.remove(buttonIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
        }
        if (labelX == buttonX && (labelY - buttonY) == -size.height ) {
             int labelIndex = buttonIndex - 3;
             centerPanel.remove(labelIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.validate();
        }
        if (labelY == buttonY && (labelX - buttonX) == size.width ) {
             int labelIndex = buttonIndex + 1;
             centerPanel.remove(buttonIndex);
             centerPanel.add(label, buttonIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
        }
        if (labelY == buttonY && (labelX - buttonX) == -size.width ) {
             int labelIndex = buttonIndex - 1;
             centerPanel.remove(buttonIndex);
             centerPanel.add(label, labelIndex);
             centerPanel.add(button,labelIndex);
             centerPanel.validate();
        }
    }
  
    
}