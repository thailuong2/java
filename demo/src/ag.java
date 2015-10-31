import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sun Oct 25 16:58:55 ICT 2015
 */



/**
 * @author Thái Lương
 */
public class ag extends JPanel {
	public ag() {
		initComponents();
	}

	private void button1ActionPerformed(ActionEvent e) {
		System.out.print("adas");
		
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Thái Lương
		frame1 = new JFrame();
		button1 = new JButton();

		//======== frame1 ========
		{
			Container frame1ContentPane = frame1.getContentPane();
			frame1ContentPane.setLayout(null);

			//---- button1 ----
			button1.setText("text");
			button1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					button1ActionPerformed(e);
				}
			});
			frame1ContentPane.add(button1);
			button1.setBounds(new Rectangle(new Point(65, 95), button1.getPreferredSize()));

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < frame1ContentPane.getComponentCount(); i++) {
					Rectangle bounds = frame1ContentPane.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = frame1ContentPane.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				frame1ContentPane.setMinimumSize(preferredSize);
				frame1ContentPane.setPreferredSize(preferredSize);
			}
			frame1.pack();
			frame1.setLocationRelativeTo(frame1.getOwner());
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Thái Lương
	private JFrame frame1;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
