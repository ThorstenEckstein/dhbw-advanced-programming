package de.dhbw.course12.template;

public class MyBusinessService extends AbstractBusinessService {
	
	// concrete 'read'
	protected String read() {
		
		/*
		 * ...
		 * some read process: e.g. from file, from service, from database
		 * ...
		 */
		
		// here: example String meant as 'property key'
		return "resource.translation.de.DE";
	}
	
	// concrete 'write'
	protected boolean write() {
		boolean transactionSuccess = true;
		
		/*  ...
		 *  some write process: e.g. to file, to service, to database
		 *  ...
		 */
		
		return transactionSuccess;
	}

}