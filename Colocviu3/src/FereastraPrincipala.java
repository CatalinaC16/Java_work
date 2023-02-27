import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
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

public class FereastraPrincipala {
	private JFrame frame;
	ArrayList<Produs> produseFav = new ArrayList<Produs>();
	ArrayList<Produs> produseCos = new ArrayList<Produs>();
	ArrayList<Double> jucarii = new ArrayList<Double>();
	ArrayList<Double> total = new ArrayList<Double>();

	int[] numere = {3,5,3,9,6};
	
	
	private JTextField numeL;
	private JTextField pretL;
	private JTextField stocL;
	
	public FereastraPrincipala() {
		Arrays.sort(numere);
		System.out.println(Arrays.toString(numere));
		
		
		total.add(0.0);
		frame = new JFrame("Cumparaturi online");
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 197, 254, 368);
		frame.getContentPane().add(list);
		rewriteList(produseFav,list );
		
		JList list2 = new JList();
		list2.setBounds(491, 197, 273, 368);
		frame.getContentPane().add(list2);		
		
		JList list_2 = new JList();
		list_2.setBounds(412, 547, -44, -33);
		frame.getContentPane().add(list_2);
		
		
		JLabel lblNewLabel = new JLabel("Produse favorite");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(65, 174, 147, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCosCumparaturi = new JLabel("Cos cumparaturi");
		lblCosCumparaturi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCosCumparaturi.setBounds(531, 174, 147, 14);
		frame.getContentPane().add(lblCosCumparaturi);	
	
		
		JList listTotal = new JList();
		listTotal.setBounds(368, 510, 66, 31);
		frame.getContentPane().add(listTotal);		
		
		
		JLabel lblNewLabel_2 = new JLabel("Total cos:");
		lblNewLabel_2.setBounds(305, 510, 79, 23);
		frame.getContentPane().add(lblNewLabel_2);
		

		JCheckBox DiscountCheck = new JCheckBox("Foloseste discount premium");
		DiscountCheck.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		DiscountCheck.setBounds(304, 407, 141, 38);	
		frame.getContentPane().add(DiscountCheck);
		
					
		numeL = new JTextField();
		numeL.setBounds(110, 21, 96, 20);
		frame.getContentPane().add(numeL);
		numeL.setColumns(10);
		
		pretL = new JTextField();
		pretL.setColumns(10);
		pretL.setBounds(110, 59, 96, 20);
		frame.getContentPane().add(pretL);
		
		stocL = new JTextField();
		stocL.setColumns(10);
		stocL.setBounds(110, 101, 96, 20);
		frame.getContentPane().add(stocL);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 24, 49, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Pret");
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(30, 62, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Stoc");
		lblNewLabel_1_2.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(30, 104, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tip");
		lblNewLabel_1_3.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(30, 135, 49, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		
		
		TipProdus[] combo = {TipProdus.ELECTROCASNIC,TipProdus.JUCARIE,TipProdus.MANCARE};
		JComboBox TipCombo = new JComboBox(combo);
		TipCombo.setBounds(110, 132, 102, 22);
		frame.getContentPane().add(TipCombo);				

		
		JButton AdaugaCos = new JButton("Adauga in cos");
		AdaugaCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produs prod = (Produs) list.getSelectedValue();
				int index = list.getSelectedIndex();
				if(prod.getStoc()>0) {
					produseCos.add(prod);
					produseFav.remove(index);
					int stoc = prod.getStoc();
					stoc-=1;
					if(stoc>0) {
					prod.setStoc(stoc);
					produseFav.add(prod);
					}
					rewriteList(produseFav, list);
					rewriteList(produseCos, list2);
				}
				
		}
		});
		AdaugaCos.setBounds(284, 245, 188, 23);
		frame.getContentPane().add(AdaugaCos);
		
		
		Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
		JButton AdaugaProdFav = new JButton("Adauga produs favorit");
		AdaugaProdFav.setBounds(257, 59, 188, 47);
		AdaugaProdFav.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nume = numeL.getText();
				Double pret = Double.parseDouble(pretL.getText());
				Integer stoc = Integer.parseInt(stocL.getText());
				try {
			
			     validate(stoc);
				}
				catch(InvalidDataException exe) {
					stoc = Integer.parseInt(JOptionPane.showInputDialog(null,"Stoc invalid!"));
					
				}
				TipProdus tip = (TipProdus) TipCombo.getSelectedItem();
				Produs prod = new Produs(nume,pret,stoc,tip);
				produseFav.add(prod);
				rewriteList(produseFav, list);
			}
		});
		frame.getContentPane().add(AdaugaProdFav);
		
		JButton StergeProd = new JButton("Sterge produs favorit");
		StergeProd.setBounds(284, 317, 188, 23);
		StergeProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				/*
				Double pret = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduceti pretul minim al produselor pe care doriti sa le stergeti din cos:"));
				for(Produs i: produseFav) {
					if(i.getPret()>pret) {
						produseFav.remove(i);
						rewriteList(produseFav, list);
					}	
					
				}
				*/				
				
			
				// SELECTED VALUE
				 			
				Produs prod = (Produs)list.getSelectedValue();
				int index = list.getSelectedIndex();
				produseFav.remove(index);
				rewriteList(produseFav, list);
				
			}
		});
		frame.getContentPane().add(StergeProd);
		
		JButton StergeProdCos = new JButton("Sterge Produs Cos");
		StergeProdCos.setBounds(284, 351, 188, 23);
		StergeProdCos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				/*
				 * POP UP
				 * 
				String nume  = JOptionPane.showInputDialog(null, "Introduceti numele produsului pe care doriti sa-l stergeti din cos:");
				for(Produs i: produseCos) {
					if(i.getNume().equalsIgnoreCase(nume)) {
						produseCos.remove(i);
						break;
					}
				}
				rewriteList(produseCos, list2); */
				
				Produs prod = (Produs) list2.getSelectedValue();
				int index = list2.getSelectedIndex();
				produseCos.remove(index);
				rewriteList(produseCos, list2);
				
			}
		});		
		frame.getContentPane().add(StergeProdCos);
		
		JButton TotalCos = new JButton("Calculeaza total cos");
		TotalCos.setBounds(284, 452, 188, 23);	
		TotalCos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 double tot = 0.0;
			 
				 for(Produs i: produseCos) {
					 tot += i.getPret();
		            if(i.getTip()== TipProdus.JUCARIE) {
		            	jucarii.add(i.getPret());
		            }
		            
				 }
				 
				
				 double first = 0.0;
				 if(DiscountCheck.isSelected()) {
					 jucarii.sort(Comparator.reverseOrder());
					 first = jucarii.get(0);
					 tot-= first *0.2;
					 
				 }
				 //total.clear();
				 //total.add(tot);
				 total.set(0, tot);
				 rewriteListD(total, listTotal);
				 
				
			}
		});
		frame.getContentPane().add(TotalCos);
			
		frame.setSize(800,800);
		frame.setVisible(true);
	}

	
	
	public void rewriteList(ArrayList<Produs> produse, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(Produs s: produse) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
	
	public void validate(double stoc) throws InvalidDataException{
		if(stoc<=0) {
			throw new InvalidDataException("stoc invalid");
		}
	} 
	public void rewriteListD(ArrayList<Double> produse, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(Double s: produse) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
}
