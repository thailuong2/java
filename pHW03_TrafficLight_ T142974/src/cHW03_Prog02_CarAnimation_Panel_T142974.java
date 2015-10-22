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
 */
public class cHW03_Prog02_CarAnimation_Panel_T142974 extends JPanel {
	Timer Cou = null;
	cHW03_Prog01_TrafficLight_Panel_T142974 stop = new cHW03_Prog01_TrafficLight_Panel_T142974();
	int x = 10, y = 10;

	BufferedImage Img[] = new BufferedImage[1];
	String[] a = { "IMG/Car-08.gif",

	};

	public cHW03_Prog02_CarAnimation_Panel_T142974() {

		try {

			Img[0] = ImageIO.read(new File(a[0]));

		} catch (IOException e) {
			Logger.getLogger(
					cHW03_Prog02_CarAnimation_Panel_T142974.class.getName())
					.log(Level.SEVERE, null, e);
		}
		Cou = new Timer(200, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				x = x + 20;
				if (x >= 1000) {
					x = 10;
				}

			}

		});

		Cou.start();

	}

	{

	}

	public void paint(Graphics g) {

		super.paint(g);
		g.drawImage(Img[0], x, y, this);
	}
}
