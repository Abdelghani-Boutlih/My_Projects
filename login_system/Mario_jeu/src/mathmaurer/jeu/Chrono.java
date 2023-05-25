package mathmaurer.jeu;

public class Chrono implements Runnable {
	//**** VARIABLES ****//
    private final int PAUSE = 3; // temps d'attente en ms entre 2 tours de boucle
//Threads allows a program to operate more efficiently by doing multiple things at the same time
//Threads can be used to perform complicated tasks in the background without interrupting the main program
	@Override
	public void run(){		
		while(true){ // boucle infinie						
			// Instruction repetee a chaque tour de boucle			
			Main.scene.repaint();	// pour repaint la scene chaque tour de boucle		
			try{Thread.sleep(PAUSE);} // on arrete le flux principal pendant le temps egal a PAUSE (en ms)
			catch (InterruptedException e){}
		}		
	}
}
