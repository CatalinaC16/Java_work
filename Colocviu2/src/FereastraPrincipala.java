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

public class FereastraPrincipala {
	private JFrame frame;
	ArrayList<Produs> produseFav = new ArrayList<Produs>();
	ArrayList<Produs> produseCos = new ArrayList<Produs>();
	ArrayList<Double> total = new ArrayList<Double>();
	ArrayList<Double> favPremium = new ArrayList<Double>();
	
	public FereastraPrincipala() {
		Produs prod1 = new Produs(234,"Masina de spalat BOSCH", "Bosch",2500,TipProdus.NORMAL,5);
		Produs prod2 = new Produs(345,"Aragaz BOSCH", "Bosch",1500,TipProdus.PREMIUM,6);
		Produs prod3 = new Produs(219,"Frigider BOSCH", "Bosch",2500,TipProdus.NORMAL,3);
		Produs prod4 = new Produs(219,"Aparat cafea BOSCH", "Bosch",1000,TipProdus.PREMIUM,3);
		
		produseFav.add(prod1);
		produseFav.add(prod2);
		produseFav.add(prod3);		
		produseFav.add(prod4);
					
		frame = new JFrame("Cumparaturi online");
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 197, 254, 368);
		frame.getContentPane().add(list);
		rewriteList(produseFav,list );
		
		JList list_1 = new JList();
		list_1.setBounds(491, 197, 273, 368);
		frame.getContentPane().add(list_1);		
		
		
		JButton btnNewButton = new JButton("Adauga in cos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Produs prod = (Produs) list.getSelectedValue();
				int index = list.getSelectedIndex();
				produseCos.add(prod);
				produseFav.remove(index);
				rewriteList(produseFav, list);
				rewriteList(produseCos, list_1);
		}
		});
		btnNewButton.setBounds(284, 245, 188, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Produse favorite");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(65, 174, 147, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCosCumparaturi = new JLabel("Cos cumparaturi");
		lblCosCumparaturi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCosCumparaturi.setBounds(531, 174, 147, 14);
		frame.getContentPane().add(lblCosCumparaturi);
		
		JButton btnStergeFavorite = new JButton("Sterge produs favorit");
		btnStergeFavorite.setBounds(284, 317, 188, 23);
		btnStergeFavorite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
						
				Produs sters = (Produs) list.getSelectedValue();
				int index = list.getSelectedIndex();
				produseFav.remove(sters);
				rewriteList(produseFav, list);
			}
		});
		frame.getContentPane().add(btnStergeFavorite);
		
		JLabel lblNewLabel_1 = new JLabel("Cumparaturi online");
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(268, 28, 260, 53);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Adauga produs favorit");
		btnNewButton_1.setBounds(304, 92, 147, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FereastraSecundara fere2 = new FereastraSecundara();
				frame.dispose();
			}
		});		
		frame.getContentPane().add(btnNewButton_1);
		
		
		JList list_3 = new JList();
		list_3.setBounds(368, 510, 66, 31);
		frame.getContentPane().add(list_3);		
		
		
		JLabel lblNewLabel_2 = new JLabel("Total cos:");
		lblNewLabel_2.setBounds(305, 510, 79, 23);
		frame.getContentPane().add(lblNewLabel_2);
		

		JCheckBox chckbxNewCheckBox = new JCheckBox("Foloseste discount premium");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		chckbxNewCheckBox.setBounds(304, 407, 141, 38);	
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton_2 = new JButton("Calculeaza total cos");
		btnNewButton_2.setBounds(274, 452, 188, 23);	
		btnNewButton_2.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				double tot = 0.0;
				/*Iterator<Produs> ite = produseCos.iterator();
				
				while(ite.hasNext()) {
					
					Produs prod = ite.next();
					tot +=  prod.getPret();
				}
				*/
				for(Produs i : produseCos) {
					tot+=i.getPret();
					if(i.getTip()== TipProdus.PREMIUM) {
						favPremium.add(i.getPret());
					}
				}
				Double pret = 0.0;
				if(chckbxNewCheckBox.isSelected()) {
					favPremium.sort(Comparator.reverseOrder());
					pret = favPremium.get(0);
					tot-= pret*0.2;
				}
				
				
				total.clear();
				total.add(tot);
				
				rewriteListD(total, list_3);
			}
		
		});	
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		JButton btnStergeIndexFavorit = new JButton("Adauga ID in cos");
		btnStergeIndexFavorit.setBounds(284, 283, 188, 23);
		btnStergeIndexFavorit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti id produsului pe care doriti sa-l adaugati in cos:"));
				int index = 0;
				Produs prod = null ;
				for(Produs i: produseFav) {
					if(i.getIdProdus()==id)
					{
						prod = i;
						index = produseFav.indexOf(i);
					}
					
				}
				
				produseCos.add(prod);
				produseFav.remove(index);
				rewriteList(produseFav, list);
				rewriteList(produseCos, list_1);
			}
			 
		 });
		frame.getContentPane().add(btnStergeIndexFavorit);
		
		JButton btnStergeIdFavorit = new JButton("Sterge ID favorit");
		btnStergeIdFavorit.setBounds(284, 351, 188, 23);
		btnStergeIdFavorit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti id produsului pe care doriti sa-l stergeti din favorite:"));
				int index = 0;
				Produs prod = null ;
				for(Produs i: produseFav) {
					if(i.getIdProdus()==id)
					{
						prod = i;
						index = produseFav.indexOf(i);
					}
					
				}
				
				produseFav.remove(index);
				rewriteList(produseFav, list);
			
			}
		});
		frame.getContentPane().add(btnStergeIdFavorit);
		
		JList list_2 = new JList();
		list_2.setBounds(412, 547, -44, -33);
		frame.getContentPane().add(list_2);
				
		Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
			
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
	
	public void rewriteListD(ArrayList<Double> produse, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(Double s: produse) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
}
