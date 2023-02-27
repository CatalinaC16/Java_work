import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class ProdusFavorit {

    public JButton save = new JButton("SALVEAZA");

    public JTextField id= new JTextField();

    public JTextField nume= new JTextField();

   public JTextField numeP= new JTextField();

   public  JTextField pret= new JTextField();

   public  JTextField garantie= new JTextField();

   public  JComboBox<Tip> cb= new JComboBox<Tip>(Tip.values());


    public void favorit() {

        JFrame favorit = new JFrame();
        favorit.setSize(1920, 1080);
        favorit.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        favorit.setLayout(null);

        JLabel titlu = new JLabel("Cumparaturi online");
        titlu.setBounds(600, 45, 300, 150);
        titlu.setFont(new Font("Papyrus", Font.BOLD , 16));


        id.setBounds(140,200,150,30);

        JLabel id_fill = new JLabel("ID");
        id_fill.setBounds(110,200,100,30);


        nume.setBounds(140,275,150,30);

        JLabel nume_fill = new JLabel("NUME PRODUS");
        nume_fill.setBounds(40,275,100,30);


        numeP.setBounds(140,350,150,30);

        JLabel numeP_fill = new JLabel("NUME PRODUCATOR");
        numeP_fill.setBounds(10,350,100,30);

        JLabel pret_fill = new JLabel("PRET");
        pret_fill.setBounds(110,425,100,30);


        pret.setBounds(140,425,150,30);

        JLabel garantie_fill = new JLabel("GARANTIE");
        garantie_fill.setBounds(70,500,100,30);


        garantie.setBounds(140,500,150,30);

        JLabel tip_fill = new JLabel("TIP");
        tip_fill.setBounds(800,350,100,30);



        cb.setBounds(850,340,200,45);



        save.setBounds(700,500,400,200);

        DefaultListModel<Produs> model = new DefaultListModel<>();



        favorit.add(titlu);
        favorit.add(id);
        favorit.add(id_fill);
        favorit.add(nume);
        favorit.add(nume_fill);
        favorit.add(numeP);
        favorit.add(numeP_fill);
        favorit.add(pret_fill);
        favorit.add(pret);
        favorit.add(garantie);
        favorit.add(garantie_fill);
        favorit.add(tip_fill);
        favorit.add(cb);
        favorit.add(save);
        favorit.setVisible(true);


    }
}
