import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay {
    public static void mainDraw(Graphics graphics){
        int a = 20;
        graphics.setColor(Color.green);
        graphics.drawLine(a, 0, WIDTH, a);
        for(int i = 0; i <= 25; i++) {
            graphics.drawLine(a * i, 0, WIDTH, a * i);
        }
        graphics.setColor(Color.magenta);
        graphics.drawLine(0, a, a, HEIGHT);
        for(int i= 0; i <= 25; i++) {
            graphics.drawLine(0, a * i, a * i, HEIGHT);
        }
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