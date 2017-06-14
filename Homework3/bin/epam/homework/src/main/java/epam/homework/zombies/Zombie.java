package epam.homework.zombies;

import java.util.*;

import epam.homework.annotations.ItIsAZombieClass;
import epam.homework.enums.ZombieSpeed;
import epam.homework.interfaces.Movable;

/**
* @ItIsAZombieClass
* Class holds ProtectedZombie attribute set.
* @return ProtectedZombie
*/
public class Zombie implements Movable {
	protected String name;;
	protected int toughtness;
	protected ZombieSpeed speed;
	//protected int armyIndex;
	private static final int MIN = 0;
	private static final int MAX = 30;
	//ArrayList<Zombie> army = new ArrayList<>();

	public Zombie() {
	}

	public Zombie(String name, int toughtness, ZombieSpeed speed) {
		this.name = name;
		this.toughtness = toughtness;
		this.speed = speed;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setToughtness(int toughtness) {
		this.toughtness = toughtness;
	}

	public int getToughtness() {
		return toughtness;
	}

	public ZombieSpeed getSpeed() {
		return speed;
	}

	@Override
	public void move() {
		System.out.println("Here comes a " + getName() + "...");
	}

	/**
	 * Makes all zombie move.
	 * @param zombieArmy
	 */
	public static void letZombieMove(ArrayList<Zombie> zombieArmy) {
		for (Zombie zombie : zombieArmy) {
			zombie.move();
		}
	}

	/**
	 * 
	 * Inner class for comparing zombies by speed from low to high.
	 *
	 */
	class RisingSpeedCompare implements Comparator<Zombie> {
		@Override
		public int compare(Zombie one, Zombie two) {
			return one.getSpeed().compareTo(two.getSpeed());
		}
	}

	/**
	 * 
	 * Inner class for comparing zombies by speed from high to low.
	 *
	 */
	class DescendingSpeedCompare implements Comparator<Zombie> {
		@Override
		public int compare(Zombie one, Zombie two) {
			return two.getSpeed().compareTo(one.getSpeed());
		}
	}

	/**
	 * Method for comparing zombies by speed from low to high.
	 * @param ArrayList<Zombie>
	 */
	public void risingSortBySpeed(ArrayList<Zombie> army) {
		RisingSpeedCompare speedUp = new RisingSpeedCompare();
		Collections.sort(army, speedUp);
		for (Zombie zombie : army) {
			zombie.move();
		}
	}

	/**
	 * Method for comparing zombies by speed from high to low.
	 * @param ArrayList<Zombie>
	 */
	public void descendingSortBySpeed(ArrayList<Zombie> army) {
		DescendingSpeedCompare speedDown = new DescendingSpeedCompare();
		Collections.sort(army, speedDown);
		for (Zombie zombie : army) {
			zombie.move();
		}
	}

	/**
	 * Method for calculating whole army toughtness.
	 * @param ArrayList<Zombie>
	 */
	public void armyToughtness(ArrayList<Zombie> army) {
		int armyToughtnessSum = 0;
		for (Zombie zombie : army) {
			armyToughtnessSum += zombie.getToughtness();
		}
		System.out.println("Whole army toughtness is " + armyToughtnessSum);
	}

	/**
	 * Method for finding zombie by toughtness. Range: from 0 to 30.
	 * ArrayList<Zombie>
	 */
	public void findZombieByToughtness(ArrayList<Zombie> army) {
		System.out.println("Zombies in a range from 0 to 30: ");
		for (Zombie zombie : army) {
			if (zombie.getToughtness() >= MIN && zombie.getToughtness() <= MAX) {
				zombie.move();
			}
		}
	}
}
