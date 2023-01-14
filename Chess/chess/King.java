package chess;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class King {

    public int DisplayImage(JFrame frame) throws IOException
    {
        BufferedImage img=ImageIO.read(new File("C:/Users/piney/OneDrive/Desktop/Chess/chess/King.png"));
        ImageIcon icon=new ImageIcon(img);
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return 3;
    }
}