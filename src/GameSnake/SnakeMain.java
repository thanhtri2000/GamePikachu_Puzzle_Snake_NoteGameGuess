package GameSnake;
import javax.swing.JFrame;

import GamePikachu.MyFrame;

public class SnakeMain extends JFrame {
	MyFrame frame;

    public SnakeMain() {

        add(new Snake());

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(420, 340);
        setLocationRelativeTo(null);
        setTitle("Snake Nhom6");

        setResizable(false);
        setVisible(true);
        class MyTimeCount extends Thread {

    		public void run() {
    			while (true) {
    				try {
    					Thread.sleep(1000);
    				} catch (InterruptedException e) {
    					e.printStackTrace();
    				}
    				frame.setTime(frame.getTime() - 1);
    				if (frame.getTime() == 0) {
    					frame.showDialogNewGame(
    							"Full time\nDo you want play again?", "Lose");
    				}
    			}
    		}
    	}
    }


}