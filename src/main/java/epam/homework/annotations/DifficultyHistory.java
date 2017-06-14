package epam.homework.annotations;

import epam.homework.enums.GameDifficulty;

/**
 * 
 * Annotation is used for history storage of difficulty selection .
 * Contains Date annotation.
 * @Target(ElementType.CLASS)
 * @Retention(RetentionPolicy.RUNTIME)
 *
 */

public @interface DifficultyHistory {
	Date date();
	GameDifficulty difficulty();
}
