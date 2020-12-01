/**
 * Author name : ANUSHA R date: 02/11/2020 desc: testing compilation and running
 * Exception handler function for Age exception
 */

public class InvalidAgeException extends Exception {
	public InvalidAgeException() {
		super();
	}

	public InvalidAgeException(String msg) {
		super(msg);
	}
}