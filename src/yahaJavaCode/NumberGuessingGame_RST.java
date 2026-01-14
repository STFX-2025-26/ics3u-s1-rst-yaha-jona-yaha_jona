package yahaJavaCode;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NumberGuessingGame_RST {

	private JFrame frame;
	private JTextField numGuessTextField;
	private JTextField betPointsTextField;
	private JTextField pointsTextField;
	private JTextField randomNumTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberGuessingGame_RST window = new NumberGuessingGame_RST();
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
	public NumberGuessingGame_RST() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel titleLabel = new JLabel("Number Guessing Game");
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		titleLabel.setBounds(115, 11, 204, 21);
		frame.getContentPane().add(titleLabel);
		
		JLabel instructionLabel = new JLabel("This is a game where you bet points and guess a number 1-6");
		instructionLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		instructionLabel.setBounds(70, 43, 315, 14);
		frame.getContentPane().add(instructionLabel);
		
		numGuessTextField = new JTextField();
		numGuessTextField.setText("Write Your Guess Here");
		numGuessTextField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		numGuessTextField.setBounds(10, 209, 116, 20);
		frame.getContentPane().add(numGuessTextField);
		numGuessTextField.setColumns(10);
		
		JButton rollNumberButton = new JButton("Roll Dice");
		rollNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// Code Starts Here
			    
				// Variables 
				int points = 1000;
				int betPoints = 0;
				int userGuess = 0;
				int pointHolder = 0;
				
				// Get amount of points bet from user
				int betPoints1 = Integer.parseInt(betPointsTextField.getText());
				betPoints1 = betPoints;
				
				// Get the number guessed by the user
				int userGuess1 = Integer.parseInt(numGuessTextField.getText());
				userGuess1 = userGuess;
				
				// Random number
				int n4 = 6;
				int randomNum = (int) (Math.random() * n4) + 1;
				
				// Send the random number back to the GUI
				randomNumTextField.setText(String.valueOf(randomNum));
				
				
				// Decide who wins 
				if (userGuess1 != randomNum){
					
					pointHolder = betPoints1 / 2;
					points = points - pointHolder;
					
					
					pointsTextField.setText(String.valueOf(points));
				}
				
				else if (userGuess1 == randomNum) {
					
					pointHolder = betPoints1 * 2;
					pointHolder = pointHolder - betPoints1;
					points = points + pointHolder;
					
				}
				
					
					
				
			
				
				
				
				// Code Ends Here	
			
			}
		});
		rollNumberButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rollNumberButton.setBounds(149, 207, 89, 23);
		frame.getContentPane().add(rollNumberButton);
		
		betPointsTextField = new JTextField();
		betPointsTextField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		betPointsTextField.setText("Bet Here");
		betPointsTextField.setBounds(10, 166, 86, 20);
		frame.getContentPane().add(betPointsTextField);
		betPointsTextField.setColumns(10);
		
		JLabel amountPointsLabel = new JLabel("Total Amount Of Points:");
		amountPointsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		amountPointsLabel.setBounds(21, 80, 134, 14);
		frame.getContentPane().add(amountPointsLabel);
		
		pointsTextField = new JTextField();
		pointsTextField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		pointsTextField.setBounds(149, 77, 86, 20);
		frame.getContentPane().add(pointsTextField);
		pointsTextField.setColumns(10);
		
		randomNumTextField = new JTextField();
		randomNumTextField.setText("Dice Number Will Appear Here");
		randomNumTextField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		randomNumTextField.setBounds(265, 209, 159, 20);
		frame.getContentPane().add(randomNumTextField);
		randomNumTextField.setColumns(10);
	}
}
