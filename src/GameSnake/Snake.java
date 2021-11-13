package GameSnake;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Snake extends JPanel implements ActionListener {

    private final int WIDTH = 380;
    private final int HEIGHT = 420;
    private final int DOT_SIZE = 10;
    private final int ALL_DOTS = 900;
    private final int RAND_POS = 29;
    private int DELAY = 70;
	int bodyParts=10;


    private int x[] = new int[ALL_DOTS];
    private int y[] = new int[ALL_DOTS];

    private int dots;
    private int apple_x;
    private int apple_y;

    private boolean left = false;
    private boolean right = true;
    private boolean up = false;
    private boolean down = false;
    private boolean inGame = true;

    private Timer timer;
    private Image ball;
    private Image apple;
    private Image head;


    public Snake() {
        addKeyListener(new TAdapter());
        setBackground(Color.black);

        ImageIcon iid = new ImageIcon(this.getClass().getResource("apple.png"));
        ball = iid.getImage();

        ImageIcon iia = new ImageIcon(this.getClass().getResource("dot.png"));
        apple = iia.getImage();

        ImageIcon iih = new ImageIcon(this.getClass().getResource("head.png"));
        head = iih.getImage();

        setFocusable(true);
        initGame();
    }


    public void initGame() {

        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z*10;
            y[z] = 50;
        }

        locateApple();

        timer = new Timer(DELAY, this);
        timer.start();
    }


    public void paint(Graphics g) {
        super.paint(g);

        if (inGame) {

            g.drawImage(apple, apple_x, apple_y, this);

            for (int z = 0; z < dots; z++) {
                if (z == 0)
                    g.drawImage(head, x[z], y[z], this);
                else g.drawImage(ball, x[z], y[z], this);
      

            }

            Toolkit.getDefaultToolkit().sync();
            g.dispose();

        } else {
            gameOver(g);
        }
    }


    public void gameOver(Graphics g) {
        String msg = "Game Over";
        Font small = new Font("Helvetica", Font.BOLD, 34);
        FontMetrics metr = this.getFontMetrics(small);

        g.setColor(Color.white);
        g.setFont(small);
        g.drawString(msg, (WIDTH - metr.stringWidth(msg)) / 2,HEIGHT / 2);
        
        g.setColor(Color.red);
        g.setFont(new Font("INK Free",Font.BOLD,30));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Score" + dots, (WIDTH - metrics1.stringWidth("Score: "+dots))/2,g.getFont().getSize());
    }


    public void checkApple() {

        if ((x[0] == apple_x) && (y[0] == apple_y)) {
            dots++;
            locateApple();
        }
    }


    public void move() {

        for (int z = dots; z > 0; z--) {
            x[z] = x[(z - 1)];
            y[z] = y[(z - 1)];
        }

        if (left) {
            x[0] -= DOT_SIZE;
        }

        if (right) {
            x[0] += DOT_SIZE;
        }

        if (up) {
            y[0] -= DOT_SIZE;
        }

        if (down) {
            y[0] += DOT_SIZE;
        }
    }


    public void checkCollision() {

          for (int z = dots; z > 0; z--) {

              if ((z > 4) && (x[0] == x[z]) && (y[0] == y[z])) {
                  inGame = false;
              }
          }

        if (y[0] > HEIGHT) {
            inGame = false;
        }

        if (y[0] < 0) {
            inGame = false;
        }

        if (x[0] > WIDTH) {
            inGame = false;
        }

        if (x[0] < 0) {
            inGame = false;
        }
    }

    public void locateApple() {
        int r = (int) (Math.random() * RAND_POS);
        apple_x = ((r * DOT_SIZE));
        r = (int) (Math.random() * RAND_POS);
        apple_y = ((r * DOT_SIZE));
    }

    public void actionPerformed(ActionEvent e) {

        if (inGame) {
            checkApple();
            checkCollision();
            move();
        }

        repaint();
    }


    private class TAdapter extends KeyAdapter {

        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (!right)) {
                left = true;
                up = false;
                down = false;
            }

            if ((key == KeyEvent.VK_RIGHT) && (!left)) {
                right = true;
                up = false;
                down = false;
            }

            if ((key == KeyEvent.VK_UP) && (!down)) {
                up = true;
                right = false;
                left = false;
            }

            if ((key == KeyEvent.VK_DOWN) && (!up)) {
                down = true;
                right = false;
                left = false;
            }
        }
    }
}