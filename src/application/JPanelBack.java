package application;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class JPanelBack extends JPanel {
	Image image;
	public JPanelBack(String chemin){
		super();
		image = Toolkit.getDefaultToolkit().getImage(chemin);
	}
	 public void paintComponent(Graphics g)
	   {
	     super.paintComponent(g);
	 
	     int imageWight = image.getWidth(this);
	     int imageHeight = image.getHeight(this);
	 
	     g.drawImage (image, 0, 0, null);
	     repaint();
	   }

}
