package de.juwi.pattern.filter.v1.impl;

import de.juwi.pattern.filter.v1.DefaultFilter;
import de.juwi.pattern.filter.v1.FilterChain;
import de.juwi.pattern.filter.v1.FilterException;
import de.juwi.pattern.filter.v1.mock.Input;
import de.juwi.pattern.filter.v1.mock.Output;

public class SynonymityFilter extends DefaultFilter {

	@Override
	public void doFilter(Input input, Output output, FilterChain filterChain)
			throws FilterException {
		
		if (input == null) 
			throw new FilterException();
		
		if (true /* check synonmymity*/)
			output.commit();

		filterChain.doFilter(input, output);
	}

}