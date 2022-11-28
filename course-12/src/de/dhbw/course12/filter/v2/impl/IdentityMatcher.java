package de.dhbw.course12.filter.v2.impl;

import de.dhbw.course12.filter.v2.AnalysisCase;
import de.dhbw.course12.filter.v2.AnalysisDetail;
import de.dhbw.course12.filter.v2.MatchException;
import de.dhbw.course12.filter.v2.Matcher;
import de.dhbw.course12.filter.v2.MatcherChain;
import de.dhbw.course12.filter.v2.mock.Candidate;
import de.dhbw.course12.filter.v2.mock.Subject;

public class IdentityMatcher implements Matcher {

	@Override
	public void matches(AnalysisCase<Subject, Candidate> analysisCase,
			Candidate candidate, MatcherChain matcherChain) throws MatchException {
		
		Subject subject = analysisCase.getSubject();
		
		if (subject == null) {
			throw new MatchException();
		}
		
		if (subject.hashCode() == candidate.hashCode()) {
			System.err.println("'" + this + "' matches! Exiting chain ...");
			AnalysisDetail<Candidate> detail = new AnalysisDetail<Candidate>();
			detail.setCandidate(candidate);
			detail.setDirective(1);
			analysisCase.addUncommittedCandidate(detail);
			matcherChain.resetProgressIndex();
		} else {
			// proceed to next matcher representing another check-algorithm 
			System.out.println("'" + this + "' doesn't match ... proceeding to next matcher ...");
			matcherChain.proceed(analysisCase, candidate);
		}

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}

}