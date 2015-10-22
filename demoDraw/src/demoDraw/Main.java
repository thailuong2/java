/**
 * 
 */
package demoDraw;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//import pHW01_GUI_Swing_T142974.cHW01_Prog04_T142974;

/**
 * @author 
 *
 */

public class Main extends JFrame {
	paint_car2 abc = new paint_car2();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main wMain = new Main();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}
	public Main() {
		
		setTitle("T142974 - VLU eclipse ");
		setSize(500, 700);
		setLayout(null);
		add(abc);
		abc.setBounds(0,0,240,2000);
}
}