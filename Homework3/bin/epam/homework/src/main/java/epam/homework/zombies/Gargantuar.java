package epam.homework.zombies;

import epam.homework.enums.ZombieSpeed;
import epam.homework.interfaces.Movable;

/**
 * 
 * Class holds Gargantuar attribute set.
 * @return Gargantuar
 */
public class Gargantuar extends Zombie implements Movable {
	public Gargantuar(String name, int toughtness, ZombieSpeed speed) {
		super(name, toughtness, speed);
	}
	
	@Override
	public void move() {
		System.out.println("Here comes a Gargantuar...");
	}
}
