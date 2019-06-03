import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

  static void LineDrawingFunction(Graphics graphics, int x, int y) {
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
  }

  public static void mainDraw(Graphics graphics) {
    int x = 40;
    int y = 30;
    LineDrawingFunction(graphics, x, y);
    for (int i = 0; i < 3; i++) {
      LineDrawingFunction(graphics, x * i, y * i);
    }


    // Create a line drawing function that takes 3 parameters:
    // The x and y coordinates of the line's starting point and the graphics
    // and draws a line from that point to the center of the canvas.
    // Draw 3 lines with that function. Use loop for that.


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

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
