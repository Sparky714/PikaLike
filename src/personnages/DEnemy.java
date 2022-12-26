package personnages;

import java.util.Random;

public class DEnemy extends Dresseur{
	
	
	
	public DEnemy(String nom, String title, int moulaga, int pokeAviable) {
		super(nom, title, moulaga, pokeAviable);
	}
	
	
	public void lose() {
		Random indice = new Random();
		int phrase = indice.nextInt(); /*mettre l'indice max*/
		parler(phraseslose[phrase]);
		Dresseur.setMoulaga(Dresseur.getMoulaga() + DEnemy.moulaga);
		this.setMoulaga(0);
		Dresseur.win();
	}
	
	public void win() {
		Random indice = new Random();
		int phrase = indice.nextInt(); /*mettre l'indice max*/
		parler(phraseswin[phrase]);
		Dresseur.setMoulaga(Dresseur.getMoulaga() / 10);
		Dresseur.lose();
	}

}
