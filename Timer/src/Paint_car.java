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
 * @auth
 *
 */
public class Paint_car extends JPanel {
	Timer Cou = null;
	int c=0;
	int x=10,y=10;
	int Im = 0;
	int change1=0;
	int change2=0;
	int change3=0;
	BufferedImage Img[]= new BufferedImage[16];
	String[] a = {
			 "D:/imgs/Car-08.gif",
			 "D:/imgs/Car-09.gif",
		        "D:/imgs/Car-10.gif",
		        "D:/imgs/Car-11.gif",
		        "D:/imgs/Car-12.gif",
		        "D:/imgs/Car-13.gif",
		        "D:/imgs/Car-14.gif",
		        "D:/imgs/Car-15.gif",
		        "D:/imgs/Car-00.gif",
		        "D:/imgs/Car-01.gif",
		        "D:/imgs/Car-02.gif",
		        "D:/imgs/Car-03.gif",
		        "D:/imgs/Car-04.gif",
		        "D:/imgs/Car-05.gif",
		        "D:/imgs/Car-06.gif",
		        "D:/imgs/Car-07.gif",
		       
		       
		       
		        
		        "D:/imgs/Car-16.gif",
	};
	public Paint_car(){
		setBackground(Color.black);
		try {
			for (int i=0;i<16;i++){
				Img[i]= ImageIO.read(new File(a[i]));
			}
		} catch (IOException e) {
			 Logger.getLogger(Paint_car.class.getName()).log(Level.SEVERE, null, e);
		}
		Cou = new Timer(200, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				c++;
				if(c<=4){
					if(change1==0){
					x=x+50;
					Im=0;
					
				}else{
					x=x-50;
					y=320;
					Im=8;
					change1=0;
				}}
				if(c>6&&c<=10){
					if(change2==0){
					y=y+20;
					Im++;
					}else{
						y=y-20;
						Im--;
					}
				}	if(c>10&&c<14){
					Im=4;
					y=y+50;
				}
				if(c>13){
					y=y+20;
					Im++;
				}
				if(c>16){
					c=0;
					change1=1;
				}
			
				repaint();
			}
		});
		Cou.start();
	}
	
	public void paint (Graphics g){
		super.paint(g);
		g.drawImage(Img[Im], x,y,this);
	}
}
