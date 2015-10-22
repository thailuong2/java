/**
 * 
 */
package pWE07_Drawing_T142974;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cPro03_Drawing_T142974 extends JFrame {
	JTextField txt1 = new JTextField(), txt2 = new JTextField(),
			txt3 = new JTextField(), txt4 = new JTextField(),
			txt5 = new JTextField(), txt6 = new JTextField(),
			txt7 = new JTextField(), txt8 = new JTextField();
	JLabel lbl1 = new JLabel("x1 , y1 :"), lbl2 = new JLabel("x2 , y2 :"),
			lbl3 = new JLabel("x3 , y3 :"), lbl4 = new JLabel("x4 , y4 :");
	JButton btn1 = new JButton("Paint");
	int x1, y1, x2, y2, x3, y3, x4, y4;

	int w1, h1, w2, h2;
	
	public static void main(String[] args) {
	cPro03_Drawing_T142974 wMain = new cPro03_Drawing_T142974();
	wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
	wMain.setVisible(true);

	}
	public cPro03_Drawing_T142974(){
		setTitle(" Draw Rect - T142974");
		setSize(500,500);
		setLayout(null);
		add(lbl1);
		add(lbl2);
		add(lbl3);
		add(lbl4);
		add(txt1);
		add(txt2);
		add(txt3);
		add(txt4);
		add(txt5);
		add(txt6);
		add(txt7);
		add(txt8);
		lbl1.setBounds(10, 10, 50, 25);
		lbl2.setBounds(10, 40, 50, 25);
		lbl3.setBounds(10, 70, 50, 25);
		lbl4.setBounds(10, 100, 50, 25);
		txt1.setBounds(55, 10, 50, 25);
		txt2.setBounds(105, 10, 50, 25);
		txt3.setBounds(55, 40, 50, 25);
		txt4.setBounds(105, 40, 50, 25);
		txt5.setBounds(55, 70, 50, 25);
		txt6.setBounds(105, 70, 50, 25);
		txt7.setBounds(55, 100, 50, 25);
		txt8.setBounds(105, 100, 50, 25);
		add(btn1);
		btn1.setBounds(10,130,100,25);
		
		ActionListener all = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					x1 = Integer.parseInt(txt1.getText());
					y1 = Integer.parseInt(txt2.getText());
					x2 = Integer.parseInt(txt3.getText());
					y2 = Integer.parseInt(txt4.getText());
					x3 = Integer.parseInt(txt5.getText());
					y3 = Integer.parseInt(txt6.getText());
					x4 = Integer.parseInt(txt7.getText());
					y4 = Integer.parseInt(txt8.getText());
					w1 = x2 - x1;
					w2 = x4 - x3;
					h1 = y3 - y1;
					h2 = y4 - y2;
					if (h1 != h2 || w1 != w2) {
						System.out.println("Loi");
					} else {
						

					}

				} catch (NumberFormatException exception) {
					System.out.println("Loi");
				}

			}
		};
		btn1.addActionListener(all);
		
	}
	
}
