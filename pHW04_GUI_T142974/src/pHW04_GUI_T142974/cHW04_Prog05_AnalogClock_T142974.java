/**
 * 
 */
package pHW04_GUI_T142974;

import javax.swing.JFrame;

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cHW04_Prog05_AnalogClock_T142974 extends JFrame {
	cAnalogClockPanel_T142974 a = new cAnalogClockPanel_T142974();
	

	public static void main(String[] args) {
		cHW04_Prog05_AnalogClock_T142974 wMain = new cHW04_Prog05_AnalogClock_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}
	public cHW04_Prog05_AnalogClock_T142974	(){
		setTitle(" T142974 - Analog Clock ");
		setSize(500,500);
		setLayout(null)	;
		add(a);
		a.setBounds(0,0,500,500);
	}
}
