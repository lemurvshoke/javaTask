package epam.homework.gameSettings;

import static epam.homework.gameSettings.DifficultySelection.*;
import epam.homework.zombies.*;

/**
 * 
 * Main class is used for application start.
 *
 */
public class Main {
	public static void main(String[] args) {
		setGameDifficulty();
		Zombie zombie = new Zombie();
		zombie.risingSortBySpeed(zombieArmy);
		zombie.armyToughtness(zombieArmy);
		zombie.findZombieByToughtness(zombieArmy);	
	}
}
	