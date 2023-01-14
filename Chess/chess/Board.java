package chess;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.border.TitledBorder;

class Board extends JPanel {
	int x, y;
	BufferedImage image;

	Board() {
		setBackground(Color.white);
		setSize(450, 400);

		Image img = getToolkit().getImage("C:/Users/piney/OneDrive/Desktop/Chess/chess/WKing.png");

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(img, 1);
		try {
			mt.waitForAll();
		} catch (Exception e) {
			System.out.println("Image not found.");
		}
		image = new BufferedImage(300, 300,
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		g2.drawImage(img, 0, 0, this);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(image, x, y, this);
	}
}