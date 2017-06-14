package epam.homework.gameSettings;

import java.util.*;
import epam.homework.annotations.DifficultyHistory;
import epam.homework.annotations.Date;
import epam.homework.enums.GameDifficulty;
import epam.homework.exceptions.IllegalDifficultyValueException;
import epam.homework.zombies.*;
import static epam.homework.enums.GameDifficulty.*;
import static epam.homework.enums.ZombieSpeed.*;
import static epam.homework.enums.BodyProtection.*;
import static epam.homework.enums.HeadProtection.*;

/**
 * 
 * @DifficultyHistory(date = @Date(year = 2017, month = 5, day = 16), difficulty = HARD)
 *
 */
public class DifficultySelection {
	static ArrayList<Zombie> zombieArmy = new ArrayList<>();

	/**
	 * Method is used for difficulty level input and set up of zombieArmy size. 
	 * @return ArrayList<Zombie>
	 */
	public static ArrayList<Zombie> setGameDifficulty() {
		System.out.println("Welcome to ZombieGame! \n" + "Please, select difficulty: \n" + "EASY | NORMAL | HARD");

		Scanner difficultyScanner = new Scanner(System.in);
		String input = difficultyScanner.nextLine();
		GameDifficulty difficulty = null;
		difficultyScanner.close();

		try {
			difficulty = GameDifficulty.valueOf(input.toUpperCase().trim());

			switch (difficulty) {
			case EASY:
				for (int i = 0; i < EASY.getDifficultyIndex(); i++) {
					zombieArmy.add(new Zombie("Zombie", 25, BASIC));
					zombieArmy.add(new Gargantuar("Gargantuar", 100, HUNGRY));
					zombieArmy.add(new HardHatZombie("ConeHeadZombie", 50, SLOW, CONE));
					zombieArmy.add(new HardHatZombie("BucketHeadZombie", 75, BARELY, BUCKET));
					zombieArmy.add(new ProtectedZombie("AllStarZombie", 75, FLIGHTY, FOOTBALL_HELMET, SHOULDER_PADS));
					zombieArmy.add(new ProtectedZombie("KnightZombie", 80, CREEPY, KNIGHT_HELMET, ARMOR));
				}
				break;
			case NORMAL:
				for (int i = 0; i < NORMAL.getDifficultyIndex(); i++) {
					zombieArmy.add(new Zombie("Zombie", 25, BASIC));
					zombieArmy.add(new Gargantuar("Gargantuar", 100, HUNGRY));
					zombieArmy.add(new HardHatZombie("ConeHeadZombie", 50, SLOW, CONE));
					zombieArmy.add(new HardHatZombie("BucketHeadZombie", 75, BARELY, BUCKET));
					zombieArmy.add(new ProtectedZombie("AllStarZombie", 75, FLIGHTY, FOOTBALL_HELMET, SHOULDER_PADS));
					zombieArmy.add(new ProtectedZombie("KnightZombie", 80, CREEPY, KNIGHT_HELMET, ARMOR));
				}
				break;
			case HARD:
				for (int i = 0; i < HARD.getDifficultyIndex(); i++) {
					zombieArmy.add(new Zombie("Zombie", 25, BASIC));
					zombieArmy.add(new Gargantuar("Gargantuar", 100, HUNGRY) {
						@Override
						public void move() {
							System.out.println("Here comes a Gargantuar...\n" + "...holly crap! It throws an Imp!!!");
						}
					});
					zombieArmy.add(new HardHatZombie("ConeHeadZombie", 50, SLOW, CONE));
					zombieArmy.add(new HardHatZombie("BucketHeadZombie", 75, BARELY, BUCKET));
					zombieArmy.add(new ProtectedZombie("AllStarZombie", 75, FLIGHTY, FOOTBALL_HELMET, SHOULDER_PADS));
					zombieArmy.add(new ProtectedZombie("KnightZombie", 80, CREEPY, KNIGHT_HELMET, ARMOR));
				}
				break;
			}
		} catch (IllegalArgumentException ex) {
			System.out.println("Invalid input, sorry. \nTry again! \n");
			throw new IllegalDifficultyValueException(ex);
		}

		return zombieArmy;
	}
}
