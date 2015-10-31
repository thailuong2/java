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
	int x = 0, y = 5,k=0;
	// tạo array lưu nguồn hình
	BufferedImage Img[] = new BufferedImage[1];
	String[] a = { "IMG/Car-08.gif"

	};

	public cHW03_Prog02_CarAnimation_Panel_T142974() {
		// duyệt nguồn hình thành hình ảnh
		try {

			Img[0] = ImageIO.read(new File(a[0]));

		} catch (IOException e) {
			Logger.getLogger(
					cHW03_Prog02_CarAnimation_Panel_T142974.class.getName())
					.log(Level.SEVERE, null, e);
		}
		Cou = new Timer(5, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				x = x + 5;// tăng tọa đọ của xe khi timer chạy
				//điều kiện để dừng xe lại khi gặp đèn đỏ
				
				if(x>290&&(stop.status1()==3||stop.status1()==2)&&x<350){						
					stop();	
				}
				// điều kiện đễ xe tiếp tục chạy
				// mà sao nó không chạy em không hiểu
				if(stop.status1()==1){
					start();
				}
				if (x >1000 ) {
					x = 00;
				}
			}

		});
		
		Cou.start();
		
	}
public void start(){
		
		Cou.start();
	}
	public void stop(){
		
		Cou.stop();
	}
	

	// hàm vẽ xe
	public void paint(Graphics g) {

		super.paint(g);
		g.drawImage(Img[0], x, y, this);
	}
	
}
// end class
