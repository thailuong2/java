package demo;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D.Double;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * luong quoc thai T142974
 *
 */
public class sadsd extends JFrame {
	// tao cac texfield , button .
	JTextField txt = new JTextField();
	JButton bnto1 = new JButton("1");
	JButton bnto2 = new JButton("2");
	JButton bnto3 = new JButton("3");
	JButton bnto4 = new JButton("4");
	JButton bnto5 = new JButton("5");
	JButton bnto6 = new JButton("6");
	JButton bnto7 = new JButton("7");
	JButton bnto8 = new JButton("8");
	JButton bnto9 = new JButton("9");
	JButton bnto0 = new JButton("0");
	JButton bntC = new JButton(".");
	JButton bntadd = new JButton("+");
	JButton bntsub = new JButton("-");
	JButton bntmulti = new JButton("*");
	JButton bntdiv = new JButton("/");
	JButton bntx = new JButton("C");
	JButton bntt = new JButton("CE");
	JButton bnty = new JButton("+/-");
	JButton bntmr = new JButton("MR"), bntmc = new JButton("MC"),
			bntmcong = new JButton("M+"), bntmtru = new JButton("M-"),
			bntac = new JButton("AC");
	JButton bntequa = new JButton("=");
	
			int add = 0, sub = 0, multi = 0, div = 0;
	// add cac button, texfield vao panel
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao frame
		cHW02_Calculator_T142974 wMain = new cHW02_Calculator_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
	}

	public sadsd() {
		setTitle("Calculator");// tiltle
		setSize(350, 250);// kich thuoc
		setLayout(null);

		add(txt);
		txt.setBounds(10, 10, 250, 25);
		add(bnto1);
		add(bnto2);
		add(bnto3);
		add(bnto4);
		add(bnto5);
		add(bnto6);
		add(bnto7);
		add(bnto8);
		add(bnto0);
		add(bnto9);
		add(bntC);
		add(bntadd);
		add(bntsub);
		add(bntmulti);
		add(bntdiv);
		add(bntx);
		add(bntt);
		add(bnty);
		Insets insButton = new Insets(1, 1, 1, 1);
		bntadd.setMargin(insButton);
		bntadd.setBounds(10, 170, 35, 35);
		bntsub.setMargin(insButton);
		bntmulti.setMargin(insButton);
		bntdiv.setMargin(insButton);

		bntt.setMargin(insButton);
		bnty.setMargin(insButton);
		bntsub.setBounds(50, 170, 35, 35);
		bntmulti.setBounds(90, 170, 35, 35);
		bntdiv.setBounds(130, 170, 35, 35);
		bntx.setBounds(240, 50, 55, 25);
		bntt.setBounds(240, 80, 55, 25);
		bnty.setBounds(240, 110, 55, 25);
		bnto1.setBounds(10, 50, 55, 25);
		bnto2.setBounds(65, 50, 55, 25);
		bnto3.setBounds(120, 50, 55, 25);
		bnto4.setBounds(10, 80, 55, 25);
		bnto5.setBounds(65, 80, 55, 25);
		bnto6.setBounds(120, 80, 55, 25);
		bnto7.setBounds(10, 110, 55, 25);
		bnto8.setBounds(65, 110, 55, 25);
		bnto9.setBounds(120, 110, 55, 25);
		bnto0.setBounds(10, 140, 55, 25);
		bntC.setBounds(65, 140, 55, 25);
		add(bntmcong);
		bntmcong.setBounds(180, 80, 55, 25);
		add(bntmc);
		bntmc.setBounds(180, 50, 55, 25);
		add(bntmtru);
		bntmtru.setBounds(180, 110, 55, 25);
		add(bntmr);
		bntmr.setBounds(180, 140, 55, 25);
		add(bntac);
		bntac.setBounds(180, 170, 55, 25);
		add(bntequa);
		bntequa.setBounds(120, 140, 55, 25);
		// tao listener
		bntt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				// bat su kien cho nut CE
				txt.setText("");
			}
		});
		ActionListener bntall = new ActionListener() {
			// tao cac bien de lap trinh cac phep tinh.
			

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//double num2 = 0,
					//	 num1 = 0;
				// bat su kien cho cac nut number
				String val = txt.getText();
				if (e.getSource() == bnto1) {
					txt.setText(val + 1);
				}
				if (e.getSource() == bnto2) {
					txt.setText(val + 2);
				}
				if (e.getSource() == bnto3) {
					txt.setText(val + 3);
				}
				if (e.getSource() == bnto4) {
					txt.setText(val + 4);
				}
				if (e.getSource() == bnto5) {
					txt.setText(val + 5);
				}
				if (e.getSource() == bnto6) {
					txt.setText(val + 6);
				}
				if (e.getSource() == bnto7) {
					txt.setText(val + 7);
				}
				if (e.getSource() == bnto8) {
					txt.setText(val + 8);
				}
				if (e.getSource() == bnto9) {
					txt.setText(val + 9);
				}
				if (e.getSource() == bnto0) {
					txt.setText(val + 0);
				}
				if(e.getSource()== bnty){
					try{
						double num = Double.
					}
				}
			}
		};
		// add cac button vao listener.
		bnto1.addActionListener(bntall);
		bnto2.addActionListener(bntall);
		bnto3.addActionListener(bntall);
		bnto4.addActionListener(bntall);
		bnto5.addActionListener(bntall);
		bnto6.addActionListener(bntall);
		bnto7.addActionListener(bntall);
		bnto8.addActionListener(bntall);
		bnto9.addActionListener(bntall);
		bntsub.addActionListener(bntall);
		bntmulti.addActionListener(bntall);
		bntdiv.addActionListener(bntall);
		bnty.addActionListener(bntall);
		bntmc.addActionListener(bntall);
		bnto0.addActionListener(bntall);
		bntequa.addActionListener(bntall);
		bntC.addActionListener(bntall);
		bntadd.addActionListener(bntall);
		bntt.addActionListener(bntall);

	}
}