package circle1;

import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class MidpointCircleAlgorithm extends JPanel {

    private int radius;

    public MidpointCircleAlgorithm(int radius) {
        this.radius = radius;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawCircle(g, getWidth() / 2, getHeight() / 2, radius);
    }

    private void drawCircle(Graphics g, int centerX, int centerY, int radius) {
        int x = radius;
        int y = 0;
        int p = 1 - radius;

        drawCirclePoints(g, centerX, centerY, x, y);

        while (x > y) {
            y++;
            if (p <= 0) {
                p += 2 * y + 1;
            } else {
                x--;
                p += 2 * (y - x) + 1;
            }
            drawCirclePoints(g, centerX, centerY, x, y);
        }
    }

    private void drawCirclePoints(Graphics g, int centerX, int centerY, int x, int y) {
        drawPixel(g, centerX + x, centerY + y);
        drawPixel(g, centerX - x, centerY + y);
        drawPixel(g, centerX + x, centerY - y);
        drawPixel(g, centerX - x, centerY - y);
        drawPixel(g, centerX + y, centerY + x);
        drawPixel(g, centerX - y, centerY + x);
        drawPixel(g, centerX + y, centerY - x);
        drawPixel(g, centerX - y, centerY - x);
    }

    private void drawPixel(Graphics g, int x, int y) {
        g.drawLine(x, y, x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int radius = sc.nextInt();
        JFrame frame = new JFrame("Midpoint Circle Algorithm With Ahmed Rezk");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.add(new MidpointCircleAlgorithm(radius));
        frame.setVisible(true);
    }
}
