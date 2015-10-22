package demo;

import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author KTTH
 * 
 */
public class cCalculator extends JFrame {
	JTextField txtScreen = new JTextField("0");
	JButton btnN9 = new JButton("9"), 
			btnN8 = new JButton("8"),
			btnN7 = new JButton("7"), 
			btnN6 = new JButton("6"),
			btnN5 = new JButton("5"), 
			btnN4 = new JButton("4"),
			btnN3 = new JButton("3"), 
			btnN2 = new JButton("2"),
			btnN1 = new JButton("1"),
			btnN0 = new JButton("0"),
			btnC= new JButton("C"),
			btnCe= new JButton("CE"),
			btnA= new JButton("+"), // add
			btnS= new JButton("-"), // sub
			btnD= new JButton("*"), // div
			btnM= new JButton("/"), // mul
	btnSig= new JButton("-/+"),
	btnEqu= new JButton("=");
	
	
	double a= 0;
	double m=0;

	public cCalculator() {
		// set title for the window
		setTitle("Calculator");
		// set the size of the window
		setSize(180, 300);
		// set layout null
		setLayout(null);

		// add components
		add(txtScreen);
		add(btnN0);
		add(btnN1);
		add(btnN2);
		add(btnN3);
		add(btnN4);
		add(btnN5);
		add(btnN6);
		add(btnN7);
		add(btnN8);
		add(btnN9);
		add(btnCe);
		add(btnC);
		add(btnA);
		add(btnS);
		add(btnM);
		add(btnD);
		add(btnSig);
		add(btnEqu);
		//
		txtScreen.setHorizontalAlignment(JTextField.RIGHT);
		// set location
		Insets insButton = new Insets(1, 1, 1, 1);
		txtScreen.setBounds(10, 10, 155, 35);
		btnN7.setBounds(10, 90, 35, 35);
		btnN7.setMargin(insButton);
		btnN8.setBounds(50, 90, 35, 35);
		btnN8.setMargin(insButton);
		btnN9.setBounds(90, 90, 35, 35);
		btnN9.setMargin(insButton);
		btnA.setBounds(130, 90, 35, 35);
		btnA.setMargin(insButton);
		btnN4.setBounds(10, 130, 35, 35);
		btnN4.setMargin(insButton);
		btnN5.setBounds(50, 130, 35, 35);
		btnN5.setMargin(insButton);
		btnN6.setBounds(90, 130, 35, 35);
		btnN6.setMargin(insButton);
		btnS.setBounds(130, 130, 35, 35);
		btnS.setMargin(insButton);
		btnN1.setBounds(10, 170, 35, 35);
		btnN1.setMargin(insButton);
		btnN2.setBounds(50, 170, 35, 35);
		btnN2.setMargin(insButton);
		btnN3.setBounds(90, 170, 35, 35);
		btnN3.setMargin(insButton);
		btnM.setBounds(130, 170, 35, 35);
		btnM.setMargin(insButton);
		btnN0.setBounds(10, 210, 35, 35);
		btnN0.setMargin(insButton);
		btnSig.setBounds(50, 210, 35, 35);
		btnSig.setMargin(insButton);
		btnEqu.setBounds(90, 210, 35, 35);
		btnEqu.setMargin(insButton);
		btnD.setBounds(130, 210, 35, 35);
		btnD.setMargin(insButton);
		
	//	
		//action
		btnSig.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sInput = txtScreen.getText();
				try{
					double dTmp = Double.parseDouble(sInput);
					if( dTmp != 0){
						dTmp = -dTmp;
						txtScreen.setText(""+ dTmp);
					}
				}
				catch(NumberFormatException e){
					txtScreen.setText("0");
				}
				
			}
		});
		
		ActionListener acion = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				//System.out.println("HELLO");
				String sTmp = txtScreen.getText();
				if( arg0.getSource() == btnN0){
					sTmp = sTmp+ "0";
				}
				if( arg0.getSource() == btnN1){
					sTmp = sTmp+ "1";
				}
				if( arg0.getSource() == btnN2){
					sTmp = sTmp+ "2";
				}
				if( arg0.getSource() == btnN3){
					sTmp = sTmp+ "3";
				}
				if( arg0.getSource() == btnN4){
					sTmp = sTmp+ "4";
				}
				if( arg0.getSource() == btnN5){
					sTmp = sTmp+ "5";
				}
				if( arg0.getSource() == btnN6){
					sTmp = sTmp+ "6";
				}
				if( arg0.getSource() == btnN7){
					sTmp = sTmp+ "7";
				}
				if( arg0.getSource() == btnN8){
					sTmp = sTmp+ "8";
				}
				
				JButton btnTmp = (JButton)arg0.getSource();
				sTmp = sTmp + btnTmp.getText();
				txtScreen.setText( sTmp);
			}
		};
		btnN0.addActionListener(acion);
		btnN1.addActionListener(acion);
		
		btnA.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sInput = txtScreen.getText();
				try{
					a = Double.parseDouble(sInput);
				}
				catch(NumberFormatException e){
					a = 0;
				}
			}
		});
		
		btnEqu.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double b =0,c;
				String sInput = txtScreen.getText();
				try{
					b = Double.parseDouble(sInput);
				}
				catch(NumberFormatException e){
					b = 0;
				}
				c=  a+b;
				txtScreen.setText(""+c);
			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// new window
		cCalculator wMain = new cCalculator();
		// end program as closing window.
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		wMain.setVisible(true);
	}

}
