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
	int i = 0, x = 1000;// thời gian timer
	int i1 = 0, c = 0, c1 = 0;
	
	// thời gian chạy các đèn
	int timeR = 5, timeG = 5, timeY = 1;
	// 2 timer cho đèn 1-3 , và 2-4
	Timer L = null;

	public cHW03_Prog01_TrafficLight_Panel_T142974() {
		// timer cho đèn 1-3
		L = new Timer(x, new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				i = i + x;
				// điều kiện chạy đèn
				if (c == 0) {
					if (i <= timeR * x) {
						L1();
						C1();
					}
					// điều kiện đổi đèn
					// tương tự với 3 màu
					else {
						i = 0;
						c = 1;
					}
				}
				if(c==1){
					if(i<=timeY){
						L2();
						C2();
					}else{
						i=0;
						c=2;
					}
				}
				if (c == 2) {
					if (i <= timeG * 1000) {
						L3();
						C3();
					} else {
						i = 0;
						c = 3;
					}
				}
				if (c == 3) {
					if (i <= timeY * 1000) {
						L2();
						C2();
					} else {
						i = 0;
						c = 0;
					}

				}
				
				;

			}
		});
		L.start();
	
	}

	int l ;
	int k ;
	// hàm vẽ đèn đỏ cho trụ 1-3
	public void L1() {
		repaint();
		l = 1;
	}

	// hàm vẽ đèn vàng 1-3
	public void L2() {
		repaint();
		l = 2;
	}

	// hàm vẽ đèn xanh 1-3
	public void L3() {
		repaint();
		l = 3;
	}
	//hàm vẽ đèn xanh cho trụ 2-4
	public void C1(){
		repaint();
		k=1;
	}
	//hàm vẽ đèn vàng cho trụ 2-4
	public void C2(){
		repaint();
		k=2;
	}
	//hàm vẽ đèn đỏ cho trụ 2-4
	public void C3(){
		repaint();
		k=3;
	}
	public int status() {
		return l;
	}
	public int status1() {
		return k;
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
		// den so 1
		g.fillOval(360, 180, 40, 40);
		g.fillOval(360, 220, 40, 40);
		g.fillOval(360, 260, 40, 40);
		// den so 2
		g.fillOval(360, 500, 40, 40);
		g.fillOval(320, 500, 40, 40);
		g.fillOval(280, 500, 40, 40);
		// den so 3
		g.fillOval(600, 500, 40, 40);
		g.fillOval(600, 540, 40, 40);
		g.fillOval(600, 580, 40, 40);
		// den so 4
		g.fillOval(600, 260, 40, 40);
		g.fillOval(640, 260, 40, 40);
		g.fillOval(680, 260, 40, 40);
		if (l == 1) {
			g.setColor(Color.red);
			g.fillOval(360, 260, 40, 40);
			g.fillOval(600, 500, 40, 40);
			

		}
		if (l == 2) {

			g.setColor(Color.yellow);
			g.fillOval(360, 220, 40, 40);
			g.fillOval(600, 540, 40, 40);
			g.fillOval(320, 500, 40, 40);
			g.fillOval(640, 260, 40, 40);
			
		}
		if (l == 3) {
			
			g.setColor(Color.green);
			g.fillOval(600, 580, 40, 40);
			g.fillOval(360, 180, 40, 40);
		}
		if(k==1){
			g.setColor(Color.green);
			g.fillOval(280, 500, 40, 40);
			g.fillOval(680, 260, 40, 40);
		}
		if(k==2){
			g.setColor(Color.yellow);
			g.fillOval(320, 500, 40, 40);
			g.fillOval(640, 260, 40, 40);
		}
		if(k==3){
			g.setColor(Color.red);
			g.fillOval(360, 500, 40, 40);
			g.fillOval(600, 260, 40, 40);
		}

	}

	

}// end class
