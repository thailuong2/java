import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * Luong Quoc Thai T142974
 *
 */
public class cHW03_Prog01_TrafficLight_Panel_T142974 extends JPanel {
	int i = 0, x = 1000;
	 int t = 0, c = 0;
	 int k=10;
	 int timeR = 5, timeG = 5, timeY = 2;
	 Timer L = null,Cou=null;

BufferedImage Img[] = new BufferedImage[1];
String[] a = { "IMG/Car-08.gif"};
	public cHW03_Prog01_TrafficLight_Panel_T142974() {
		
		 
		
		L = new Timer(x, new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				i = i + x;
				if (c == 0) {
					if (i <= timeR * x) {
						L1();
					} else {
						i = 0;
						c = 1;
					}
				}
				if (c == 1) {
					if (i <= timeG * 1000) {
						L2();
					} else {
						i = 0;
						c = 2;
					}
				}
				if (c == 2) {
					if (i <= timeY * 1000) {
						L3();
					} else {
						i = 0;
						c = 0;
					}
				

				};

				
					try {

						Img[0] = ImageIO.read(new File(a[0]));

					} catch (IOException e1) {
						Logger.getLogger(
								cHW03_Prog02_CarAnimation_Panel_T142974.class.getName())
								.log(Level.SEVERE, null, e1);
					}
					Cou = new Timer(200, new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e1) {
							repaint();
							k = k + 20;
							if (k >= 1000) {
								k =0;
							}

						}

					});

					Cou.start();

			}
		});
		L.start();
		
	}

	int z = 0;

	public void L1() {
		repaint();
		z = 1;
	}

	public void L2() {
		repaint();
		z = 2;
	}

	public void L3() {
		repaint();
		z = 3;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.gray);
		
		g.setColor(Color.black);
		g.drawLine(600, 00, 600, 300);
		g.drawLine(400, 0, 400, 300);
		g.drawLine(00, 300, 400, 300);
		g.drawLine(00, 500, 400, 500);
		g.drawLine(600, 500, 600, 1000);
		g.drawLine(400, 500, 400, 1000);
		g.drawLine(600, 500, 1000, 500);
		g.drawLine(600, 300, 1000, 300);
		g.setColor(Color.black);
		g.fillRect(360, 180, 40, 120);
		g.fillRect(280, 500, 120, 40);
		g.fillRect(600, 500, 40, 120);
		g.fillRect(600, 260, 120, 40);

		g.setColor(Color.gray);
		//den so 1
		g.fillOval(360, 180, 40, 40);
		g.fillOval(360, 220, 40, 40);
		g.fillOval(360, 260, 40, 40);
		//den so 2
		g.fillOval(360, 500, 40, 40);
		g.fillOval(320, 500, 40, 40);
		g.fillOval(280, 500, 40, 40);
		//den so 3
		g.fillOval(600, 500, 40, 40);
		g.fillOval(600, 540, 40, 40);
		g.fillOval(600, 580, 40, 40);
		//den so 4
		g.fillOval(600, 260, 40, 40);
		g.fillOval(640, 260, 40, 40);
		g.fillOval(680, 260, 40, 40);
		if (z == 1) {
			g.setColor(Color.red);
			g.fillOval(360, 260, 40, 40);
			g.fillOval(600, 500, 40, 40);
			g.setColor(Color.green);
			g.fillOval(280, 500, 40, 40);
			g.fillOval(680, 260, 40, 40);
			
		}
		if (z == 2) {
			
			g.setColor(Color.yellow);
			g.fillOval(360, 220, 40, 40);
			g.fillOval(640, 260, 40, 40);
			g.fillOval(600, 540, 40, 40);
			g.fillOval(320, 500, 40, 40);
		}
		if (z == 3) {
			g.setColor(Color.red);
			g.fillOval(360, 500, 40, 40);
			g.fillOval(600, 260, 40, 40);
			g.setColor(Color.green);
			g.fillOval(360, 260, 40, 40);
			g.fillOval(600, 580, 40, 40);
		}
		g.drawImage(Img[0], k, 350, this);
	}
	

}
