package bro_code;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Loginpage extends JFrame {
	HashMap<String,String> logininfo;
	public Loginpage(HashMap<String,String> logininfooriginal) {
		logininfo=logininfooriginal;
		  //creation of components
		JTextField usernametxt=new JTextField();
		JTextField passwordtxt=new JPasswordField();
		JLabel jlb1=new JLabel("user name:");
		JLabel jlb2=new JLabel("password:");
		JButton loginButton=new JButton("Log in");
		JButton resetButton=new JButton("Reset");
		JLabel messageLabel=new JLabel();
		//concerning frame informations
		setTitle("sign_in");
		setSize(300,400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);
      //placement of our components
		usernametxt.setBounds(20,120,200,20);
		jlb1.setBounds(20,100,200,20);
		passwordtxt.setBounds(20,170,200,20);
		jlb2.setBounds(20,150,200,20);
		resetButton.setBounds(100,200,70,20);
		loginButton.setBounds(20,200,70,20);
		messageLabel.setBounds(60,230,200,70);
		//add components to our window
		this.add(usernametxt);
		this.add(jlb1);
		this.add(passwordtxt);
		this.add(jlb2);
		this.add(loginButton);
		this.add(resetButton);
		add(messageLabel);
		//processing
		resetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==resetButton) {
					usernametxt.setText("");
					passwordtxt.setText("");
				}
				
			}
		});
		loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==loginButton) {
					String username=usernametxt.getText();
					String password=passwordtxt.getText();
				if(logininfo.containsKey(username)){
			       if(logininfo.get(username).equals(password)) {
			    	   messageLabel.setText("Login Successfull");
			    	   messageLabel.setForeground(Color.green);
			    	   dispose();
			    	   WelcomePage w=new WelcomePage();
			       }
			       else {
			    	   messageLabel.setBounds(80,230,200,70);
			    	   messageLabel.setText("Password_Error");
			    	   messageLabel.setForeground(Color.red);
			       }
		}
				else {
					   messageLabel.setBounds(80,230,200,70);
			    	   messageLabel.setText("User name not found");
			    	   messageLabel.setForeground(Color.red);
				}
				}
				
			}
		});
		//visibility
		setVisible(true);
		}
			
		
	}
	


