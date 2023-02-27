import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{

	
	String[] questions = {"Din ce tara izvoraste Dunarea?",
			"Cate state are SUA?",
			"In ce capitala europeana poti vizita Colosseum?",
			"Care este cel mai lung fluviu din Europa?"
			
	};
	String[][] options = {
			{"Franta","Serbia","Germania","Romania"},
			{"48","50","49","45"},
			{"Roma","Atena","Paris","Madrid"},
			{"Nil","Dunare","Nipru","Volga"}			
	};
	
	char[] answers = {'C','B','A','D'};
	char guess,answer;
	int index, correct_guesses = 0,total_questions = questions.length;
	int result, seconds = 10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000,new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds == 1) {
				displayAnswer();
				
			}
		}
		
	});
	
	public Quiz() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,535);
		frame.getContentPane().setBackground(Color.lightGray);
		frame.setLayout(null);
		frame.setTitle("QUIZ GAME");
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		textfield.setBounds(0,0,500,50);
		textfield.setBackground(Color.pink);
		textfield.setForeground(Color.BLACK);
		textfield.setFont(new Font("Ink Free",Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		textarea.setBounds(0,50,500,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		
		textarea.setBackground(Color.pink);
		textarea.setForeground(Color.BLACK);
		textarea.setFont(new Font("MV Boli",Font.BOLD,20));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("MV Boli",Font.BOLD,25));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");

		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("MV Boli",Font.BOLD,25));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");

		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("MV Boli",Font.BOLD,25));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");

		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("MV Boli",Font.BOLD,25));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");		
		
		answer_labelA.setBounds(125,100,500,100);
		answer_labelA.setBackground(Color.black);
		answer_labelA.setForeground(Color.blue);
		answer_labelA.setFont(new Font("MV Boli",Font.BOLD,25));
		answer_labelA.setText("cew");
		
		answer_labelB.setBounds(125,200,500,100);
		answer_labelB.setBackground(Color.black);
		answer_labelB.setForeground(Color.blue);
		answer_labelB.setFont(new Font("MV Boli",Font.BOLD,25));
		
		answer_labelC.setBounds(125,300,500,100);
		answer_labelC.setBackground(Color.black);
		answer_labelC.setForeground(Color.blue);
		answer_labelC.setFont(new Font("MV Boli",Font.BOLD,25));
		
		answer_labelD.setBounds(125,400,500,100);
		answer_labelD.setBackground(Color.black);
		answer_labelD.setForeground(Color.blue);
		answer_labelD.setFont(new Font("MV Boli",Font.BOLD,25));
		
		seconds_left.setBounds(435,445,50,50);
		seconds_left.setBackground(Color.GREEN);
		seconds_left.setForeground(Color.red);
		seconds_left.setFont(new Font("MV Boli",Font.BOLD,25));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		

		number_right.setBounds(225,225,200,100);
		number_right.setBackground(Color.green);
		number_right.setForeground(Color.red);
		number_right.setFont(new Font("MV Boli",Font.BOLD,25));
		number_right.setBorder(BorderFactory.createBevelBorder(1));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		percentage.setBounds(225,325,200,100);
		percentage.setBackground(Color.red);
		percentage.setForeground(Color.green);
		percentage.setFont(new Font("MV Boli",Font.BOLD,25));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
				
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		nextQuestion();
	}
	public void nextQuestion() {
		if(index >= total_questions) 
			results();
		else
		{
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			
			timer.start();
		}
	}
	public void displayAnswer() {
		
	
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(Color.red);
		if(answers[index] != 'B')
			answer_labelB.setForeground(Color.red);
		if(answers[index] != 'C')
			answer_labelC.setForeground(Color.red);
		if(answers[index] != 'D')
			answer_labelD.setForeground(Color.red);
		
		Timer pause = new Timer(2000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				answer_labelA.setForeground(Color.blue);
				answer_labelB.setForeground(Color.blue);
				answer_labelC.setForeground(Color.blue);
				answer_labelD.setForeground(Color.blue);
				
				answer = ' ';
				seconds = 10;
				seconds_left.setText(String.valueOf(seconds));
				
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
			
		});
		pause.setRepeats(false);
		pause.start();
		
	}
	public void results() {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		result = (int) ((correct_guesses / (double)total_questions)*100);
		textfield.setText("Results:");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		number_right.setText(correct_guesses + "/" + total_questions);
		percentage.setText(result+"%");
		frame.add(percentage);
		frame.add(number_right);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(e.getSource() == buttonA) {
			answer = 'A';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		if(e.getSource() == buttonB) {
			answer = 'B';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		if(e.getSource() == buttonC) {
			answer = 'C';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		if(e.getSource() == buttonD) {
			answer = 'D';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		displayAnswer();
				
	}
	
	
}
