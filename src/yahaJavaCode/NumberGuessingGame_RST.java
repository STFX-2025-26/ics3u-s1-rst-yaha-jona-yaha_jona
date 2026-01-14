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
	private JTextField userInputTextField;
	private JTextField userBetTextField;
	private JTextField amountPointsTextField;
	private JTextField computerNumTextField;

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
		instructionLabel.setBounds(70, 43, 315, 14);
		frame.getContentPane().add(instructionLabel);
		
		userInputTextField = new JTextField();
		userInputTextField.setText("Write Your Guess Here");
		userInputTextField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		userInputTextField.setBounds(10, 209, 116, 20);
		frame.getContentPane().add(userInputTextField);
		userInputTextField.setColumns(10);
		
		JButton rollNumberButton = new JButton("Roll Dice");
		rollNumberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rollNumberButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		rollNumberButton.setBounds(149, 207, 89, 23);
		frame.getContentPane().add(rollNumberButton);
		
		userBetTextField = new JTextField();
		userBetTextField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		userBetTextField.setText("Bet Here");
		userBetTextField.setBounds(10, 166, 86, 20);
		frame.getContentPane().add(userBetTextField);
		userBetTextField.setColumns(10);
		
		JLabel amountPointsLabel = new JLabel("Total Amount Of Points:");
		amountPointsLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		amountPointsLabel.setBounds(21, 80, 134, 14);
		frame.getContentPane().add(amountPointsLabel);
		
		amountPointsTextField = new JTextField();
		amountPointsTextField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		amountPointsTextField.setBounds(149, 77, 86, 20);
		frame.getContentPane().add(amountPointsTextField);
		amountPointsTextField.setColumns(10);
		
		computerNumTextField = new JTextField();
		computerNumTextField.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		computerNumTextField.setBounds(299, 210, 86, 20);
		frame.getContentPane().add(computerNumTextField);
		computerNumTextField.setColumns(10);
	}
}
