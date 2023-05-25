package mathmaurer.jeu;

import javax.swing.JFrame;

public class Main {
	public static Scene scene; // Toutes les classes ont access a l'objet scene (static)
	public static void main(String[] args) {
		// Creation of the application window
				JFrame fenetre = new JFrame("Jeu style Mario");
				fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fenetre.setSize(700, 360);
				fenetre.setLocationRelativeTo(null);
				fenetre.setResizable(false);
				fenetre.setAlwaysOnTop(true);
				// Instantiation of the scene object
				scene = new Scene();		
				fenetre.setContentPane(scene); // On associe la scene � la fen�tre de l'application
				fenetre.setVisible(true);
				System.out.println(Thread.activeCount());

	}

}
