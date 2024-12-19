package GUI;

import javax.swing.JButton;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

public class RoundButton extends JButton {
    private Shape shape;

    public RoundButton() {

        setContentAreaFilled(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(getBackground().darker());   // the color that we saw when click the btn
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width - 1, getSize().height - 1);
        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor((new Color(0x3db3ac)));  // The Color line Around the Button
        g.drawOval(1, 1, getSize().width, getSize().height );
    }

    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0,  getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }

}
