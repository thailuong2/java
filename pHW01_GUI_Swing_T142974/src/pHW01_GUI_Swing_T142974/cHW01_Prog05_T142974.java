/**
 * 
 */
package pHW01_GUI_Swing_T142974;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *  Luong quoc thai T142974
 *
 */
public class cHW01_Prog05_T142974 extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 cHW01_Prog05_T142974 wMain = new  cHW01_Prog05_T142974();
		 wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		 wMain.setVisible(true);
	}
	public  cHW01_Prog05_T142974(){
		final JTextField txt1 = new JTextField();
		final JTextArea a = new JTextArea();
		final JButton bnt1 = new JButton("Check");
		final JButton bnt2 = new JButton("Clear");
		setTitle("Check Number - T142974");
		setSize(250,250);
		setLayout(null);
		add(txt1);add(a);add(bnt1);add(bnt2);
		txt1.setBounds(20,20,170,25);
		bnt1.setBounds(20,50,80,25);
		bnt2.setBounds(110,50,80,25);
		a.setBounds(10,80,200,100);
		ActionListener allbnt = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource()==bnt1){
					int x = txt1.getText().length();
					String sTmp = txt1.getText();
					sTmp=sTmp.trim();
					txt1.setText(""+sTmp);
					if(sTmp.length()==0){
						a.append("Invalid input");
					}else {
						int Num =0;
						try {
							Num = Integer.parseInt(sTmp);
							if(Num>0){
								a.append("is positive integer  "+"\n");
							}if(Num<=0){
								a.append("is not number"+"\n");
							}
							
						} catch (NumberFormatException exception) {
							// TODO: handle exception
							a.append("is not number"+"\n");
						}
					}
					
				}
				if(e.getSource()==bnt2){
					txt1.setText("");
				}
			}
		};
		bnt1.addActionListener(allbnt);
		bnt2.addActionListener(allbnt);
	}
}
