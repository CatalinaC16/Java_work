import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class MainFrame {

    public ArrayList<Produs> products = new ArrayList<Produs>();

    public DefaultListModel<Produs> model = new DefaultListModel<>();

    public DefaultListModel<Produs> destModel = new DefaultListModel<>();

    public ProdusFavorit interfata= new ProdusFavorit();


    private boolean checkFields() throws InvalidDataException{
        try {
            double price = Double.parseDouble(interfata.pret.getText());
            int warranty = Integer.parseInt(interfata.garantie.getText());
            return true;
        } catch (NumberFormatException ex) {
            throw new InvalidDataException("Please enter a valid number for price and warranty.");
        }
    }



    public void createPage()
    {

        JFrame mainFrame= new JFrame();
        mainFrame.setSize(1920,1080);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        JLabel title= new JLabel("Cumparaturi online");
        title.setBounds(600,45,300,150);
        title.setFont(new Font("Georgia", Font.BOLD+Font.ITALIC,20));


        JButton produsFavorit= new JButton("Adauga Produs Favorit");
        produsFavorit.setBounds(600,150,200,30);


        JLabel produseFavorite= new JLabel("Produse Favorite");
        JLabel cosCumparaturi= new JLabel("Cos cumparaturi");

        produseFavorite.setBounds(100,200,200,30);
        cosCumparaturi.setBounds(1000,200,200,30);

        JList<Produs> prodFav= new JList<Produs>();
        JList<Produs> cosCump= new JList<Produs>();

        prodFav.setBounds(100,250,400,500);
        cosCump.setBounds(1000,250,400,500);

        JButton adaugaCos= new JButton("ADAUGA IN COS");
        adaugaCos.setBounds(650,400,200,30);

        JButton stergeProdus= new JButton("STERGE PRODUS FAVORIT");
        stergeProdus.setBounds(650, 550,200,30);

        JCheckBox discountPremium= new JCheckBox();
        discountPremium.setBounds(700,600,30,30);

        JLabel aplicaPremium= new JLabel("Aplica Discount Premium");
        aplicaPremium.setBounds(750,600,200,30);

        JButton totalCos= new JButton("Calculeaza Total Cos");
        totalCos.setBounds(650, 630,200,30);

        JTextField sumaBani= new JTextField();
        sumaBani.setEditable(false);
        sumaBani.setBounds(700,680,150,50);

        JLabel costaMult = new JLabel("TOTAL:");
        costaMult.setBounds(600,680,200,30);

        produsFavorit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                interfata.favorit();
                mainFrame.setVisible(false);
            }
        });

        interfata.save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if(checkFields()) {
                        int idd = Integer.parseInt(interfata.id.getText());
                        String nume1 = interfata.nume.getText();
                        String numePr = interfata.numeP.getText();
                        double pret1 = Double.parseDouble(interfata.pret.getText());
                        int war = Integer.parseInt(interfata.garantie.getText());
                        Tip extract = (Tip) interfata.cb.getSelectedItem();
                        Produs newProduct = new Produs(idd, nume1, numePr, pret1, war, extract);

                        if (nume1.isEmpty() || numePr.isEmpty()) {
                            throw new InvalidDataException("Please fill in both name and surname fields.");
                        } else {
                            for(Produs p : products) {
                                if(p.getID() == idd) {
                                    throw new InvalidDataException("A product with the same id already exists in the list.");
                                }
                            }
                            products.add(newProduct);
                            model.clear();
                            for (Produs st : products) {
                                model.addElement(st);
                            }
                            prodFav.setModel(model);
                        }
                        mainFrame.setVisible(true);
                    }
                } catch (InvalidDataException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }

            }
        });


        adaugaCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = prodFav.getSelectedIndex();
                if (index != -1) {
                    Produs selectedProduct = prodFav.getModel().getElementAt(index);
                    destModel.addElement(selectedProduct);
                    cosCump.setModel(destModel);
                    cosCump.ensureIndexIsVisible(destModel.getSize() - 1);
                    //products.remove(prodFav.getModel().getElementAt(index));
                    ((DefaultListModel<Produs>) prodFav.getModel()).removeElement(selectedProduct);
                } else {
                    String id = JOptionPane.showInputDialog(null,"Please enter the id of the product you want to move:");
                    try {
                        int idd = Integer.parseInt(id);
                        Produs selectedProduct = null;
                        for(Produs p : products) {
                            if(p.getID() == idd) {
                                selectedProduct = p;
                                break;
                            }
                        }
                        if(selectedProduct != null) {
                            destModel.addElement(selectedProduct);
                            cosCump.setModel(destModel);
                            cosCump.ensureIndexIsVisible(destModel.getSize() - 1);
                           // products.remove(selectedProduct);
                            ((DefaultListModel<Produs>) prodFav.getModel()).removeElement(selectedProduct);
                        } else {
                            JOptionPane.showMessageDialog(null, "No product found with id: " + id);
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid id entered. Please enter a valid number.");
                    }
                }
            }

        });


        stergeProdus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = cosCump.getSelectedIndex();
                Produs selectedProduct = null;
                if(index != -1) {
                    selectedProduct = cosCump.getModel().getElementAt(index);
                } else {
                    String id = JOptionPane.showInputDialog(null,"Please enter the id of the product you want to delete:");
                    try {
                        int idd = Integer.parseInt(id);
                        for(Produs p : products) {
                            System.out.println(p.getID());
                            if(p.getID() == idd) {
                                selectedProduct = p;
                                break;
                            }
                        }
                        if(selectedProduct == null) {
                            JOptionPane.showMessageDialog(null, "No product found with id: " + id);
                            return;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Invalid id entered. Please enter a valid number.");
                        return;
                    }
                }
                if(selectedProduct != null) {
                    int selectedIndex = ((DefaultListModel<Produs>)cosCump.getModel()).indexOf(selectedProduct);
                    if(selectedIndex != -1) {
                        products.remove(selectedProduct);
                        ((DefaultListModel<Produs>)cosCump.getModel()).removeElementAt(selectedIndex);
                    }
                }
            }
        });





        totalCos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double totalPrice = 0;
                Produs mostExpensivePremium = null;
                DefaultListModel<Produs> model = (DefaultListModel<Produs>) cosCump.getModel();
                for(int i=0;i<model.size();i++){
                    Produs p = model.getElementAt(i);
                    totalPrice += p.getPret();
                    if (p.getType() == Tip.PREMIUM) {
                        if (mostExpensivePremium == null || p.getPret() > mostExpensivePremium.getPret()) {
                            mostExpensivePremium = p;
                        }
                    }
                }
                if (mostExpensivePremium != null && discountPremium.isSelected()) {
                    double discount = mostExpensivePremium.getPret() * 0.2;
                    totalPrice -= discount;
                }
                sumaBani.setText(Double.toString(totalPrice));
            }
        });


        mainFrame.add(title);
        mainFrame.add(produsFavorit);
        mainFrame.add(produseFavorite);
        mainFrame.add(cosCumparaturi);
        mainFrame.add(prodFav);
        mainFrame.add(cosCump);
        mainFrame.add(adaugaCos);
        mainFrame.add(stergeProdus);
        mainFrame.add(discountPremium);
        mainFrame.add(aplicaPremium);
        mainFrame.add(totalCos);
        mainFrame.add(sumaBani);
        mainFrame.add(costaMult);
        mainFrame.setVisible(true);

    }


}
