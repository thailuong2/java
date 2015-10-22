import javax.swing.JFrame;

/**
 * 
 */

/**
 *
 */
public class Main_car extends JFrame{
Paint_car add = new Paint_car();
	public static void main(String[] args) {
		Main_car wMain = new Main_car();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}
	public Main_car(){
		setSize(500,700);
		setLayout(null);
		add(add);
		add.setBounds(0,0,500,700);
	}
}
