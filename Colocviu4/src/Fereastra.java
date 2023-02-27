import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JComboBox;
import java.util.Arrays;

public class Fereastra {
	private JFrame frmBanca;
	

	int[] numere = {3,5,3,9,6};
	
	ArrayList<Card> carduri = new ArrayList<Card>();
	ArrayList<Double> soldArr = new ArrayList<Double>();
	ArrayList<String> tranzactiiArr = new ArrayList<String>();
	
	private JTextField numeL;
	private JTextField pinL;
	private JTextField depuneSuma;
	private JTextField retrageSuma;
	private JTextField soldL;
	
	public Fereastra() {
		Arrays.sort(numere);
		System.out.println(Arrays.toString(numere));
		
	
		frmBanca = new JFrame("Banca");
		frmBanca.getContentPane().setBackground(new Color(192, 192, 192));
		frmBanca.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		frmBanca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBanca.getContentPane().setLayout(null);
		
		JList tranzactii = new JList();
		tranzactii.setBounds(10, 197, 392, 368);
		frmBanca.getContentPane().add(tranzactii);
		
		JList listaCarduri = new JList();
		listaCarduri.setBounds(434, 310, 342, 368);
		frmBanca.getContentPane().add(listaCarduri);
		
		
		JList soldAfisare = new JList();
		soldAfisare.setBounds(528, 197, 117, 38);
		frmBanca.getContentPane().add(soldAfisare);		
		
		JList list_2 = new JList();
		list_2.setBounds(412, 547, -44, -33);
		frmBanca.getContentPane().add(list_2);
		
		
		JLabel IstoricTranzactii = new JLabel("Istoric Tranzactii");
		IstoricTranzactii.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		IstoricTranzactii.setBounds(110, 174, 147, 14);
		frmBanca.getContentPane().add(IstoricTranzactii);
		
		JLabel Sold = new JLabel("Sold");
		Sold.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Sold.setBounds(551, 174, 49, 14);
		frmBanca.getContentPane().add(Sold);
		
					
		numeL = new JTextField();
		numeL.setBounds(110, 21, 96, 20);
		frmBanca.getContentPane().add(numeL);
		numeL.setColumns(10);
		
		pinL = new JTextField();
		pinL.setColumns(10);
		pinL.setBounds(110, 59, 96, 20);
		frmBanca.getContentPane().add(pinL);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 24, 49, 14);
		frmBanca.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pin");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(30, 62, 49, 14);
		frmBanca.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tip");
		lblNewLabel_1_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(30, 100, 49, 14);
		frmBanca.getContentPane().add(lblNewLabel_1_3);
		
		TipCard[] tip = {TipCard.DEPUNERE,TipCard.EXTRAGERE};
		JComboBox comboBox = new JComboBox(tip);
		comboBox.setBounds(110, 98, 96, 22);
		frmBanca.getContentPane().add(comboBox);
		
		JButton adauga = new JButton("Adauga card");
		adauga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nume = numeL.getText();
				int pin = Integer.parseInt(pinL.getText());
				double sold = Double.parseDouble(soldL.getText());
				TipCard tip = (TipCard) comboBox.getSelectedItem();
							
				try {
					validate(pin);
				}
				catch(InvalidDataException ex) {
				
					JOptionPane.showMessageDialog(null,"Pin incorect!","ERROR",JOptionPane.ERROR_MESSAGE);
					pin = Integer.parseInt(JOptionPane.showInputDialog(null,"Adauga din nou pin"));
				}
				
				Card card = new Card(nume,pin,sold,tip);
				carduri.add(card);
				tranzactiiArr.add("Cardul a fost adaugat, nume: "+card.getNume());
				
				

				/*
				 * CARD trebuie sa implementeze interfata Comparable, deci metoda CompareTo
				 * ca sa folosim Collections.sort()
				 */
				
