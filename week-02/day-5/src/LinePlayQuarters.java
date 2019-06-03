import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int a = 5;
    int count = 20;
    graphics.setColor(Color.green);
    graphics.drawLine(a, 0, WIDTH / 4, a);
    for (int i = 0; i <= count; i++) {
      graphics.drawLine(a * i, 0, WIDTH / 4, a * i);
    }
    graphics.setColor(Color.magenta);
    graphics.drawLine(0, a, a, HEIGHT / 4);
    for (int i = 0; i <= count; i++) {
      graphics.drawLine(0, a * i, a * i, HEIGHT / 4);
    }
  }

  // Don't touch the code below
  static int WIDTH = 400;
  static int HEIGHT = 400;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}