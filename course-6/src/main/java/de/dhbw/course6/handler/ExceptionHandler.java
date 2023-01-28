package de.dhbw.course6.handler;

public interface ExceptionHandler {

	/**
	 * Handles the specified exception.
	 * 
	 * @param exception The application specific ApplicationException to throw
	 */
	void handle(Exception exception);

}