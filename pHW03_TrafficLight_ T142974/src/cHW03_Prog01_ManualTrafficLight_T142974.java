import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * Luong quoc thai T142974
 *
 */
public class cHW03_Prog01_ManualTrafficLight_T142974 extends JFrame {

	JButton btn1 = new JButton("RED"), btn2 = new JButton("YELLOW"),
			btn3 = new JButton("GREEN");
	int i = 0, t = 0;
	ImageIcon icon1 = new ImageIcon("IMG/Untitled.png"), icon2 = new ImageIcon(
			"IMG/Untitled2.png"), icon3 = new ImageIcon("IMG/Untitled1.png");
	 JLabel lbl1 = new JLabel(icon1), lbl2 = new JLabel(icon2),
			lbl3 = new JLabel(icon3);

	//BufferedImage imgs[] = new BufferedImage[3];

	public static void main(String[] args) {

		cHW03_Prog01_ManualTrafficLight_T142974 wMain = new cHW03_Prog01_ManualTrafficLight_T142974();
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		wMain.setVisible(true);

	}

	public cHW03_Prog01_ManualTrafficLight_T142974() {
		setTitle("Traffic Light ");
		setSize(500, 500);
		setLayout(null);
		btn1.setMargin(new Insets(1, 1, 1, 1));
		btn2.setMargin(new Insets(1, 1, 1, 1));
		btn3.setMargin(new Insets(1, 1, 1, 1));
		add(btn1);
	    
	    
		
		//add(lbl3);
		add(btn2);
		add(btn3);
		btn1.setBounds(10, 10, 60, 30);
		btn2.setBounds(75, 10, 60, 30);
		btn3.setBounds(140, 10, 60, 30);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method s
				add(lbl1);
				lbl1.setBounds(10, 100, 300, 300);
				lbl2.setBounds(0, 00, 00, 00);
				lbl3.setBounds(0, 00,00, 00);
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(lbl2);
				lbl2.setBounds(10, 100, 300, 300);
				lbl1.setBounds(0, 00, 00, 00);
				lbl3.setBounds(0, 00, 00, 00);
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				add(lbl3);
				lbl3.setBounds(10, 100, 300, 300);
				lbl1.setBounds(0, 00, 00, 00);
				lbl2.setBounds(0, 00, 00, 00);
			}
		});

	}

}
