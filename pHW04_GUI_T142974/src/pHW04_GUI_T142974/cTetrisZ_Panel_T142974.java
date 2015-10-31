/**
 * 
 */
package pHW04_GUI_T142974;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cTetrisZ_Panel_T142974 extends JPanel {
	int x1=200,x2=225,x3=250;
	int y1=75,y2=100;
	int w =20,h =25,d=25;
	
	public cTetrisZ_Panel_T142974() {
		
	
			setBackground(Color.black);
		}
		public void left(){
			repaint();
			x1=x1-25;
			x2=x2-25;
			x3=x3-25;
			if(x1<0){
				x1=200;
				x2=225;
				x3=250;
			}
		}
		public void right(){
			repaint();
			x1=x1+25;
			x2=x2+25;
			x3=x3+25;
			if(x3>475){
				x1=200;
				x2=225;
				x3=250;
			}
		}
		public void up	(){
			repaint();
			y1=y1-25;
			y2=y2-25;
			
			if(y1<0){
				y1=75;
				y2=100;
				//y3=125;
			}
		}
		public void down (){
			repaint();
			y1=y1+25;
			y2=y2+25;
			//y3=y3+25;
			if(y2>600){
				y1=75;
				y2=100;
				//y3=125;
			}
		}
		public void paint(Graphics g  ){
			super.paint(g);
			g.setColor(Color.green);
			g.fillRect(x1, y1	, 25, 25);
			g.fillRect(x2, y1, 25, 25);
			g.fillRect(x2, y2, 25, 25);
			g.fillRect(x3, y2, 25, 25);
			g.setColor(Color.blue);
			for(int i=1;i<=h;i++){
				g.drawLine(0,25*i, w*d,25*i);
			}
			for(int j =1;j<=w;j++){
				g.drawLine(25*j,0,25*j,h*d);
			}
			
			
		}
}
