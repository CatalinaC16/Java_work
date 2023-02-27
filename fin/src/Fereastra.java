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


public class Fereastra {

		private JFrame frame;
		
		
		private JTextField codL;
		private JTextField denL;
		private JTextField pretL;
		private ArrayList<Produs> produseCos = new ArrayList<Produs>();
		private ArrayList<Produs> produseBanda= new ArrayList<Produs>();
		
		public Fereastra() {
				
			frame = new JFrame("Cumparaturi online");
			frame.getContentPane().setBackground(new Color(192, 192, 192));
			frame.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			
			JList CosLista = new JList();
			CosLista.setBounds(29, 197, 735, 187);
			frame.getContentPane().add(CosLista);		
			
			JList list_2 = new JList();
			list_2.setBounds(412, 547, -44, -33);
			frame.getContentPane().add(list_2);
			
			JLabel CosCumparaturiL = new JLabel("Cos de cumparaturi");
			CosCumparaturiL.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			CosCumparaturiL.setBounds(317, 172, 147, 14);
			frame.getContentPane().add(CosCumparaturiL);
									
			codL = new JTextField();
			codL.setBounds(76, 50, 96, 20);
			frame.getContentPane().add(codL);
			codL.setColumns(10);
			
			denL = new JTextField();
			denL.setColumns(10);
			denL.setBounds(234, 50, 96, 20);
			frame.getContentPane().add(denL);
			
			pretL = new JTextField();
			pretL.setColumns(10);
			pretL.setBounds(395, 50, 96, 20);
			frame.getContentPane().add(pretL);
			
			JLabel lblNewLabel_1 = new JLabel("Cod Produs");
			lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_1.setBounds(73, 25, 79, 14);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Denumire produs");
			lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_1_1.setBounds(234, 25, 107, 14);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Pret produs");
			lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			lblNewLabel_1_2.setBounds(395, 25, 84, 14);
			frame.getContentPane().add(lblNewLabel_1_2);
			
			JCheckBox GlutenFree = new JCheckBox("Fara Gluten");
			GlutenFree.setBounds(567, 47, 99, 23);
			frame.getContentPane().add(GlutenFree);
			
			JLabel glutenL = new JLabel("GlutenFree");
			glutenL.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			glutenL.setBounds(567, 27, 84, 14);
			frame.getContentPane().add(glutenL);	
			
			
			JList BandaLista = new JList();
			BandaLista.setBounds(29, 484, 502, 135);
			frame.getContentPane().add(BandaLista);
			
			JLabel BandaProduseL = new JLabel("Banda Produse");
			BandaProduseL.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
			BandaProduseL.setBounds(44, 461, 147, 14);
			frame.getContentPane().add(BandaProduseL);
						
			JCheckBox Discount = new JCheckBox("20% Discount");
			Discount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			Discount.setBounds(595, 547, 118, 23);
			frame.getContentPane().add(Discount);
			
			JButton PuneBanda = new JButton("Pune produsul pe banda ");
			PuneBanda.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			PuneBanda.setBounds(155, 408, 186, 23);
			PuneBanda.addActionListener(new ActionListener() {				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Produs produs = (Produs) CosLista.getSelectedValue();
					produseCos.remove(produs);
					produseBanda.add(produs);
					rewriteList(produseCos,CosLista);
					rewriteList(produseBanda, BandaLista);
					
				}
			});
			frame.getContentPane().add(PuneBanda);
			
			JButton AdugaProdus = new JButton("Adauga produs in cos");
			AdugaProdus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			AdugaProdus.setBounds(109, 111, 186, 23);
			AdugaProdus.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {					
			
					int codProdus = Integer.parseInt(codL.getText());
					String denumire= denL.getText();
					double pret = Double.parseDouble(pretL.getText());
					boolean glutenFree = GlutenFree.isSelected();					
				
					Produs produs = new Produs(codProdus,denumire,pret,glutenFree);
			
				    produseCos.add(produs);
				    rewriteList(produseCos, CosLista);
					
				}
			});
			frame.getContentPane().add(AdugaProdus);
			
			JButton btnStergeProdusIn = new JButton("Sterge produs din cos");
			btnStergeProdusIn.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			btnStergeProdusIn.setBounds(412, 111, 186, 23);
			btnStergeProdusIn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduceti codul produsului care sa fie sters:"));
					try {
						Produs prod = cautaProdus(produseCos, cod);
						produseCos.remove(prod);
						rewriteList(produseCos, CosLista);
						
					}
					catch(ProdusNotFoundException exe) {
						
						JOptionPane.showMessageDialog(null,"Produsul cu codul "+cod+ " nu se afla in cos!","ERROR",JOptionPane.INFORMATION_MESSAGE);
					}
					
				}
			});
			frame.getContentPane().add(btnStergeProdusIn);
			
			JButton TotalCos = new JButton("Total Cos");
			TotalCos.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			TotalCos.setBounds(595, 408, 89, 23);
			TotalCos.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					double tot = 0.0;
					 
					 for(Produs i: produseCos) {
						 tot += i.getPret();			            
					 }
				
					 JOptionPane.showMessageDialog(null,"Cosul de cumparaturi costa "+ tot,"TOTAL COS",JOptionPane.INFORMATION_MESSAGE);	 
					
				}
			} );
			frame.getContentPane().add(TotalCos);
			
			JButton TotalBanda = new JButton("Total Banda");
			TotalBanda.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			TotalBanda.setBounds(588, 498, 118, 23);
			TotalBanda.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					double tot = 0.0;
					 
					 for(Produs i: produseBanda) {
						 tot += i.getPret();			            
					 }
				
					 if(Discount.isSelected()) {
						 double aux = 0.2* tot;
						 tot-=aux;
					 }
					 JOptionPane.showMessageDialog(null,"Banda de cumparaturi costa "+ tot,"TOTAL BANDA",JOptionPane.INFORMATION_MESSAGE);	 
					
				}
			});
			frame.getContentPane().add(TotalBanda);
			
			JLabel lblNewLabel_1_3 = new JLabel("Cumparaturi");
			lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
			lblNewLabel_1_3.setBounds(317, 0, 100, 20);
			frame.getContentPane().add(lblNewLabel_1_3);
			
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
		
	public Produs cautaProdus(ArrayList<Produs> listaDeProduse, int cod) throws ProdusNotFoundException{
			
			for(Produs i: listaDeProduse) {
				if(i.getCodProdus() == cod) 
						return i;			
				
			}
	
		///daca ajunge aici inseamna ca nu a dat return, deci nu a gasit produsul
	     throw new ProdusNotFoundException("Produsul nu se afla in cos");		
	
	}
}

