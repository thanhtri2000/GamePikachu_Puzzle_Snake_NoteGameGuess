package GamePikachu;



import GamePikachu.MyFrame;
import GamePikachu.MyMain;
import GamePikachu.MyMain.MyTimeCount;


public class MyMain {
	MyFrame frame;

	public MyMain() {
		frame = new MyFrame();
		MyTimeCount timeCount = new MyTimeCount();
		timeCount.start();
		new Thread(frame).start();
	}
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
