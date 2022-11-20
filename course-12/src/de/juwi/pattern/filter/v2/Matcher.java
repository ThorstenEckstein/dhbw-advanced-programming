package de.juwi.pattern.filter.v2;

import de.juwi.pattern.filter.v2.mock.Candidate;
import de.juwi.pattern.filter.v2.mock.Subject;

public interface Matcher {

	public void matches(AnalysisCase<Subject, Candidate> analysisCase,
			Candidate output, MatcherChain filterChain) throws MatchException;

}