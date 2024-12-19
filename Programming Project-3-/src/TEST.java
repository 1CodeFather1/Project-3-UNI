import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class TEST extends JPanel {
    private BufferedImage image;

    public TEST() {
        try {
            image = ImageIO.read(new File("path/to/your/image.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // إعداد التحول لتدوير الرسم
        AffineTransform oldTransform = g2d.getTransform();
        AffineTransform newTransform = new AffineTransform();
        newTransform.rotate(Math.toRadians(15), getWidth() / 2, getHeight() / 2); // تدوير بمقدار 15 درجة
        g2d.setTransform(newTransform);

        // رسم مثلث قائم الزاوية بزاوية قائمة في الزاوية العلوية اليمنى
        int frameWidth = getWidth();
        int frameHeight = getHeight();
        int midHeight = frameHeight / 2;
        int[] xPoints = {frameWidth - 50, frameWidth - 200, frameWidth - 50};
        int[] yPoints = {50, 50, midHeight};
        g2d.setColor(Color.BLACK);
        g2d.fillPolygon(xPoints, yPoints, 3);

        // رسم الصورة داخل المثلث
        g2d.setClip(new Polygon(xPoints, yPoints, 3));
        if (image != null) {
            g2d.drawImage(image, frameWidth - 200, 50, 150, midHeight - 50, this);
        }

        // استعادة التحول القديم
        g2d.setTransform(oldTransform);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle with Image");
        TEST panel = new TEST();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
