import javax.swing.JFrame;

/**
 * 
 */

/**
 *Luong Quoc Thai T142974
 *
 */
public class cHW03_Prog02_CarAnimation_T142974 extends JFrame {
	cHW03_Prog02_CarAnimation_Panel_T142974 a = new cHW03_Prog02_CarAnimation_Panel_T142974();
	
	
	public static void main(String[] args) {
		cHW03_Prog02_CarAnimation_T142974 wMain = new cHW03_Prog02_CarAnimation_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);
		
	}
	public cHW03_Prog02_CarAnimation_T142974(){
		setSize(1000,500);
		setLayout(null);
		add(a);
		a.setBounds(0,0,1000,500);
	}
}//end class
