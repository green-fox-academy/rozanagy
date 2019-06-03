import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {
  static void fillRectangle(Graphics graphics, int x, int y, int size) {
    graphics.fillRect(x, y, size, size * 2);
  }

  public static void mainDraw(Graphics graphics) {
    int x = 30;
    int y = 30;
    int size = 20;
    fillRectangle(graphics, x, y, size);
    for (int i = 0; i <= 4; i++) {
      fillRectangle(graphics, (x * i), (y * i), size * i);
      Color myColor = new Color((25 * i), (10 * i), (5 * i));
      graphics.setColor(myColor);
    }
    // draw four different size and color rectangles.
    // avoid code duplication.
  }

  // Don't touch the code below
  static int WIDTH = 640;
  static int HEIGHT = 640;

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
