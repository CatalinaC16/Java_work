import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JList;

public class FereastraP1{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;


	public FereastraP1() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.setBounds(200, 100, 500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nr. Matricol");
		lblNewLabel.setBounds(115, 39, 49, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setBounds(115, 82, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(174, 36, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 79, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Are bursa?");
		chckbxNewCheckBox.setBounds(171, 114, 99, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JList list = new JList();
		list.setBounds(26, 243, 150, 150);
		frame.getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(305, 243, 150, 150);
		frame.getContentPane().add(list_1);
		
		JButton btnNewButton = new JButton("Adauga");
		btnNewButton.setBounds(94, 173, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sterge");
		btnNewButton_1.setBounds(305, 180, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
	
		JButton btnNewButton_2 = new JButton("M");
		btnNewButton_2.setBounds(193, 299, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Studenti");
		lblNewLabel_2.setBounds(66, 218, 49, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Camin");
		lblNewLabel_3.setBounds(364, 218, 49, 14);
		frame.getContentPane().add(lblNewLabel_3);
		

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
