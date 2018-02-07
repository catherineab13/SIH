package Princeton_SIR;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image {

    public Image(String emplacement) {

        JFrame frame;
        
        try {
            BufferedImage img = ImageIO.read(new File(emplacement));
            frame = new JFrame("Image");
            frame.getContentPane().add(new JLabel(new ImageIcon(img)));
            frame.pack();
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
