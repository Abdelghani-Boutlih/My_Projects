package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TicTacToe extends JFrame implements ActionListener{
	 Random random=new Random(); 
	 JPanel panel_title=new JPanel();
	 JPanel button_panel=new JPanel();
	 JLabel textfield=new JLabel();
	 JButton[] buttons=new JButton[9];
	 boolean player1_turn;
public TicTacToe() {
	 setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	 setSize(600,600);
	 setLayout(new BorderLayout());
	 getContentPane().setBackground(Color.black); 
	 //creation of components
	 //text field properties
	 textfield.setBackground(new Color(25,25,25));
	 textfield.setForeground(new Color(25,255,0));
	 textfield.setFont(new Font("Ink Free",Font.BOLD,75));
	 textfield.setHorizontalAlignment(JLabel.CENTER);
	 textfield.setText("Tic-Tac-Toe");
	 textfield.setOpaque(true);
	 //title panel properties
	 panel_title.setLayout(new BorderLayout());
	 panel_title.setBounds(0,0,800,100);
	 panel_title.add(textfield);
	 add(panel_title,BorderLayout.NORTH);
	 //button panel properties
	 button_panel.setLayout(new GridLayout(3,3));
	 button_panel.setBackground(new Color(150,150,150));
	 add(button_panel); 
	 //buttons 
	 for(int i=0;i<9;i++) {
		buttons[i]=new JButton();
		button_panel.add(buttons[i]);
		buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
		buttons[i].setFocusable(false);
		buttons[i].addActionListener(this);
		}
	 setVisible(true);
	 first();
	 }
 

@Override
public void actionPerformed(ActionEvent e) {
	for(int i=0;i<9;i++) {
		if(e.getSource()==buttons[i]) {
			if(player1_turn) {
				if(buttons[i].getText()=="") {
					buttons[i].setForeground(new Color(255,0,0));
					buttons[i].setText("X");
					player1_turn=false;
					textfield.setText("O turn");
					check();}}
		else {
					if(buttons[i].getText()=="") {
					buttons[i].setForeground(new Color(0,0,255));
					buttons[i].setText("O");
					player1_turn=true;
					textfield.setText("X turn");
					check();
					}}}
		}// for close
		
}	
public void first() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) { 
		e.printStackTrace();
	}
	
	if(random.nextInt(2)==0) {
		player1_turn=true;
		textfield.setText("X turn");
	}
	else {
		player1_turn=false;
		textfield.setText("O turn");
	}
}
public void check() {
	if(buttons[0].getText()=="X" && 
			buttons[1].getText()=="X"&& 
			buttons[2].getText()=="X" ) {
		xwins(0,1,2);
	}
	if(buttons[0].getText()=="X" && 
			buttons[3].getText()=="X"&& 
			buttons[6].getText()=="X" ) {
		xwins(0,3,6);
	}
	if(buttons[2].getText()=="X" && 
			buttons[5].getText()=="X"&& 
			buttons[8].getText()=="X" ) {
		xwins(2,5,8);
	}
	if(buttons[0].getText()=="X" && 
			buttons[4].getText()=="X"&& 
			buttons[8].getText()=="X" ) {
		xwins(0,4,8);
	}
	if(buttons[2].getText()=="X" && 
			buttons[4].getText()=="X"&& 
			buttons[6].getText()=="X" ) {
		xwins(2,4,6);
		
		if(buttons[6].getText()=="X" && 
				buttons[7].getText()=="X"&& 
				buttons[8].getText()=="X" ) {
			xwins(6,7,8);}
	}
	//
	if(buttons[0].getText()=="O" && 
			buttons[1].getText()=="O"&& 
			buttons[2].getText()=="O" ) {
		owins(0,1,2);
	}
	if(buttons[0].getText()=="O" && 
			buttons[3].getText()=="O"&& 
			buttons[6].getText()=="O" ) {
		owins(0,3,6);
	}
	if(buttons[2].getText()=="O" && 
			buttons[5].getText()=="O"&& 
			buttons[8].getText()=="O" ) {
		owins(2,5,8);
	}
	if(buttons[0].getText()=="O" && 
			buttons[4].getText()=="O"&& 
			buttons[8].getText()=="O" ) {
		owins(0,4,8);
	}
	if(buttons[2].getText()=="O" && 
			buttons[4].getText()=="O"&& 
			buttons[6].getText()=="O" ) {
		owins(2,4,6);
	}
	if(buttons[6].getText()=="O" && 
			buttons[7].getText()=="O"&& 
			buttons[8].getText()=="O" ) {
		owins(6,7,8);}
}
public void xwins(int a,int b,int c) {
	buttons[a].setBackground(Color.green);
	buttons[b].setBackground(Color.green);
	buttons[c].setBackground(Color.green);
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
	}
	textfield.setText("X wins");
}
public void owins(int a,int b,int c) {
	buttons[a].setBackground(Color.green);
	buttons[b].setBackground(Color.green);
	buttons[c].setBackground(Color.green);
	for(int i=0;i<9;i++) {
		buttons[i].setEnabled(false);
	}
	textfield.setText("O wins");
}
}