				Collections.sort(carduri);
				
		
				rewriteListS(tranzactiiArr, tranzactii);
				rewriteList(carduri, listaCarduri);
				
			}
		});
		adauga.setBounds(259, 75, 125, 23);
		frmBanca.getContentPane().add(adauga);
		
		JButton depune = new JButton("Depune");
		depune.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Card card = (Card) listaCarduri.getSelectedValue();
				int index = listaCarduri.getSelectedIndex();
				if(card.getTip() == TipCard.DEPUNERE) {
					
					carduri.remove(index);					
					double sold = card.getSold();					
					sold+= Integer.parseInt(depuneSuma.getText());
					int x = Integer.parseInt(depuneSuma.getText());
					card.setSold(sold);
					carduri.add(card);		
					soldArr.clear();
					soldArr.add(sold);
					tranzactiiArr.add("A fost depusa suma de: "+x+" de catre nume: "+ card.getNume());
					rewriteListS(tranzactiiArr, tranzactii);
					rewriteListD(soldArr, soldAfisare);
					rewriteList(carduri, listaCarduri);
				}
				else
					JOptionPane.showMessageDialog(null,"Nu e card de depunere!","ERROR",JOptionPane.WARNING_MESSAGE);
			}
		});
		depune.setBounds(622, 24, 89, 23);
		frmBanca.getContentPane().add(depune);
		
		JButton Retrage = new JButton("Retrage");
		Retrage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Card card = (Card) listaCarduri.getSelectedValue();
				int index = listaCarduri.getSelectedIndex();
				if(card.getTip() == TipCard.EXTRAGERE) {
					
					carduri.remove(index);					
					double sold = card.getSold();					
					sold-= Integer.parseInt(retrageSuma.getText());
					int x = Integer.parseInt(retrageSuma.getText());
					card.setSold(sold);
					carduri.add(card);
					soldArr.clear();
					soldArr.add(sold);
					tranzactiiArr.add("A fost extrasa suma de: "+x+" de catre nume: "+ card.getNume());
					rewriteListS(tranzactiiArr, tranzactii);
					rewriteListD(soldArr, soldAfisare);
					rewriteList(carduri, listaCarduri);
					 //total.clear();
					 //total.add(tot);
					 //total.set(0, tot);
				}
				else 
					JOptionPane.showMessageDialog(null,"Nu e card de extragere!","ERROR",JOptionPane.WARNING_MESSAGE);
			}
		});
		Retrage.setBounds(622, 58, 89, 23);
		frmBanca.getContentPane().add(Retrage);
		
		depuneSuma = new JTextField();
		depuneSuma.setBounds(516, 25, 96, 20);
		frmBanca.getContentPane().add(depuneSuma);
		depuneSuma.setColumns(10);
		
		retrageSuma = new JTextField();
		retrageSuma.setColumns(10);
		retrageSuma.setBounds(516, 61, 96, 20);
		frmBanca.getContentPane().add(retrageSuma);
		
		JCheckBox Robot = new JCheckBox("Robot?");
		Robot.setBounds(259, 43, 99, 23);
		frmBanca.getContentPane().add(Robot);
		
		JLabel solddd = new JLabel("Sold");
		solddd.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		solddd.setBounds(30, 136, 49, 14);
		frmBanca.getContentPane().add(solddd);
		
		soldL = new JTextField();
		soldL.setColumns(10);
		soldL.setBounds(110, 131, 96, 20);
		frmBanca.getContentPane().add(soldL);
		
		JLabel Carduri = new JLabel("Carduri");
		Carduri.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Carduri.setBounds(551, 284, 49, 14);
		frmBanca.getContentPane().add(Carduri);	
		

		
		frmBanca.setSize(800,800);
		frmBanca.setVisible(true);
		
	}
	public void validate(int pin) throws InvalidDataException{
		
		if(pin<1000 || pin> 9999)
			throw new InvalidDataException("PIN INCORECT");
	}
	public void rewriteList(ArrayList<Card> carduri, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(Card s: carduri) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
	public void rewriteListS(ArrayList<String> tranzactii, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(String s: tranzactii) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
	public void rewriteListD(ArrayList<Double> sold, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(Double s: sold) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
}
