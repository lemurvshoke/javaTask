package epam.homework.enums;

/**
 * 
 * Enum holds game difficulty levels.
 *
 */
public enum GameDifficulty {
	EASY(1), NORMAL(2), HARD(3);

	protected int difficultyIndex;

	GameDifficulty(int difficultyIndex) {
		this.difficultyIndex = difficultyIndex;		
	}

	public int getDifficultyIndex() {
		return difficultyIndex;
	}	
}