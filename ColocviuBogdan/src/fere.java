import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
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

public class fere extends JFrame{
	private JTextField nrMatricolTextField;
	private JTextField textField;
	
	ArrayList<Student> listOfStudents = new ArrayList<Student>();
	
	public fere() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nr.Matricol");
		lblNewLabel.setBounds(32, 107, 75, 14);
		getContentPane().add(lblNewLabel);
		
		nrMatricolTextField = new JTextField();
		nrMatricolTextField.setBounds(96, 104, 86, 20);
		getContentPane().add(nrMatricolTextField);
		nrMatricolTextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nume");
		lblNewLabel_1.setBounds(32, 145, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(96, 142, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Bursa?");
		chckbxNewCheckBox.setBounds(32, 171, 97, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JList list = new JList();
		list.setBounds(20, 372, 298, 222);
		getContentPane().add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(465, 372, 298, 222);
		getContentPane().add(list_1);
		
		JButton btnAdaugaStudent = new JButton("Adauga Student");
		btnAdaugaStudent.setFont(new Font("Yu Gothic UI", Font.PLAIN, 14));
		btnAdaugaStudent.setBounds(48, 214, 134, 30);
		btnAdaugaStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int nrMatricol = Integer.parseInt(nrMatricolTextField.getText());
				String nume = textField.getText();
				boolean areBursa = chckbxNewCheckBox.isSelected();
				
				Student student = new Student(nrMatricol, nume, areBursa);
				listOfStudents.add(student);
				
				rewriteStudentList(listOfStudents,list);
			}
		});
		getContentPane().add(btnAdaugaStudent);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Studenti");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(96, 339, 105, 30);
		getContentPane().add(lblNewLabel_2);
		
		
		
		JButton btnNewButton = new JButton("Muta In Camin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(328, 458, 127, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Studenti caministi");
		lblNewLabel_3.setBounds(482, 347, 177, 14);
		getContentPane().add(lblNewLabel_3);
		
		
		Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);
		lblNewLabel_3.setFont(f3);
		
		JButton btnDeleteStudent = new JButton("Sterge Student");
		btnDeleteStudent.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		btnDeleteStudent.setBounds(410, 218, 134, 26);
		btnDeleteStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String userInput = JOptionPane.showInputDialog(null, "Introduceti numarul matricol al studentului pe care doriti sa-l stergeti!");
				int nrMatricolStudent = Integer.parseInt(userInput);
				
				Student studentToBeDeleted = null;
				for(Student student : listOfStudents)
				{
					if(student.getNrMatricol() == nrMatricolStudent)
						studentToBeDeleted = student;
				}
				
				if(studentToBeDeleted == null)
				{
					JOptionPane.showMessageDialog(null, "Studentul cu nrMatricol " + userInput + " nu a fost gasit!");
				}
				else {
					listOfStudents.remove(studentToBeDeleted);
					JOptionPane.showMessageDialog(null, "Studentul cu nrMatricol " + userInput + " a fost sters!");
					rewriteStudentList(listOfStudents,list);
				}
				
				
				
			}
		});	
		getContentPane().add(btnDeleteStudent);
		
	
		this.setSize(800,800);
		this.setVisible(true);
	}
	
	
	public void rewriteStudentList(ArrayList<Student> listOfStudents, JList list) {
		DefaultListModel listModel = new DefaultListModel();
		for(Student s: listOfStudents) {
			listModel.addElement(s);
		}
		list.setModel(listModel);
	}
}
