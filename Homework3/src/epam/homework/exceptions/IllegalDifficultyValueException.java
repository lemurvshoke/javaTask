package epam.homework.exceptions;

/**
 * 
 * Unchecked exception based on IllegalArgumentException.
 *
 */
@SuppressWarnings("serial")
public class IllegalDifficultyValueException extends IllegalArgumentException {
	public IllegalDifficultyValueException(IllegalArgumentException e) {
		initCause(e);		
	}
}
