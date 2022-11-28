package de.dhbw.course12.filter.v1.impl;

import de.dhbw.course12.filter.v1.DefaultFilter;
import de.dhbw.course12.filter.v1.FilterChain;
import de.dhbw.course12.filter.v1.FilterException;
import de.dhbw.course12.filter.v1.mock.Input;
import de.dhbw.course12.filter.v1.mock.Output;

public class IdentityFilter extends DefaultFilter {

	@Override
	public void doFilter(Input input, Output output, FilterChain filterChain)
			throws FilterException {
		
		if (input == null) 
			throw new FilterException();
		
		if (input.hashCode() == output.hashCode())
			output.commit();
		
		filterChain.doFilter(input, output);
	}

}