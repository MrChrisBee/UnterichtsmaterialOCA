package wbs.test;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Zeichnet einen Kreis mit dem Mittelpunkt mx/my und dem Radius r
 * 
 */
public class KreisZeichnen extends JFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel panel;
    
    public KreisZeichnen(){
        panel = new KreisPanel();
        add(panel);

        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new KreisZeichnen();
    }
}

class KreisPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.GRAY);
        g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
        g2d.setColor(Color.BLACK);
        int mx = 200;
        int my = 200;
        int r = 100;
        Ellipse2D.Double kreis = new Ellipse2D.Double(mx-r, my-r, 2*r, 2*r);
        ;
        g2d.draw(kreis);
    }
} 