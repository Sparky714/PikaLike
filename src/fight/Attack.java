package fight;

import pocket.PocketMonsters;
import personnages.*;
import java.util.Random;

public class Attack {
	private int precision;
	private int power;
	
	public Attack(int precision, int power, String type) {
		this.precision = precision;
		this.power = power;
	}
	
	public boolean doesThatHit(int precision) {
		if(precision == 100) {
			return true;
		}
		Random hit = new Random();
		int ran = hit.nextInt(100);
		if (ran > precision) {
			return false;
		}
		return true;
	}
	
	public int isItACrit() {
		Random crit = new Random();
		int coup = crit.nextInt(100);
		if(coup > 10) {
			return 1;
		}
		return 2;
	}
	
	public int preDamage() {
		if(doesThatHit(precision)) {
			int critick = isItACrit();
			int preDamage = critick * power * PocketMonsters.boost();
			return preDamage;
		}else {
			return 0;
		}
	}
	
	public void damage(PocketMonsters attaquant, PocketMonsters defense) {
		int predamage = preDamage() * attaquant.getAttack();
		defense.setPv(2*defense.getDef() - predamage);
		if(defense.getPv() <= 0) {
			defense.setPv(0);
			if(defense.getNomDresseur() == Dresseur.getNom()) {
				Dresseur.setPokeAviable(Dresseur.getPokeAviable() - 1);
				if(Dresseur.getPokeAviable() == 0) {
					DEnemy.win();
				}
			}else {
				DEnemy.pokeaviable -= 1;
				if(DEnemy.pokeAviable == 0) {
					DEnemy.lose();
				}
			}
		}
	}
}
