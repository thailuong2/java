/**
 * 
 */
package demo;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * @author quoc thai t142974
 *
 */
public class event extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		event wMain = new event();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

	public event() {
		setTitle("ananananana");
		setSize(250, 250);
		setLayout(null);
		JLabel lbl1 = new JLabel("Source");
		JButton bnttrans = new JButton("trans");
		// JButton bntCut = new JButton("cut");
		final JTextField txt1 = new JTextField();
		final JTextField txt2 = new JTextField();
		final JTextArea a = new JTextArea();
		JScrollPane b = new JScrollPane(a);
		add(lbl1);
		add(bnttrans);
		add(txt1);
		// add(bntCut);
		lbl1.setBounds(10, 5, 50, 25);
		bnttrans.setBounds(10, 50, 100, 25);
		// bntCut.setBounds(115,50,100,25);
		txt1.setBounds(70, 5, 150, 25);1
		lbl1.setText("Input");
		
		add(b);
		a.setBounds(10,80,230,45);
		b.setBounds(10,85,230,50);
		bnttrans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String num = txt1.getText();
				int iNum =0;
				try {
					iNum = Integer.parseInt(num);
				}
				catch (NumberFormatException exception ){
					a.append("loi"+"\n");
				}
				if(iNum ==1){
					a.append("one");
				}
			}
		});
	}


}
