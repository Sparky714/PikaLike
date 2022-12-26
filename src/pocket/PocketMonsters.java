package pocket;

import personnages.*;

public class PocketMonsters {
	private String name;
	private int pv;
	private int level;
	private int attack;
	private int def;
	private int speed;
	private int spea;
	private int sped;
	private String nomDresseur;
	
	public PocketMonsters(String name, int level, int attack, int def, int speed, int spea, int sped, int pv, String nomDresseur) {
		this.name = name;
		this.level = level;
		this.attack = attack;
		this.def = def;
		this.speed = speed;
		this.spea = spea;
		this.sped = sped;
		this.pv = pv;
		this.nomDresseur = nomDresseur;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @return the spea
	 */
	public int getSpea() {
		return spea;
	}

	/**
	 * @return the sped
	 */
	public int getSped() {
		return sped;
	}

	/**
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}

	/**
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}

	/**
	 * @return the nomDresseur
	 */
	public String getNomDresseur() {
		return nomDresseur;
	}
	
	public int boost() {
		int boost;
		if(Dresseur.insigne < 4) {
			return boost = Dresseur.insigne / 10 + 1;
		}else {
			return boost = 15 / 10;
		}
	}
	
}
