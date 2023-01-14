package chess;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
    public static void main(String avg[]) throws IOException
    {
        int abc= DisplayImage();
        
        WKing id=new WKing();
        King id2=new King();
        WQueen id3=new WQueen();
        Queen id4=new Queen();
        WRook id6=new WRook();
        Rook id5=new Rook();
        WKnight id7=new WKnight();
        Knight id8=new Knight();
        WBishop id9=new WBishop();
        Bishop id10=new Bishop();
        WPawn id11=new WPawn();
        Pawn id12=new Pawn();

        id.DisplayImage(board);
    }

    public static JFrame board;

    public static int DisplayImage() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("C:/Users/piney/OneDrive/Desktop/Chess/chess/chessboard.png"));
        ImageIcon icon=new ImageIcon(img);
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(200,300);
        JLabel lbl=new JLabel();
        lbl.setIcon(icon);
        frame.add(lbl);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        board = frame;
        frame.add(new Board());
        return 3;
    }
}