/**
 * 
 */
package demo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author quoc thai t142974
 *
 */
public class demo1 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 wMain = new demo1();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
		
	}
	public demo1(){
		setTitle("calcu");
		setSize(300,200);
		setLayout(null);
		final JTextField txt1 = new JTextField();
		JTextField txt2 = new JTextField(), txt3 = new JTextField();
		JButton bnt1 = new JButton("*"),
				bnt2 = new JButton("/	"),
				bnt3 = new JButton("=");
		add(txt1);
		txt1.setBounds(10,5,100,25);
		add(bnt3);
		bnt3.setBounds(110,45,45,25);
		add(bnt1);
		bnt1.setBounds(10,45,45,25);
		add(bnt2);
		bnt2.setBounds(60,45,45,25);
		add(txt3);
		txt3.setBounds(10,75,100,25);
		bnt1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txt1.setText(""+(txt1.getText())+"*");
			}
		});
		bnt2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txt1.setText(""+(txt1.getText()+"/"));	
			}
		});
	}
}
