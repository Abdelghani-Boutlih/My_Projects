package objets;

import java.awt.Image;

import javax.swing.ImageIcon;

import mathmaurer.jeu.Main;

public class Objet {
	private int largeur, hauteur; //dimensions de l'objet
	private int x, y; //position de l'objet
	protected Image imgObjet;
	protected ImageIcon icoObjet;
	
	//constructor
	public Objet(int x, int y,int largeur, int hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}
	//getters
	public int getLargeur() {return largeur;}
	public int getHauteur() {return hauteur;}
	public int getX() {return x;}
	public int getY() {return y;}
	public Image getImgObjet() {return imgObjet;}
	//setters
	public void setLargeur(int largeur) {this.largeur = largeur;}
	public void setHauteur(int hauteur) {this.hauteur = hauteur;}
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	//methods
	//pour gerer les deplacement des objets
	public void deplacement() {
		if(Main.scene.getxPos() >= 0){
			  this.setX(this.getX() - Main.scene.getDx());		
		    }
	}
}
