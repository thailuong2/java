/**
 * 
 */
package pHW04_GUI_T142974;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cHW04_Prog06_Hex2Bin_T142974 extends JFrame {
	JLabel lbl = new JLabel("Input");
	JTextField txt1 = new JTextField();
	JTextArea a = new JTextArea();
	JScrollPane b = new JScrollPane(a);
	JButton btn1 = new JButton("Convert");
	JButton btn2 = new JButton("Clear");
	String get;
	String y;int i,j;
	String[]  x = { "0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F" };

	public static void main(String[] args) {
		cHW04_Prog06_Hex2Bin_T142974 wMain = new cHW04_Prog06_Hex2Bin_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

	public cHW04_Prog06_Hex2Bin_T142974() {
		setTitle(" T142974 � Hex 2 Bin");
		setSize(300, 300);
		setLayout(null);
		add(lbl);
		add(txt1);
		add(b);
		add(btn2);
		add(btn1);
		lbl.setBounds(10, 10, 50, 25);
		txt1.setBounds(40, 10, 200, 25);
		btn1.setBounds(10, 40, 100, 25);
		btn2.setBounds(120, 40, 100, 25);
		b.setBounds(10, 70, 260, 190);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				get = txt1.getText();
				String[] cut = get.split("");

				for ( i = 0; i < get.length(); i++) {
					
					
					
						System.out.print(""+cut[i]);
						if(cut[i]=="a"){
							System.out.print("cxvcxv");
						}
					}
							
						
					

				

			}

		});

	}
}
