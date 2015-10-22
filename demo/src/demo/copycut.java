/**
 * 
 */
package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author quoc thai t142974
 *
 */
public class copycut extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copycut wMain = new copycut();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

	public copycut() {
		final JTextField txt1 = new JTextField();
		final JButton bnt1 = new JButton("Copy"), bnt2 = new JButton("Cut");
		final JTextArea a = new JTextArea();
		JScrollPane b = new JScrollPane(a);
		setTitle("Copy-Cut");
		setSize(250, 150);
		setLayout(null);
		add(txt1);
		txt1.setBounds(10, 10, 150, 25);
		add(bnt1);
		bnt1.setBounds(10, 40, 70, 25);
		add(bnt2);
		bnt2.setBounds(85, 40, 70, 25);
		add(b);
		b.setBounds(10, 75, 150, 25);
		a.setBounds(10, 70, 150, 25);
		ActionListener all = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String x = txt1.getText();
				if (e.getSource() == bnt2) {
					a.append(x + "\n");
					txt1.setText("");
				} else {
					a.append(x + "\n");
				}
			}
		};
		bnt1.addActionListener(all);
		bnt2.addActionListener(all);

	}
}
