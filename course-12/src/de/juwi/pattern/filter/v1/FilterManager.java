package de.juwi.pattern.filter.v1;

import de.juwi.pattern.filter.v1.mock.Input;
import de.juwi.pattern.filter.v1.mock.Output;

public class FilterManager {

	private FilterChain filterChain = new FilterChain();

	public void addFilter(Filter filter) {
		filterChain.add(filter);
	}
	
	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}
	
	public void executeFilterChain(Input input, Output output) throws FilterException {
		filterChain.doFilter(input, output);
	}

}