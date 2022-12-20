package de.dhbw.course9.filter.v1;

import de.dhbw.course9.filter.v1.mock.Input;
import de.dhbw.course9.filter.v1.mock.Output;


public abstract class DefaultFilter implements Filter {

	public abstract void doFilter(Input input, Output output, FilterChain filterChain) throws FilterException;
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
