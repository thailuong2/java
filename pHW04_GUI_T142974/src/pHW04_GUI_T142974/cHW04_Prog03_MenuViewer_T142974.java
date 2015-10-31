/**
 * 
 */
package pHW04_GUI_T142974;

//import MyItemListener;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Luong Quoc Thai T142974
 *
 */
public class cHW04_Prog03_MenuViewer_T142974 extends JFrame {
	MyItemListener b = new MyItemListener();
	ImageIcon icon1 = new ImageIcon("IMG/bunbo.jpg"), icon2 = new ImageIcon(
			"IMG/banhcanh.jpg");
	JLabel lbl1 = new JLabel(icon1), lbl2 = new JLabel(icon2);
	int i1,i2,i3,i4;
	//MyItemListener listener = new MyItemListener();
	CheckboxGroup menu = new CheckboxGroup();
	Checkbox c1 = new Checkbox("Bún bò", menu, false);
	Checkbox c2 = new Checkbox("Bánh canh", menu, false);
	Checkbox c3 = new Checkbox("Bánh Cuốn", menu, false);
	Checkbox c4 = new Checkbox("Phở", menu, false);

	public cHW04_Prog03_MenuViewer_T142974() {
		setTitle("T142974 – Menu ");
		setSize(500, 500);
		setLayout(null);
		
		add(lbl1);
		add(lbl2);

		add(c1);
		add(c2);
		add(c3);
		add(c4);
		c1.setBounds(10, 10, 100, 25);
		c2.setBounds(10, 40, 100, 25);
		c3.setBounds(10, 70, 100, 25);
		c4.setBounds(10, 100, 100, 25);
		c1.addItemListener(b);
		c2.addItemListener(b);
		c3.addItemListener(b);
		c4.addItemListener(b);
		int k;
		k=b.status();
		System.out.print(""+k)	;
		if(k==2){
			
			lbl1.setBounds(50,20,200,200);
		}
	}

	public static void main(String[] args) {
		cHW04_Prog03_MenuViewer_T142974 wMain = new cHW04_Prog03_MenuViewer_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

}

class MyItemListener implements ItemListener {
	int i1,i2,i3,i4;
	public void itemStateChanged(ItemEvent e) {
		//cHW04_Prog03_MenuViewer_T142974 a = new cHW04_Prog03_MenuViewer_T142974();
		
		if (e.getStateChange() == ItemEvent.SELECTED) {
			if (String.valueOf(e.getItem()) == "Bánh canh") {
				
				i1=1;
			}
			else{
				System.out.print("cc");
			}
		}
		
	}
	public int status (){
		return i1;
	}
	
}

