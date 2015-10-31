import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 */

/**
 * Luong Quoc thai T142974
 *
 */
public class cHW03_Prog02_ManualTrafficLight_v2_T142974 extends JFrame {
	// add class vẽ màu đèn
	cHW03_Prog02_ManualTrafficLight_v2_Panel_T142974 a = new cHW03_Prog02_ManualTrafficLight_v2_Panel_T142974();

	JButton btn1 = new JButton("RED"), btn2 = new JButton("YELLOW"),
			btn3 = new JButton("GREEN");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW03_Prog02_ManualTrafficLight_v2_T142974 wMain = new cHW03_Prog02_ManualTrafficLight_v2_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW03_Prog02_ManualTrafficLight_v2_T142974() {
		setTitle("Traffic Light ");
		setSize(500, 500);
		setLayout(null);
		btn1.setMargin(new Insets(1, 1, 1, 1));
		btn2.setMargin(new Insets(1, 1, 1, 1));
		btn3.setMargin(new Insets(1, 1, 1, 1));
		add(btn1);
		add(btn2);
		add(btn3);
		btn1.setBounds(10, 10, 60, 30);
		btn2.setBounds(75, 10, 60, 30);
		btn3.setBounds(140, 10, 60, 30);
		add(a);
		a.setBounds(50, 70, 350, 350);
		ActionListener all = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn1) {
					// gọi hàm vẽ đèn đỏ
					a.red();
					repaint();
				}
				if (e.getSource() == btn2) {
					// gọi hàm vẽ đèn xanh
					a.Green();

					repaint();
				}
				if (e.getSource() == btn3) {
					// gọi hàm vẽ đèn vàng
					a.yellow();

					repaint();
				}
			}

		};
		// add chức năng các button
		btn1.addActionListener(all);
		btn2.addActionListener(all);
		btn3.addActionListener(all);
	}
}// end class
