import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JComboBox;


public class FereastraSecundara {

	private JFrame frmAdaugaProdusFavorit;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
		
	ArrayList<Produs> produse = new ArrayList<Produs>();
		
		public FereastraSecundara() {
			frmAdaugaProdusFavorit= new JFrame("Cumparaturi online");
			frmAdaugaProdusFavorit.setTitle("Adauga Produs Favorit");
			frmAdaugaProdusFavorit.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
			frmAdaugaProdusFavorit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmAdaugaProdusFavorit.getContentPane().setLayout(null);
			
			JPopupMenu popupMenu = new JPopupMenu();
			addPopup(frmAdaugaProdusFavorit.getContentPane(), popupMenu);
			
			JLabel lblNewLabel = new JLabel("ID");
			lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel.setBounds(85, 164, 65, 14);
			frmAdaugaProdusFavorit.getContentPane().add(lblNewLabel);
			
			JLabel lblCosCumparaturi = new JLabel("Nume Produs");
			lblCosCumparaturi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblCosCumparaturi.setBounds(47, 219, 103, 14);
			frmAdaugaProdusFavorit.getContentPane().add(lblCosCumparaturi);
			
			JLabel lblNewLabel_1 = new JLabel("Adauga Produs Favorit");
			lblNewLabel_1.setFont(new Font("Papyrus", Font.BOLD, 16));
			lblNewLabel_1.setBounds(295, 28, 188, 53);
			frmAdaugaProdusFavorit.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_2 = new JLabel("Nume Producator");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setBounds(65, 277, 85, 23);
			frmAdaugaProdusFavorit.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_3 = new JLabel("Pret");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_3.setBounds(81, 338, 53, 14);
			frmAdaugaProdusFavorit.getContentPane().add(lblNewLabel_3);
			
			JLabel lblNewLabel_4 = new JLabel("Garantie (ani)");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_4.setBounds(54, 383, 96, 23);
			frmAdaugaProdusFavorit.getContentPane().add(lblNewLabel_4);
			
			textField = new JTextField();
			textField.setBounds(162, 162, 96, 20);
			frmAdaugaProdusFavorit.getContentPane().add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setBounds(162, 217, 96, 20);
			frmAdaugaProdusFavorit.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setBounds(162, 278, 96, 20);
			frmAdaugaProdusFavorit.getContentPane().add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setBounds(162, 332, 96, 20);
			frmAdaugaProdusFavorit.getContentPane().add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setBounds(162, 386, 96, 20);
			frmAdaugaProdusFavorit.getContentPane().add(textField_4);
			textField_4.setColumns(10);
			
			JLabel lblNewLabel_4_1 = new JLabel("TIP");
			lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_4_1.setBounds(457, 193, 32, 23);
			frmAdaugaProdusFavorit.getContentPane().add(lblNewLabel_4_1);
			
			
			TipProdus[] var = {TipProdus.NORMAL,TipProdus.PREMIUM};
			JComboBox comboBox = new JComboBox(var);
			comboBox.setBounds(499, 195, 103, 22);
			frmAdaugaProdusFavorit.getContentPane().add(comboBox);
			
			JButton btnNewButton = new JButton("Salveaza produs favorit");
			btnNewButton.setBounds(509, 368, 171, 53);
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					int id = Integer.parseInt(textField.getText());
				    String nume = textField_1.getText();
				    String producator = textField_2.getText();
				    double pret = 0.0;
				    int garantie = 0 ;
				    try {
					     pret = Double.parseDouble(textField_3.getText());
					     garantie = Integer.parseInt(textField_4.getText());
					     validateProduct(pret, garantie);
				    }
				    catch(InvalidDataException ex){
				    	JOptionPane.showMessageDialog(null,"Pret/Garantie nu e pozitiva!","ERROR",JOptionPane.ERROR_MESSAGE);
				    	
				    }
				    TipProdus tip = (TipProdus) comboBox.getSelectedItem();
				    
				  
				    Produs prod = new Produs(id,nume,producator,pret,tip,garantie);
				    
				    produse.add(prod);
					
				}
			});
			frmAdaugaProdusFavorit.getContentPane().add(btnNewButton);
			
			
			Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
			
		
			frmAdaugaProdusFavorit.setSize(800,800);
			frmAdaugaProdusFavorit.setVisible(true);
	
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	public  void validateProduct(double pret, int garantie) throws InvalidDataException {
        if (pret <= 0 || garantie <= 0 || pret == 0.0 || garantie == 0) {
            throw new InvalidDataException("pret and garantie must be positive values");
        }
    }
}
