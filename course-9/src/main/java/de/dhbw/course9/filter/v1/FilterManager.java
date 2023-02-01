package de.dhbw.course9.filter.v1;

import de.dhbw.course9.filter.v1.mock.Subject;
import de.dhbw.course9.filter.v1.mock.Candidate;

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
	
	public void executeFilterChain(Subject subject, Candidate candidate) throws FilterException {
		filterChain.doFilter(subject, candidate);
	}

}