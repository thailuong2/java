import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * 
 */

/**
 * Luong Quoc Thai T142974
 *
 */
public class cHW03_Prog01_TrafficLight_T142974 extends JFrame {
	//add class panel 
	cHW03_Prog01_TrafficLight_Panel_T142974 a = new cHW03_Prog01_TrafficLight_Panel_T142974();

	public static void main(String[] args) {
		cHW03_Prog01_TrafficLight_T142974 wMain = new cHW03_Prog01_TrafficLight_T142974();

		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW03_Prog01_TrafficLight_T142974() {
		setSize(1000, 1000);
		setLayout(null);

		add(a);
		a.setBounds(0, 0, 1000, 1000);
		

	}
}//end class
