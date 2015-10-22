/**
 * 
 */
package pHW01_GUI_Swing_T142974;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * luong quoc thai t142974
 *
 */
public class cHW01_Prog02_T142974 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW01_Prog02_T142974 wMain = new cHW01_Prog02_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public cHW01_Prog02_T142974() {
		JLabel lbl1 = new JLabel("Name"), lbl2 = new JLabel("Email"), lbl3 = new JLabel(
				"Re-email");
		JTextField txt1 = new JTextField(), txt2 = new JTextField(), txt3 = new JTextField();
		JCheckBox ck1 = new JCheckBox("Daily"), ck2 = new JCheckBox("Weekly"), ck3 = new JCheckBox(
				"Monthly");
		JButton bnt1 = new JButton("Register");
		setTitle("T142974-VLU News Letter");
		setSize(275, 225);
		setLayout(null);
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(txt1);
		add(txt2);
		add(txt3);
		add(ck1);
		add(ck2);
		add(ck3);
		add(bnt1);
		lbl1.setBounds(10, 20, 50, 20);
		lbl2.setBounds(10, 50, 50, 20);
		lbl3.setBounds(10, 80, 50, 20);
		txt1.setBounds(75, 20, 150, 25);
		txt2.setBounds(75, 50, 150, 25);
		txt3.setBounds(75, 80, 150, 25);
		ck1.setBounds(10, 110, 60, 25);
		ck2.setBounds(75, 110, 70, 25);
		ck3.setBounds(150, 110, 70, 25);
		bnt1.setBounds(10, 145, 210, 25);
	}
}
