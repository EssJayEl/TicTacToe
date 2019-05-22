import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class GameWindow extends JFrame {

	private JPanel contentPane;

	int turn = 1;	//player 1 = X; player 2 = O
	int gameWin = 0; //0 = nobody wins; 1=player1 wins; 2 = player2 wins; 3 = draw
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow frame = new GameWindow();
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null, "Made By: TheGreatGamer999\nFor Feedback and Suggestions contact me at:\nsjawwadl@gmail.com");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JButton btnReset;
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JLabel turn_sayer;
	
	public GameWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnableButtons();
				turn = 1;
				gameWin = 0;
				Turn();
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");
				btn4.setText("");
				btn5.setText("");
				btn6.setText("");
				btn7.setText("");
				btn8.setText("");
				btn9.setText("");
			}
		});
		btnReset.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btnReset.setBounds(231, 24, 89, 23);
		contentPane.add(btnReset);
		
		btn1 = new JButton("");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ButtonClick(btn1);
			}
		});
		btn1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn1.setBounds(162, 86, 57, 35);
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn2);
			}
		});
		btn2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn2.setBounds(231, 86, 63, 35);
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn3);
			}
		});
		btn3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn3.setBounds(304, 86, 57, 35);
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn4);
			}
		});
		btn4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn4.setBounds(162, 132, 57, 35);
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn5);
			}
		});
		btn5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn5.setBounds(231, 132, 63, 35);
		contentPane.add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn6);
			}
		});
		btn6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn6.setBounds(304, 132, 57, 35);
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn7);
			}
		});
		btn7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn7.setBounds(162, 178, 57, 35);
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn8);
			}
		});
		btn8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn8.setBounds(231, 178, 63, 35);
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonClick(btn9);
			}
		});
		btn9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		btn9.setBounds(304, 178, 57, 35);
		contentPane.add(btn9);
		
		turn_sayer = new JLabel("Player 1's turn");
		turn_sayer.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 15));
		turn_sayer.setBounds(433, 92, 113, 75);
		contentPane.add(turn_sayer);
	}
	
	public void Check(){
		if (btn1.getText() == btn2.getText() && btn1.getText() == btn3.getText()){
			if (btn1.getText() == "X")
				gameWin = 1;
			else if (btn1.getText() == "O" )
				gameWin = 2;
		}
		else if(btn4.getText() == btn5.getText() && btn4.getText() == btn6.getText()){
			if (btn4.getText() == "X")
				gameWin = 1;
			else if (btn4.getText() == "O" )
				gameWin = 2;
		}
		else if(btn7.getText() == btn8.getText() && btn7.getText() == btn9.getText()){
			if (btn7.getText() == "X")
				gameWin = 1;
			else if (btn7.getText() == "O" )
				gameWin = 2;
		}
		else if(btn1.getText() == btn4.getText() && btn1.getText() == btn7.getText()){
			if (btn1.getText() == "X")
				gameWin = 1;
			else if (btn1.getText() == "O" )
				gameWin = 2;
		}
		else if(btn2.getText() == btn5.getText() && btn2.getText() == btn8.getText()){
			if (btn2.getText() == "X")
				gameWin = 1;
			else if (btn2.getText() == "O" )
				gameWin = 2;
		}
		else if(btn3.getText() == btn6.getText() && btn3.getText() == btn9.getText()){
			if (btn3.getText() == "X")
				gameWin = 1;
			else if (btn3.getText() == "O" )
				gameWin = 2;
		}
		else if(btn1.getText() == btn5.getText() && btn1.getText() == btn9.getText()){
			if (btn1.getText() == "X")
				gameWin = 1;
			else if (btn1.getText() == "O" )
				gameWin = 2;
		}
		else if(btn3.getText() == btn5.getText() && btn3.getText() == btn7.getText()){
			if (btn3.getText() == "X")
				gameWin = 1;
			else if (btn3.getText() == "O" )
				gameWin = 2;
		}
		else if(btn1.getText() != "" && btn2.getText() != "" && btn3.getText() != "" && btn4.getText() != "" && btn5.getText() != "" && btn6.getText() != "" && btn7.getText() != "" && btn8.getText() != "" && btn9.getText() != "") {
			gameWin = 3;
		}
		else gameWin = 0;
		Win();
	}
	
	public void ButtonClick(JButton btn){
		if (turn == 1 && btn.getText() == "") {
			btn.setText("X");
			turn = 2;
		}
		else if (turn == 2 && btn.getText() == ""){
			btn.setText("O");
			turn = 1;
		}
		btn.setEnabled(false);
		Turn();
		Check();
	
	}
	public void Win(){
		if(gameWin == 1){
			DisableButtons();
			JOptionPane.showMessageDialog(null,"Player 1 Wins!!");
		}
		else if (gameWin == 2){
			DisableButtons();
			JOptionPane.showMessageDialog(null,"Player 2 Wins!!");
		}
		else if (gameWin == 3){
			DisableButtons();
			JOptionPane.showMessageDialog(null,"It's a Draw!!");
		}
				
	}
	public void Turn(){
		if(turn == 1){
			turn_sayer.setText("Player 1's Turn" );
		}
		else if (turn == 2){
				turn_sayer.setText("Player 2's Turn");
			}
		}
	public void DisableButtons(){
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
	}
	
	public void EnableButtons(){
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
	}
}
	
