package de.juwi.pattern.filter.v1;

import de.juwi.pattern.filter.v1.mock.Input;
import de.juwi.pattern.filter.v1.mock.Output;


public abstract class DefaultFilter implements Filter {

	public abstract void doFilter(Input input, Output output, FilterChain filterChain) throws FilterException;
	
	public String toString() {
		return this.getClass().getSimpleName();
	}

}
