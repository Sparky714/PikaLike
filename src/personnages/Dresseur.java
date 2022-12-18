package personnages;

import java.util.Random;

public class Dresseur {
	private String nom;
	private String title;
	private int moulaga;
	String [] phraseswin = {}; /*comme dab*/
	String [] phraseslose = {}; /*comme dab*/
	
	public Dresseur(String nom, String title, int moulaga) {
		this.nom = nom;
		this.title = title;
		this.moulaga = moulaga;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return title + nom + " : ";
	}
	
	public void win() {
		Random indice = new Random();
		int phrase = indice.nextInt(); /*mettre l'indice max*/
		parler(phraseswin[phrase]);
	}
	
	public void lose() {
		Random indice = new Random();
		int phrase = indice.nextInt(); /*mettre l'indice max*/
		parler(phraseslose[phrase]);
	}
}
