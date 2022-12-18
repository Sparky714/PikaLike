package fight;

import java.util.Random;

public class Attack {
	private int precision;
	private int power;
	private String type; /*physical or special*/
	
	public Attack(int precision, int power, String type) {
		this.precision = precision;
		this.power = power;
		this.type = type;
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
			int preDamage = critick * power; /*a compléter*/
			return preDamage;
		}else {
			return 0;
		}
	}
}
