import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

class MyPanel extends JPanel {
	
public static void main(String[] args) {
	
	 JFrame frame = new JFrame ("Simple Frame");
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 frame.setSize(300, 120);
	
	 JPanel panel1 = new JPanel();
	 JPanel panel2 = new JPanel();
	
	 JLabel l = new JLabel ("Label1 ");
	 JTextField tf = new JTextField("TextField1");
	 panel1.add(l);
	 panel1.add(tf);
	 panel1.setLayout(new FlowLayout());
	
	 JButton b1 = new JButton("Button 1");
	 JButton b2 = new JButton("Button 2");
	 JButton b3 = new JButton("Button 3");
	 
	 panel2.add(b1);
	 panel2.add(b2);
	 panel2.add(b3);
	
	 b1.addActionListener(new ActionListener() {
		int cnt = 0;
		@Override
		public void actionPerformed(ActionEvent e) {
			cnt++;
			l.setText(""+cnt);
			
		}
	});
	 
	 b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String citire = null;
			citire = tf.getText();
			l.setText(citire);
			
		}
	});
	 
	 b3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			Random random = new Random();
			float r = random.nextFloat();
			float g = random.nextFloat();
			float b = random.nextFloat();
			
			Color culoare = new Color(r,g,b);
			panel1.setBackground(culoare);
			
			float r1 = random.nextFloat();
			float g1 = random.nextFloat();
			float b1 = random.nextFloat();
			
			Color culoare1 = new Color(r1,g1,b1);
			panel2.setBackground(culoare1);
			
			
		}
	});
	 JPanel p = new JPanel();
	 p.add(panel1);
	 p.add(panel2);
	 p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
	
	 frame.setContentPane(p);
	 frame.setVisible(true);
	 
 }
}