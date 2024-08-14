package DESAFIO_COMBATE;

import java.util.Random;

public class Champion {

	String name;
	private int life;
	private int armor;
	private int attack;

	public Champion(String name, int life, int attack, int armor) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public int getAttack() {
		return attack;
	}

	public int setAttack() {
		return attack;
	}

	public int getArmor() {
		return armor;
	}

	public void battle(Champion opponent) {
		if (this.getArmor() > opponent.getAttack()) {
			this.life = this.life - 1;
		} else {
			this.life = this.life + this.armor - opponent.getAttack();
		}

	}

	public String Status() {
		if (this.life > 0) {
			return this.name + ":" + this.life + " de vida, " + this.attack + " de força, " + this.armor
					+ " de armadura";
		} else {
			return this.name + ":" + this.life + " de vida, " + this.attack + " de força, " + this.armor
					+ " de armadura (morto)";
		}

	}

}
