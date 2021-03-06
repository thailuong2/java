/**
 * 
 */
package pHW04_GUI_T142974;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cHW04_Prog04_DigitalClock_Panel_T142974 extends JPanel {
	// 3 timer giay , phut , gio
	Timer S = null, M = null, H = null;
	String Ss;
	int h, m, s;
	 Font font1;
	public cHW04_Prog04_DigitalClock_Panel_T142974() {
		// timer giay
		S = new Timer(1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				repaint();
				s++;
			
				 
				// tro ve 0 khi dc 60s
				if (s == 60) {
					s = 0;
				}
			}
		});
		S.start();
		// timer phut
		M = new Timer(75 * 1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				repaint();
				m++;
				// tro ve 0 khi dc 60p
				if (m == 60) {
					m = 0;
				}
			}
		});
		M.start();
		// timer gio
		H = new Timer(3600 * 1000, new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				repaint();
				h++;

			}
		});
		H.start();
	}

	// ham ve giay , phut , gio
	public void paint(Graphics g) {
		super.paint(g);
	
		g.drawString(""+s  , 120, 70);
		g.drawString("" + m + " " + ":", 100, 70);
		g.drawString("" + h + " " + ":", 80, 70);
	}
}
