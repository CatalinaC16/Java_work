import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Fereastra {
	private JTextField textField;
	private JTextField textField_1;
	
	
	
	Fereastra(){
		/*** 
		 *	FRAME
		 */
		JFrame frame = new JFrame();
		frame.getContentPane().setFont(new Font("Rockwell", Font.PLAIN, 11));
		frame.setSize(430, 430);
		frame.setTitle("Fereastra");	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(123,200,200));
		frame.getContentPane().setLayout(null);
		
		//ImageIcon image = new ImageIcon(".png");
		//frame.setIconImage(image.getImage());
		//label1.setBackground(Color.black);
		//label1.setOpaque(true);
		
		//ImageIcon image = new ImageIcon(.png);
		//label.setIcon(image);
		//label.setHorizontalTextPosition(JLabel.CENTER);
		//label.setVerticalTextPosition(JLabel.TOP);
		
				
		/*** 
		 * LABEL
		 */
		JLabel label1 = new JLabel();
		label1.setFont(new Font("Tw Cen MT Condensed", Font.PLAIN, 14));
		label1.setText("Hello, my friends");
		label1.setBounds(10,21,80,30);
		label1.setForeground(new Color(0, 0, 64));
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("NAME");
		label2.setFont(new Font("Rockwell", Font.PLAIN, 11));
		label2.setForeground(new Color(0, 64, 64));
		label2.setBounds(10, 73, 43, 14);
		frame.getContentPane().add(label2);
		
		JLabel label3 = new JLabel("PRENUME");
		label3.setFont(new Font("Rockwell", Font.PLAIN, 10));
		label3.setForeground(new Color(0, 64, 64));
		label3.setBounds(4, 122, 49, 14);
		frame.getContentPane().add(label3);
		
		textField = new JTextField();
		textField.setBounds(63, 70, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(63, 119, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		/*** 
		 * CHECK BOX
		 */
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Are bursa?");
		chckbxNewCheckBox.setForeground(new Color(0, 64, 64));
		chckbxNewCheckBox.setFont(new Font("Rockwell", Font.PLAIN, 11));
		chckbxNewCheckBox.setBounds(63, 164, 99, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnAdauga = new JButton("Adauga");
		btnAdauga.setForeground(new Color(0, 64, 64));
		btnAdauga.setBounds(10, 212, 89, 23);
		//btnNewButton.setBackground(new Color(12,12,100));
		frame.getContentPane().add(btnAdauga);
	

		//btnNewButton_2.setEnabled(false);
		JButton btnSterge = new JButton("Sterge");
		btnSterge.setForeground(new Color(0, 64, 64));
		btnSterge.setBounds(140, 212, 89, 23);
		frame.getContentPane().add(btnSterge);
		
		JList list = new JList();
		list.setBounds(10, 265, 147, 117);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(259, 265, 147, 117);
		frame.getContentPane().add(list_1);
		
		JButton btnMuta = new JButton("Muta");
		btnMuta.setForeground(new Color(0, 64, 64));
		btnMuta.setBounds(167, 312, 80, 23);
		frame.getContentPane().add(btnMuta);
		
		
		/*** 
		 * RADIO BUTTONS
		 */
		JRadioButton rdbtnNewRadioButton = new JRadioButton("You good?");
		rdbtnNewRadioButton.setBounds(218, 118, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("You not");
		rdbtnNewRadioButton_1.setBounds(218, 144, 111, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton_1);
		group.add(rdbtnNewRadioButton);
		
		
		/*** 
		 * JCOMBOBOX 
		 */
		String[] rasp = {"Feminin", "Masculin","X"};
		JComboBox comboBox = new JComboBox(rasp);
		comboBox.setToolTipText("GEN");
		comboBox.setBounds(217, 25, 112, 22);
		frame.getContentPane().add(comboBox);
		//comboBox.addItem("bird");
		comboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(comboBox.getSelectedItem());
			}
			
		});
		
		
		/*** 
		 * POP UP
		 */
		btnSterge.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
							
				//JOptionPane.showMessageDialog(null,"Ai prins informatia?","INFO",JOptionPane.PLAIN_MESSAGE);
				//JOptionPane.showMessageDialog(null,"Ai prins informatia?","INFO",JOptionPane.INFORMATION_MESSAGE);
				//JOptionPane.showMessageDialog(null,"Ai prins informatia?","INFO",JOptionPane.QUESTION_MESSAGE);
				//JOptionPane.showMessageDialog(null,"Ai prins informatia?","INFO",JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(null,"Ai prins informatia?","INFO",JOptionPane.ERROR_MESSAGE);
				int answer = JOptionPane.showConfirmDialog(null,"Do you code","Title",JOptionPane.YES_NO_CANCEL_OPTION);
			
				String name = JOptionPane.showInputDialog("What is your name?");
				System.out.println(name);
				
				String[] responses = {"No you're awesome!", "thanks","no"};
				JOptionPane.showOptionDialog(null, "You'cute","hello",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
			}
			
		});
		
		/*** 
		 * READ FROM TEXTFIELD
		 * 		 
		 * */
		btnAdauga.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/// IA CE AM INTRODUS DIN FIELD UL DE TEXT
				System.out.println(textField.getText());
				///VERIFICARE CHECK BOX
				System.out.println(chckbxNewCheckBox.isSelected());
				
				System.out.println(rdbtnNewRadioButton.isSelected());
				
			}
		});
		
		/*** 
		 * KEY LISTENER (TASTATURA)
		 */
		
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
			
				System.out.println("You released key char:"+ e.getKeyChar());
			}
			
		});
		
		frame.setVisible(true);
		
	
	}
}
