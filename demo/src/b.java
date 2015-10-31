import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author 
 *
 */
public class b extends JPanel{
	int i=0;
	int h ;
	public b() {
		
		Timer c = new Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				i++;
				repaint();
			}
		});
		c.start();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString(""+i, 10, 10);
		//g.drawString(i, 10, 10);
	}
}
