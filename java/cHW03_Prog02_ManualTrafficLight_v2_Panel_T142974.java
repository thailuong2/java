import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * Luong Quoc Thai T142974
 *
 */
public class cHW03_Prog02_ManualTrafficLight_v2_Panel_T142974 extends JPanel {
	int t;
	int i;

	//hàm điều kiện vẽ màu đỏ
	public void red() {
		t = 1;
	}
	//hàm điều kiện vẽ màu vàng
	public void yellow() {
		t = 2;
	}
	//hàm điều kiện vẽ màu xanh
	public void Green() {
		t = 3;
	}
	//hàm vẽ 3 màu đèn theo điều kiện đc gọi
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(49, 99, 51, 163);
		g.setColor(Color.gray);
		g.fillOval(50, 100, 50, 50);
		g.fillOval(50, 155, 50, 50);
		g.fillOval(50, 210, 50, 50);
		//hàm vẽ màu đỏ
		if (t == 1) {
			g.setColor(Color.red);
			g.fillOval(50, 100, 50, 50);
		}
		//hàm vẽ màu xanh
		if (t == 2) {
			g.setColor(Color.green);
			g.fillOval(50, 155, 50, 50);
		}
		//hàm vẽ màu vàng
		if (t == 3) {
			g.setColor(Color.yellow);
			g.fillOval(50, 210, 50, 50);
		}
	}
}//end class
