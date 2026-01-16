package jonaJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RST_Project {

	private JFrame frame;
	private JTextField guessNumber;
	private JTextField winsCounter;
	private JTextField lossCounter;
	private JTextField randomNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RST_Project window = new RST_Project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RST_Project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ultimate Guessing game");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setBounds(104, 11, 254, 47);
		frame.getContentPane().add(lblNewLabel);
		
		guessNumber = new JTextField();
		guessNumber.setBounds(192, 79, 57, 20);
		frame.getContentPane().add(guessNumber);
		guessNumber.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number from 1-6");
		lblNewLabel_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 58, 215, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Type \"exit\" if you want to get program");
		lblNewLabel_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(10, 95, 263, 47);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Or");
		lblNewLabel_2.setBounds(102, 79, 46, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Wins");
		lblNewLabel_1_3.setFont(new Font("Palatino Linotype", Font.PLAIN, 27));
		lblNewLabel_1_3.setBounds(20, 147, 139, 47);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Losses");
		lblNewLabel_1_4.setFont(new Font("Palatino Linotype", Font.PLAIN, 27));
		lblNewLabel_1_4.setBounds(20, 187, 139, 47);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		winsCounter = new JTextField();
		winsCounter.setText("0");
		winsCounter.setFont(new Font("Tahoma", Font.PLAIN, 24));
		winsCounter.setBounds(104, 145, 75, 35);
		frame.getContentPane().add(winsCounter);
		winsCounter.setColumns(10);
		
		lossCounter = new JTextField();
		lossCounter.setText("0");
		lossCounter.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lossCounter.setColumns(10);
		lossCounter.setBounds(104, 187, 75, 35);
		frame.getContentPane().add(lossCounter);
		
		JButton guessButton = new JButton("guess");
		guessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				int guessNum = 0;
				int randomNum = 6;
				int randomNum2 = 0;
				
				// if user types exit it exits
				
				
				
				String input = guessNumber.getText().trim();

				if (input.equalsIgnoreCase("exit")) {
				    System.exit(0);
				}
						
				
				// getting number from user and random number for computer
				try {
				    guessNum = Integer.parseInt(guessNumber.getText());
				}
				catch (Exception e2) {
				    JOptionPane.showMessageDialog(null,"Invalid entry. Enter a number from 1 to 6 or type 'exit'" );
				    guessNumber.setText(""); 
				    return; 
				}

				
				randomNum2 = (int) (Math.random() * randomNum) + 1;
				
				randomNumber.setText(Integer.toString(randomNum2));
				
				// Checking if the users guess and random number are same or different
				if (guessNum == randomNum2) {
					
					int wins = 0;
					
				    wins = Integer.parseInt(winsCounter.getText());
				    wins++;
				    winsCounter.setText(Integer.toString(wins));
				    JOptionPane.showMessageDialog(null, "You Win! To play another round just enter a new guess and hit guess");

				} else {
					
					int losses = 0;

				    losses = Integer.parseInt(lossCounter.getText());
				    losses++;
				    lossCounter.setText(Integer.toString(losses));
				    JOptionPane.showMessageDialog(null, "You Lose, to try again just enter new guess and hit guess");

				}

				// button code ends here
			}
		});
		guessButton.setFont(new Font("Palatino Linotype", Font.PLAIN, 23));
		guessButton.setBounds(300, 78, 95, 64);
		frame.getContentPane().add(guessButton);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("The Number :");
		lblNewLabel_1_1_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(240, 188, 107, 47);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		randomNumber = new JTextField();
		randomNumber.setBounds(338, 198, 86, 20);
		frame.getContentPane().add(randomNumber);
		randomNumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Restart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// button code starts here
		
				winsCounter.setText("");
				lossCounter.setText("");
				randomNumber.setText("");
				guessNumber.setText("");

				
				// button code ends here
				
				
			}
		});
		btnNewButton.setBounds(300, 157, 95, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
