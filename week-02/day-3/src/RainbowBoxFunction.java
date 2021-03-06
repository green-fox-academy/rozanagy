import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
  static void fillSquare(Graphics graphics, int size, Color colors) {
    graphics.setColor(colors);
    graphics.fillRect(0, 0, size, size);
  }

  public static void mainDraw(Graphics graphics) {
    int size = WIDTH;

    Color colors = new Color(250, 0, 0);
    fillSquare(graphics, size, colors);
    for (int i = WIDTH; i >= 0; i--) {
      fillSquare(graphics, size - i * 2, colors);

    }
  }


  // Create a square drawing function that takes 3 parameters:
  // The square size, the fill color, graphics
  // and draws a square of that size and color to the center of the canvas.
  // Create a loop that fills the canvas with rainbow colored squares.


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