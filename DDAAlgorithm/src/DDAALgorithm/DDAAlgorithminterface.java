package DDAALgorithm;
import java.awt.*;
import javax.swing.*;

public class DDAAlgorithminterface extends JPanel {
    private int x0, y0, x1, y1;

    public DDAAlgorithminterface(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int dx = x1 - x0;
        int dy = y1 - y0;
        int steps;
        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        } else {
            steps = Math.abs(dy);
        }

        float xIncrement = (float) dx / (float) steps;
        float yIncrement = (float) dy / (float) steps;

        float x = x0;
        float y = y0;

        for (int i = 0; i < steps; i++) {
            g2d.fillRect(Math.round(x), Math.round(y), 1, 1);
            x += xIncrement;
            y += yIncrement;
        }
    }

    public static void main(String[] args) {
        int x0 = 50, y0 = 50, x1 = 200, y1 = 150;

        JFrame frame = new JFrame("DDA Algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);

        DDAAlgorithminterface panel = new DDAAlgorithminterface(x0, y0, x1, y1);
        frame.add(panel);
        frame.setVisible(true);
    }
}
