package de.dhbw.course9.filter.v1;

import de.dhbw.course9.filter.v1.mock.Candidate;
import de.dhbw.course9.filter.v1.mock.Subject;

public interface Filter {

	public void doFilter(Subject subject, Candidate candidate, FilterChain filterChain) throws FilterException;

}