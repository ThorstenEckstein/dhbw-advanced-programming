package de.dhbw.course9.filter.v1;

import de.dhbw.course9.filter.v1.mock.Input;
import de.dhbw.course9.filter.v1.mock.Output;

public interface Filter {

	public void doFilter(Input input, Output output, FilterChain filterChain) throws FilterException;

}