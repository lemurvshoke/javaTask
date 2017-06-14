package epam.homework.zombies;

import epam.homework.enums.HeadProtection;
import epam.homework.enums.ZombieSpeed;

/**
 * 
 * Class holds HardHatZombie attribute set.
 * @return HardHatZombie
 *
 */
public class HardHatZombie extends Zombie {
	protected HeadProtection hardHat;

	public HardHatZombie(String name, int toughtness, ZombieSpeed speed, HeadProtection hardHat) {
		super(name, toughtness, speed);
		this.hardHat = hardHat;
	}
	
	@Override
	public void move() {
		System.out.println("Here comes a " + getName() + "...");
	}
}