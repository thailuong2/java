import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author KTTH
 *
 */
public class cTimerDemo_AnalogCounter_Pane extends JPanel {
	Timer timCounter= null;
	
	public  cTimerDemo_AnalogCounter_Pane(){
		timCounter = new Timer(300, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				goc = goc - 6;
				repaint();
			}
		});
		
		timCounter.start();
	}
	
	
	public void stop(){
		if( timCounter.isRunning()){
			timCounter.stop();
		}
	}
	
	public void start(){
		if( timCounter.isRunning() ==  false){
			timCounter.start();
		}
	}

	
	
	int R = 50;
	int x0 =50, y0 =50;
	int goc = 0;
	
	
	public void paint( Graphics g){
		super.paint(g);
		int x1= (int)(x0 + R*Math.cos(goc/180.0)),
				y1= (int)(y0 - R*Math.sin(goc/180.0));
		g.drawLine(x0, y0, x1, y1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
