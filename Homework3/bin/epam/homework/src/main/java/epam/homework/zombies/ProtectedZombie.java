package epam.homework.zombies;

import epam.homework.enums.BodyProtection;
import epam.homework.enums.HeadProtection;
import epam.homework.enums.ZombieSpeed;

/**
 * 
 * Class holds ProtectedZombie attribute set.
 * @return ProtectedZombie
 *
 */
public class ProtectedZombie extends HardHatZombie {
	protected BodyProtection bodyProtection;

	public ProtectedZombie(String name, int toughtness, ZombieSpeed speed, HeadProtection hardHat, BodyProtection bodyProtection) {
		super(name, toughtness, speed, hardHat);
		this.bodyProtection = bodyProtection;
	}
	
	@Override
	public void move() {
		System.out.println("Here comes a " + getName() + "...");
	}
}
