package de.dhbw.course9.filter.v1;

import de.dhbw.course9.filter.v1.mock.Subject;
import de.dhbw.course9.filter.v1.mock.Candidate;


public abstract class DefaultFilter implements Filter {

	public abstract void doFilter(Subject subject, Candidate candidate, FilterChain filterChain) throws FilterException;
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
