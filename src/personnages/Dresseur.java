package personnages;

import java.util.Random;

public class Dresseur {
	private String nom;
	private String title;
	protected int moulaga;
	String [] phraseswin = {}; /*comme dab*/
	String [] phraseslose = {}; /*comme dab*/
	private int insigne = 0;
	private int pokeAviable;
	
	public Dresseur(String nom, String title, int moulaga, int pokeAviable) {
		this.nom = nom;
		this.title = title;
		this.moulaga = moulaga;
		this.pokeAviable = pokeAviable;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return title + nom + " : ";
	}
	
	public void win() {
		this.insigne += 1;
	}
	
	public void lose() {
		parler("GAME OVER, veuillez recommencer pour terminer le jeu...");
	}
	
	public int getMoulaga() {
		return moulaga;
	}

	public void setMoulaga(int moulaga) {
		this.moulaga = moulaga;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the insigne
	 */
	public int getInsigne() {
		return insigne;
	}

	/**
	 * @return the pokeAviable
	 */
	public int getPokeAviable() {
		return pokeAviable;
	}

	/**
	 * @param pokeAviable the pokeAviable to set
	 */
	public void setPokeAviable(int pokeAviable) {
		this.pokeAviable = pokeAviable;
	}
	
}
