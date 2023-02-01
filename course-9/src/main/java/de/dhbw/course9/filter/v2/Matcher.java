package de.dhbw.course9.filter.v2;

import de.dhbw.course9.filter.v2.mock.Candidate;
import de.dhbw.course9.filter.v2.mock.Subject;

public interface Matcher {

	public void matches(AnalysisCase<Subject, Candidate> analysisCase,
                        Candidate output, MatcherChain filterChain) throws MatchException;

}