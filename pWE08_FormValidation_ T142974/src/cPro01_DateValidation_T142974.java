import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cPro01_DateValidation_T142974 extends JFrame {
	JLabel lbl1 = new JLabel("Full Name : "), lbl2 = new JLabel("DoB	:");
	JTextField txt1 = new JTextField(), txt2 = new JTextField();
	JButton btn1 = new JButton("Check"), btn2 = new JButton("clear");
	String getN, getD;
	int DoB;
	int c, v = 0;

	public static void main(String[] args) {
		cPro01_DateValidation_T142974 wMain = new cPro01_DateValidation_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

	public cPro01_DateValidation_T142974() {
		setTitle(" Form Validation - T142974");
		setSize(400, 200);
		setLayout(null);
		add(lbl1);
		add(lbl2);
		add(txt1);
		add(txt2);
		add(btn1);
		add(btn2);
		lbl1.setBounds(10, 10, 100, 25);
		lbl2.setBounds(10, 40, 100, 25);
		txt1.setBounds(115, 10, 200, 25);
		txt2.setBounds(115, 40, 200, 25);
		btn1.setBounds(10, 70, 100, 25);
		btn2.setBounds(115, 70, 100, 25);
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				getN = txt1.getText();
				getD = txt2.getText();
				String[] day = getD.split("/", 3);
				if (getN.length() >= 2) {
					c = 1;

				} else {
					c = 0;
				}

				for (int i = 0; i < 3; i++) {
					
						DoB = Integer.parseInt(day[i]);
						if(DoB/DoB==1){
							v++;
						}else{
							v=0;
						}
					
				}
				if (c == 1 && v == 3) {
					JOptionPane.showMessageDialog(null, "Nhập Đúng",
							"Thông Báo", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Nhập Sai",
							"Thông Báo", JOptionPane.WARNING_MESSAGE);
				}



			}

		});

	}
}
