package bro_code;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage extends JFrame {
	public WelcomePage() {
		JLabel j1=new JLabel("Hello!You are welcome!");
		setLayout(null);
		setLocationRelativeTo(null);
		setSize(300,300);
		j1.setBounds(60,60,150,150);
		j1.setForeground(Color.green);
		add(j1);setResizable(false);
		setVisible(true);
	}
}
