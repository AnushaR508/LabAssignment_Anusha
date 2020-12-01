/**
 * Author name : ANUSHA R date: 02/11/2020 desc: testing compilation and running
 * Exception handler function for Invalid name exception
 */

public class InvalidNameException extends Exception {
	public InvalidNameException() {
		super();
	}

	public InvalidNameException(String msg) {
		super(msg);
	}
}